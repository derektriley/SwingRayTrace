/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author Derek
 */
public class Point3D {
    
    public double x, y, z;
    
    public Point3D() {}
    
    public Point3D(final double a) {
        this.x = a;
        this.y = a;
        this.z = a;
    }
    
    public Point3D(final double a, final double b, final double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }
    
    public Vector3D sub(Point3D p) {
        Vector3D temp = new Vector3D();
        temp.x = x - p.x;
        temp.y = y - p.y;
        temp.z = z - p.z;
        return temp;
    }
    
    public Point3D add(Vector3D v) {
        Point3D temp = new Point3D();
        temp.x = x + v.x;
        temp.y = y + v.y;
        temp.z = z + v.z;
        return temp;
    }
    
    public Point3D sub(Vector3D v) {
        Point3D temp = new Point3D();
        temp.x = x - v.x;
        temp.y = y - v.y;
        temp.z = z - v.z;
        return temp;
    }
    
    public Point3D mult(final double a) {
        Point3D temp = new Point3D();
        temp.x = x * a;
        temp.y = y * a;
        temp.z = z * a;
        return temp;
    }
    
    public double d_squared(final Point3D p) {
        return Math.pow(distance(p), 2.0d);
    }
    
    public double distance(final Point3D p) {
        return Math.sqrt(((p.x - x) * (p.x - x)) + ((p.y - y) * (p.y - y)) + ((p.z - z) * (p.z - z)));
    }
    
}
