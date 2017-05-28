/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseeventblankarea;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextArea;

/**
 *
 * @author cgallinaro
 */
public class MouseEventListener implements MouseListener {
    
    private final JTextArea textArea;
    private static final String NEWLINE = System.getProperty("line.separator");
    
    public MouseEventListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        eventOutput("Mouse pressed (# of clicks: "
                + e.getClickCount() + ")", e);
    }
     
    @Override
    public void mouseReleased(MouseEvent e) {
        eventOutput("Mouse released (# of clicks: "
                + e.getClickCount() + ")", e);
    }
     
    @Override
    public void mouseEntered(MouseEvent e) {
        eventOutput("Mouse entered", e);
    }
     
    @Override
    public void mouseExited(MouseEvent e) {
        eventOutput("Mouse exited", e);
    }
     
    @Override
    public void mouseClicked(MouseEvent e) {
        eventOutput("Mouse clicked (# of clicks: "
                + e.getClickCount() + ")", e);
    }
    
    void eventOutput(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " detected on "
                + e.getComponent().getClass().getName()
                + "." + NEWLINE);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}
