/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.testejoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Testejoptionpane {

    public static void main(String[] args) {
        
        String aux = JOptionPane.showInputDialog(null, "Digite seu nome");
        JOptionPane.showMessageDialog(null," Nome digitado: "+ aux);
        
    }
}
