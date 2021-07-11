
package br.com.projeto.model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilitarios {
  
    public void limpaTela(JPanel p){
        Component comp [] = p.getComponents();
        for (Component component : comp) {
            if(component instanceof JTextField){
                ((JTextField)component).setText(null);
            }
            
        }
    }
}
