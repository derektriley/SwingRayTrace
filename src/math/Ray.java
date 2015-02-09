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
public class Ray {
    
    public Point3D o; //Origin
    public Vector3D d; //Direction
    
    public Ray() {}
    
    public Ray(final Point3D origin, final Vector3D dir) {
        this.o = origin;
        this.d = dir;
    }
    
}
