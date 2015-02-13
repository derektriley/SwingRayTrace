/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracers;

import math.Ray;
import utility.RGBColor;
import utility.ShadeRec;
import world.World;

/**
 *
 * @author Derek
 */
public class SingleSphere extends Tracer {

    public World world_ptr;
    
    public SingleSphere(World w) {
        this.world_ptr = w;
    }
    
    @Override
    public RGBColor trace_ray(Ray ray) {
        ShadeRec sr = new ShadeRec(world_ptr); //not used
        double t = 0.0d; //not used
        
        if (world_ptr.sphere.hit(ray, t, sr)) {
            return RGBColor.red;
        } else {
            return RGBColor.black;
        }
    }

    @Override
    public RGBColor trace_ray(Ray ray, int depth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
