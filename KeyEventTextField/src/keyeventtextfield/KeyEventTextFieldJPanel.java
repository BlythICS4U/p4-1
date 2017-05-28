/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyeventtextfield;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cgallinaro
 */
public class KeyEventTextFieldJPanel extends JPanel {
    
    public void initTextField() {
        JTextField textField = new JTextField(20);
        textField.addKeyListener(new KeyEventTextFieldListener());
        add(textField);
    }

}
