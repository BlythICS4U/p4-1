/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actioneventbutton;

import javax.swing.JFrame;

/**
 *
 * @author cgallinaro
 */
public class ActionEventButton {

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Beeping Button");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(425, 150);
        
        ActionEventButtonJPanel panel = new ActionEventButtonJPanel();
        panel.initButton();
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
