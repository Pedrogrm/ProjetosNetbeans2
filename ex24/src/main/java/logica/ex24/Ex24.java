/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex24;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class Ex24 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("R$##0.00");
        
        JOptionPane.showMessageDialog(null, "Bem Vindo ao petshop Dogão Feliz!");
       
            Object[] options = {"Banho e Tosa", "Clinica geral", "Dermatologia", "Odontologia"};
            int escolha = JOptionPane.showOptionDialog(null, 
                "O petshop oferece 4 especialidades: Banho e Tosa, Clinica geral, Dermatologia, Odontologia, selecione alguma opção :", 
                "Menu", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, options, options[0]);
            
            Object[] options2 = {"sim", "não",};
            int escolha2 = JOptionPane.showOptionDialog(null, 
                "Você possui convenio?", 
                "Menu", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, options2, options2[0]);
            
            double preco = 0;
            
            switch(escolha){
            
                case 0 -> preco = 120.00;
                case 1 ->  preco = 100.00; 
                case 2 ->  preco = 150.00;
                case 3 ->  preco = 120.00;            
                default ->  preco = 0;
            } 
            
            if(escolha2 == 0){
            
                preco = preco * 0.80;
                JOptionPane.showMessageDialog(null, "O desconto do convenio foi aplicado");
            }
            
            JOptionPane.showMessageDialog(null, "O valor do a ser pago é " + (df.format(preco)) );
    }
}
