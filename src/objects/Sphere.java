/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import math.Normal;
import math.Point3D;
import math.Double;
import math.Ray;
import math.Vector3D;
import utility.ShadeRec;

/**
 *
 * @author Derek
 */
public class Sphere extends GeometricObject {
    
    private Point3D center;
    private double radius;
    private static final double kEpsilon = 0.0d; //for shadows and secondary rays

    public Sphere() {}
    
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
    public boolean hit(Ray ray, Double tmin, ShadeRec sr) {
        double t;
        Vector3D temp = ray.o.sub(center);
        double a = ray.d.dot(ray.d);
        double b = ray.d.dot(temp) * 2.0d;
        double c = temp.dot(temp) - radius * radius;
        double disc = b * b - 4.0d * a * c;
        
        if (disc < 0.0d) {
            return false;
        } else {
            double e  = Math.sqrt(disc);
            double denom = 2.0d * a;
            t = (-b - e) / denom; //smaller root
            
            if (t > kEpsilon) {
                tmin.d = t;
                sr.normal = new Normal(temp.add(ray.d.mult(t)));
                sr.local_hit_point = ray.o.add(ray.d.mult(t));
                return true;
            }
            
            t = (-b + e) / denom; //larger root
            
            if (t > kEpsilon) {
                tmin.d = t;
                sr.normal = new Normal(temp.add(ray.d.mult(t)));
                sr.local_hit_point = ray.o.add(ray.d.mult(t));
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
