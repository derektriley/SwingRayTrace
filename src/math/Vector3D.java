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
public class Vector3D {
    
    public double x;
    public double y;
    public double z;
    
    public Vector3D() {}
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vector3D(double value) {
        this.x = value;
        this.y = value;
        this.z = value;
    }
    
    public Vector3D add(Vector3D v) {
        Vector3D temp = new Vector3D();
        temp.x = x + v.x;
        temp.y = y + v.y;
        temp.z = z + v.z;
        return temp;
    }
    
    public Vector3D sub(Vector3D v) {
        Vector3D temp = new Vector3D();
        temp.x = x - v.x;
        temp.y = y - v.y;
        temp.z = z - v.z;
        return temp;
    }
    
    public Vector3D mult(double value) {
        Vector3D temp = new Vector3D();
        temp.x = x * value;
        temp.y = y * value;
        temp.z = z * value;
        return temp;
    }
    
    public double dot(Vector3D v) {
        return (x * v.x) + (y * v.y) + (z * v.z);
    }
    
    public double mag() {
        return Math.sqrt(dot(this));
    }
    
    public Vector3D normalize() {
        Vector3D temp = new Vector3D();
        double invMag = 1.0d/mag();
        temp.x = x  * invMag;
        temp.y = y * invMag;
        temp.z = z * invMag;
        return temp;
    }
    
    
}
