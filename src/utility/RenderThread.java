/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import ui.RenderPanel;
import world.World;

/**
 *
 * @author Derek
 */
public class RenderThread implements Runnable {

    private final int start_x;
    private final int start_y;
    private final RenderPanel drawPanel;
    private World w;
    
    public RenderThread(int start_x, int start_y, RenderPanel drawPanel, World w) {
        this.start_x = start_x;
        this.start_y = start_y;
        this.drawPanel = drawPanel;
        this.w = w;
    }
    
    @Override
    public void run() {
        w.render_scene(start_x, start_y);
    }
    
}
