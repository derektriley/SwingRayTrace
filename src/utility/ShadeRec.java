/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import math.Normal;
import math.Point3D;
import world.World;

/**
 *
 * @author Derek
 */
public class ShadeRec {
    
    public boolean hit_an_object;
    public Point3D local_hit_point;
    public Normal normal;
    public RGBColor color;
    public World w;
    
    public ShadeRec(World w) {
        this.w = w;
        hit_an_object = false;
        normal = new Normal();
        local_hit_point = new Point3D();
        color = new RGBColor(RGBColor.black);
    }
    
}
