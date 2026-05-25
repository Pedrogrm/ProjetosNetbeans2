/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package senai.desafio004;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Aluno
 */
public class Desafio004 {
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("Erro ao carregar tema");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new InterfaceDesafio().setVisible(true);
            }
        });
    }
}
