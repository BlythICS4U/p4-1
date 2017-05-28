/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemeventcheckbox;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class ItemEventCheckboxJPanel extends JPanel {
    
    JCheckBox aButton;
    JCheckBox bButton;
    JCheckBox cButton;
    JCheckBox dButton;
    
    public void initCheckBoxes() {
 
        //Create the check boxes.
        aButton = new JCheckBox("Choice A");
        aButton.setSelected(true);
 
        bButton = new JCheckBox("Choice B");
        bButton.setSelected(true);
 
        cButton = new JCheckBox("Choice C");
        cButton.setSelected(true);
 
        dButton = new JCheckBox("Choice D");
        dButton.setSelected(true);
 
        //Register a listener for the check boxes.
        ItemEventCheckboxListener listener = new ItemEventCheckboxListener();
        aButton.addItemListener(listener);
        bButton.addItemListener(listener);
        cButton.addItemListener(listener);
        dButton.addItemListener(listener);
 
        //Put the check boxes in a column in a panel
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(aButton);
        checkPanel.add(bButton);
        checkPanel.add(cButton);
        checkPanel.add(dButton);
 
        add(checkPanel);
    }

}
