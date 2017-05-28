/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseeventblankarea;

import javax.swing.JFrame;

/**
 *
 * @author cgallinaro
 */
public class MouseEventBlankArea {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame f = new JFrame("MouseEventDemo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200, 800);
        
        MouseEventBlankAreaJPanel panel = new MouseEventBlankAreaJPanel();
        panel.initArea();
        f.add(panel);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
