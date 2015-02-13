/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import math.Point3D;
import math.Ray;
import math.Vector3D;
import objects.GeometricObject;
import objects.Sphere;
import tracers.SingleSphere;
import tracers.Tracer;
import ui.RenderPanel;
import utility.RGBColor;
import utility.ShadeRec;

/**
 *
 * @author Derek
 */
public class World {
    
    public ViewPlane vp;
    public RGBColor background_color;
    public Tracer tracer_ptr;
    public Sphere sphere; //for chapter 3 only
    public List<GeometricObject> objects;
    public RenderPanel paintArea;
    
    public World() {
        vp = new ViewPlane();
        sphere = new Sphere();
        objects = new ArrayList<>();
    }
    
    public void add_object(GeometricObject object) {
        objects.add(object);
    }
    
    public void build() {
        vp.set_hres(200);
        vp.set_vres(200);
        vp.set_pixel_size(1.0f);
        vp.set_gamma(1.0f);
        
        background_color = RGBColor.white;
        tracer_ptr = new SingleSphere(this);
        
        sphere.set_center(0.0d, 0.0d, 0.0d);
        sphere.set_radius(85);
    }
    
    public void render_scene() {
        RGBColor pixel_color;
        Ray ray = new Ray();
        int hres = vp.hres;
        int vres = vp.vres;
        float s = vp.s;
        float zw = 100.0f; //hardwired in
        
        ray.d = new Vector3D(0.0f, 0.0f, -1.0f);
        
        for (int r  = 0; r < vres; r++) { //up
            for (int c = 0; c <= hres; c++) { //across
                ray.o = new Point3D(s * (c - hres / 2.0f + 0.5f), s * (r- vres / 2.0f + 0.5), zw);
                pixel_color = tracer_ptr.trace_ray(ray);
                display_pixel(r, c, pixel_color);
            }
        }
    }
        
    public void render_scene(int start_x, int start_y) {
        
    }
    
    public RGBColor max_to_one(RGBColor c) {
        float max_value = Math.max(c.r, Math.max(c.g, c.b));
        
        if (max_value > 1.0f) {
            return (c.div(max_value));
        } else {
            return c;
        }
    }
    
    public RGBColor clamp_to_color(RGBColor raw_color) {
        RGBColor c = new RGBColor(raw_color);
        
        if (raw_color.r > 1.0f || raw_color.g > 1.0f || raw_color.b > 1.0f) {
            c.r = 1.0f; c.g = 0.0f; c.b = 0.0f;
        }
        return c;
    }
    
    public void display_pixel(final int row, final int column, final RGBColor raw_color) {
        RGBColor mapped_color;
        
        if (vp.show_out_of_gamut) {
            mapped_color = clamp_to_color(raw_color);
        } else {
            mapped_color = max_to_one(raw_color);
        }
        
        if (vp.gamma != 1.0f) {
            mapped_color.powc(vp.inv_gamma);
        }
        Color c  = new Color(mapped_color.r, mapped_color.g, mapped_color.b);
        paintArea.image.setRGB(column, vp.vres - row - 1, c.getRGB());
        paintArea.repaint();
    }
    
    public ShadeRec hit_bare_bones_objects(final Ray ray) {
        return null;
    }
    
    private void delete_objects() {
        objects.clear();
    }
    
}
