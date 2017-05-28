/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemeventcheckbox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

/**
 *
 * @author cgallinaro
 */
public class ItemEventCheckboxListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox source = (JCheckBox) e.getItemSelectable();

        if (e.getStateChange() == ItemEvent.DESELECTED) {
            System.out.println(source.getText() + " is deselected");
        } else {
            System.out.println(source.getText() + " is selected");
        }
    }

}
