/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import math.Point3D;
import math.Ray;
import utility.ShadeRec;

/**
 *
 * @author Derek
 */
public class Sphere extends GeometricObject {
    
    private Point3D center;
    private double radius;
    private static final double kEpsilon = 0.0d; //for shadows and secondary rays

    public Sphere(Point3D center, double r) {
        this.center = center;
        this.radius = r;
    }
    
    public void set_center(Point3D c) {
        this.center = c;
    }
    
    public void set_center(double x, double y, double z) {
        this.center = new Point3D(x, y, z);
    }
    
    public void set_radius(double r) {
        this.radius = r;
    }
    
    @Override
    public boolean hit(Ray ray, double t, ShadeRec s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
