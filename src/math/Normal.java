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
public class Normal {
    
    public double x, y, z;
    
    public Normal() {}
    
    public Normal(double a) {
        this.x = a;
        this.y = a;
        this.z = a;
    }
    
    public Normal(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }
    
    public Normal(Vector3D v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }
    
    
    
    
    
    
}
