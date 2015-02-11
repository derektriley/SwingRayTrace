/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

/**
 *
 * @author Derek
 */
public class ViewPlane {
    
    public int hres; //horizontal image resolution
    public int vres; //vertical image resolution
    public float s; //pixel size
    public float gamma; //gamma correction factor
    public float inv_gamma; //inverse of gamma
    public boolean show_out_of_gamut; //display red if RGBColor out of gamut
    
    public ViewPlane() {}
    
    public void set_hres(final int h_res) {
        this.hres = h_res;
    }
    
    public void set_vres(final int v_res) {
        this.vres = v_res;
    }
    
    public void set_pixel_size(final float size) {
        this.s = size;
    }
    
    public void set_gamma(final float g) {
        this.gamma = g;
        this.inv_gamma = 1.0f/g;
    }
    
    public void set_gamut_display(final boolean show) {
        this.show_out_of_gamut = show;
    }
    
}
