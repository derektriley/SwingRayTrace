/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Derek
 */
public class RenderPanel extends JPanel {
    
    public BufferedImage image;
    
    public RenderPanel(int x, int y) {
       image = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
    
}
