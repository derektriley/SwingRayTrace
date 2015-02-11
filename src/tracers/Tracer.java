/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracers;

import math.Ray;
import utility.RGBColor;
import world.World;

/**
 *
 * @author Derek
 */
public abstract class Tracer {
    
    protected World world;
    
    public Tracer() {}
    
    public Tracer(World world) {
         this.world = world;
    }
    
    public abstract RGBColor trace_ray(final Ray ray);
    
    public abstract RGBColor trace_ray(final Ray ray, final int depth);
    
}
