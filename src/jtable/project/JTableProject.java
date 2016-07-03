/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable.project;

import java.awt.Font;

/**
 *
 * @author Developer
 */
public class JTableProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyFont.setUIFont(new javax.swing.plaf.FontUIResource("Iskoola pota",Font.PLAIN,18));
        
        FormWithSinhalaTitle fm = new FormWithSinhalaTitle();
        fm.setVisible(true);
        // TODO code application logic here
    }
}
