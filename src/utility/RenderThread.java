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

/**
 *
 * @author Derek
 */
public class RenderThread implements Runnable {

    private final int start_x;
    private final int start_y;
    private final RenderPanel drawPanel;
    
    public RenderThread(int start_x, int start_y, RenderPanel drawPanel) {
        this.start_x = start_x;
        this.start_y = start_y;
        this.drawPanel = drawPanel;
    }
    
    @Override
    public void run() {
        for (int i = start_y; i < start_y + (drawPanel.image.getHeight() / 4); i++) {
            for (int j = start_x; j < start_x + (drawPanel.image.getWidth() / 2); j++) {
                try {
                    drawPanel.image.setRGB(j, i, com.sun.prism.paint.Color.RED.getIntArgbPre());
                } catch(java.lang.ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                    System.out.println(i + " " + j);
                }
                drawPanel.repaint();
            }
        }
    }
    
}
