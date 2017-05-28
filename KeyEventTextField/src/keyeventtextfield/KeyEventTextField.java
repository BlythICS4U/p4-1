/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyeventtextfield;

import javax.swing.JFrame;

/**
 *
 * @author cgallinaro
 */
public class KeyEventTextField {
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame f = new JFrame("TextFieldDemo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(425, 150);
        
        KeyEventTextFieldJPanel panel = new KeyEventTextFieldJPanel();
        panel.initTextField();
        f.add(panel);
        f.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
