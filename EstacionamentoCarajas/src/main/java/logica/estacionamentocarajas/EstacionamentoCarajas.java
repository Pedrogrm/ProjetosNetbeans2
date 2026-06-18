/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.estacionamentocarajas;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author pedro
 */
public class EstacionamentoCarajas {

    public static void main(String[] args) {
       
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("Erro ao carregar tema");
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new InterfaceCarajas().setVisible(true);
            }
        });
    }
    
    
}
