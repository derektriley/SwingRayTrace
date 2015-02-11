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
public class SingleSphere extends Tracer {

    public World world;
    
    public SingleSphere(World w) {
        this.world = w;
    }
    
    @Override
    public RGBColor trace_ray(Ray ray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RGBColor trace_ray(Ray ray, int depth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
