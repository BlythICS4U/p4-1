/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actioneventbutton;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cgallinaro
 */
public class ActionEventButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("CLICK ME!");
        Toolkit.getDefaultToolkit().beep();
    }

}
