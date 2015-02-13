/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.awt.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import ui.RenderPanel;
import world.World;

/**
 *
 * @author Derek
 */
public class RenderManager implements Runnable {

    private final RenderPanel drawPanel;
    private JLabel time;
    
    public RenderManager(RenderPanel drawPanel, JLabel time) {
        this.drawPanel = drawPanel;
        this.time = time;
    }
    
    
    @Override
    public void run() {
        ArrayList<Thread> threads = new ArrayList<>();
        
        //8 Threads for my AMD FX-8350
//        for (int j = 0; j < 2; j++) {
//            for (int i = 0; i < 4; i++) {
//                Thread temp = new Thread(new RenderThread((drawPanel.image.getWidth() / 2) * j, (drawPanel.image.getHeight() / 4) * i, drawPanel));
//                threads.add(temp);
//            }
//        }
        

        long startTime = System.currentTimeMillis();
        
//        threads.stream().forEach((t) -> {
//            t.start();
//        });
        
//        synchronized(threads){
//            try {
//                for (Thread t : threads) {
//                    t.join();
//                }
//            } catch (InterruptedException ex) {
//                Logger.getLogger(RenderManager.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        World w = new World();
        w.build();
        w.paintArea = drawPanel;
        w.render_scene();
        
        
        long endTime = System.currentTimeMillis();
        float totalTime = (endTime - startTime)/1000.0f;
        time.setText(Float.toString(totalTime));
        
    }
    
}
