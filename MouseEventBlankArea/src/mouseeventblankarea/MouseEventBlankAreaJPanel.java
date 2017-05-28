/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseeventblankarea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author cgallinaro
 */
public class MouseEventBlankAreaJPanel extends JPanel {
    
    private BlankArea blankArea;
    private JTextArea textArea;
    
    public void initArea() {
        blankArea = new BlankArea();
        blankArea.initBlankArea(Color.YELLOW);
        add(blankArea);
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(800, 800));
        add(scrollPane);
         
        //Register for mouse events on blankArea and the panel.
        MouseEventListener listener = new MouseEventListener(textArea);
        blankArea.addMouseListener(listener);
        addMouseListener(listener);
        setPreferredSize(new Dimension(450, 450));
    }
}
