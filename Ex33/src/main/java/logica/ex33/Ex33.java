/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex33;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex33 {

    public static void main(String[] args) {
        
        double catetoA = 0.0;
        double catetoB = 0.0;
        double hipotenusa = 0.0;
        String nome = "Calculadora de pitagoras";
        
        DecimalFormat df = new DecimalFormat("###.#");
        
        JOptionPane.showConfirmDialog(
            null,
            "-- Bem vindo a "+ nome + " --",
            nome,
            JOptionPane.PLAIN_MESSAGE
        );
        
         JOptionPane.showConfirmDialog(
            null,
            "A "+ nome + " Calculadora de pitagoras é ultilizada para calcular os valores da hipotenusa",
            nome,
            JOptionPane.PLAIN_MESSAGE
        );
        
        
        String catetoAS = JOptionPane.showInputDialog(
            null,
            "Insira o cateto A",
            nome,
            JOptionPane.PLAIN_MESSAGE
        );
        
        String catetoBS = JOptionPane.showInputDialog(
            null,
            "Insira o cateto A",
            nome,
            JOptionPane.PLAIN_MESSAGE
        );
        
        boolean temVirgulaA = catetoAS.contains(",");
        boolean temVirgulaB = catetoBS.contains(",");
        
        /*
        if( temVirgulaA = true){
            
            catetoAS.replace(',', '.');
        }
        
        if( temVirgulaB = true){
            
            catetoBS.replace(',', '.');
        }
        */
        
        catetoAS.replace(',', '.');
        catetoBS.replace(',', '.');
        
        catetoA = Double.parseDouble(catetoAS);
        catetoB = Double.parseDouble(catetoBS);
        
        //catetoA = Math.pow(catetoA, 2.0);
        //catetoB = Math.pow(catetoB, 2.0);
        //double somaDosCatetos = catetoA + catetoB;
        
        hipotenusa = Math.hypot(catetoA, catetoB);
        
         JOptionPane.showConfirmDialog(
            null,
            "A hipotenusa dos catetos"+ catetoA+"² + "+ catetoB +"² = .2%"+ hipotenusa,
            nome,
            JOptionPane.PLAIN_MESSAGE
        );
    }
}
