/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable.project;

import javax.swing.UIManager;

/**
 *
 * @author Developer
 */
public class MyFont {
    
    public static void setUIFont (javax.swing.plaf.FontUIResource f){

    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    }
    
}
