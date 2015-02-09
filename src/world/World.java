/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.awt.Color;
import java.util.List;
import math.Ray;
import objects.GeometricObject;
import objects.Sphere;
import tracers.Tracer;
import ui.RenderPanel;
import utility.ShadeRec;

/**
 *
 * @author Derek
 */
public class World {
    
    public ViewPlane vp;
    public Color background_color;
    public Tracer tracer;
    public Sphere sphere; //for chapter 3 only
    public List<GeometricObject> objects;
    public RenderPanel paintArea;
    
    public World() {}
    
    public void add_object(GeometricObject object) {
        objects.add(object);
    }
    
    public void build() {
        
    }
    
    public void render_scene() {
    
    }
 
    public void render_scene(int start_x, int start_y) {
        
    }
    
    public Color max_to_one(Color c) {
        return null;
    }
    
    public Color clamp_to_color(Color c) {
        return null;
    }
    
    public void display_pixel(final int row, final int column, final Color pixel_color) {
        
    }
    
    public ShadeRec hit_bare_bones_objects(final Ray ray) {
        return null;
    }
    
    private void delete_objects() {
        objects.clear();
    }
    
}
