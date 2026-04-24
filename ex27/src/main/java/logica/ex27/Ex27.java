/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex27;
import javax.swing.JOptionPane;



/**
 *Elabore um programa em Java que permita ao usuário escolher um número para
calcular a tabuada, ao final o programa deve oferecer a oportunidade ao usuário de
realizar um novo cálculo escolhendo um novo número, o programa deve continuar até
que o usuário decida finalizar a aplicação.
 * @author Pedro Murilo
 */
public class Ex27 {

    public static void main(String[] args) {
        // Variaveis
        String numero = "";
        double numerocon = 0.0;
        double contcon = 0.0;
        double resultado = 0.0;
        

        // Dialogos com o usuario
        JOptionPane.showMessageDialog(
                null,
                "Escolha um numero para ser calculado a tabuada",
                "Tabuada",
                JOptionPane.PLAIN_MESSAGE
                );
        
        numero = JOptionPane.showInputDialog(
                null,
                "Insira o numero",
                JOptionPane.QUESTION_MESSAGE
        );
             
        // convertendo a string 
        numerocon = Double.parseDouble(numero);
        
        for (int i=0; i<11; i++){
            
                    
            resultado = i * numerocon ;
            
             JOptionPane.showMessageDialog(null, i + " X "+ numero +" = "+ resultado);
        }
        
       
        
        

    }
}
