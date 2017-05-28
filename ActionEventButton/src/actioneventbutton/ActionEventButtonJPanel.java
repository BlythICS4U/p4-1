/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actioneventbutton;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class ActionEventButtonJPanel extends JPanel {
    
    public void initButton() {
        JButton button = new JButton("Click Me");
        button.setPreferredSize(new Dimension(200, 80));
        add(button);
        button.addActionListener(new ActionEventButtonListener()); // Registering an action listener
    }
    
}
