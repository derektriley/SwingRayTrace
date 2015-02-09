/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author Derek
 */
public class RGBColor {
    
    public float r, g, b;
    
    public RGBColor() {}
    
    public RGBColor(float c) {
        this.r = c;
        this.g = c;
        this.b = c;
    }
    
    public RGBColor(float _r, float _g, float _b) {
        this.r = _r;
        this.g = _g;
        this.b = _b;
    }
    
    public RGBColor add(RGBColor c) {
        RGBColor temp = new RGBColor();
        temp.r = r + c.r;
        temp.g = g + c.g;
        temp.b = b + c.b;
        return temp;
    }
    
    public RGBColor mult(float a) {
        RGBColor temp = new RGBColor();
        temp.r = r * a;
        temp.g = g * a;
        temp.b = b * a;
        return temp;
    }
    
    public RGBColor div(float a) {
        RGBColor temp = new RGBColor();
        temp.r = r / a;
        temp.g = g / a;
        temp.b = b / a;
        return temp;
    }
    
    public RGBColor mult(RGBColor c) {
        RGBColor temp = new RGBColor();
        temp.r = r * c.r;
        temp.g = g * c.g;
        temp.b = b * c.b;
        return temp;
    }
    
    public RGBColor powc(float p) {
        RGBColor temp = new RGBColor();
        temp.r = (float) Math.pow(r, p);
        temp.g = (float) Math.pow(g, p);
        temp.b = (float) Math.pow(b, p);
        return temp;
    }
    
    public float average() {
        return (0.3333333333f * (r + g + b));
    }
    
}
