/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import math.Ray;
import math.Double;
import utility.RGBColor;
import utility.ShadeRec;

/**
 *
 * @author Derek
 */
public abstract class GeometricObject {
    
    protected RGBColor color;
    
    public GeometricObject() {}
    
    public abstract boolean hit(Ray ray, Double t, ShadeRec s);
    
    public void set_color(RGBColor c) {
        this.color = c;
    }
    
    public void set_color(float r, float g, float b) {
        color = new RGBColor(r, g, b);
    }
    
    
}
