/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Setting {

    public void checkNumber(java.awt.event.KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "The Amount Column Can Only Enter Number Characters");
        }
    }
    
    public void  checkAlphabet(java.awt.event.KeyEvent b){
        if (Character.isDigit(b.getKeyChar())) {
            b.consume();
            JOptionPane.showMessageDialog(null, "In the Number column you can only enter the character letters");
        }
    }
}
