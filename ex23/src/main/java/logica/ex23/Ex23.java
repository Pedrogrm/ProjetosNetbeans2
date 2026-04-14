/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex23;

//import java.util.Scanner

import java.text.DecimalFormat;
import javax.swing.JOptionPane;



/**
 *
 * @author Aluno
 */
public class Ex23 {

    public static void main(String[] args) {
        
        // Definição do decimal format pro kg e cm
        DecimalFormat ps = new DecimalFormat("##0.00KG");
        DecimalFormat al = new DecimalFormat("0.00CM");
        DecimalFormat im = new DecimalFormat("#0.00");
        
        //Perguntas
        JOptionPane.showMessageDialog(null,"Bem vindo a calculadora o Índice de Massa Corporal (IMC)");
            
            String pesostring = JOptionPane.showInputDialog(null,"Qual o seu peso em kilos?");
                pesostring = pesostring.replace(",", ".");
            
            String alturastring = JOptionPane.showInputDialog(null,"Qual sua altura em cm?");
               alturastring = alturastring.replace(",", ".");
        
            // conversão dos numeros de string para double 
            double peso = Double.parseDouble(pesostring);
            double altura = Double.parseDouble(alturastring);
            
            //Calculo do imc
            double imc = peso / (altura * altura);
            
            //JOptionPane.showMessageDialog(null, imc);
            
            if( imc <= 18.5){
            
                JOptionPane.showMessageDialog(null, "você possui " + (im.format(imc)) + " De imc você esta abaixo do peso ideal");
            }else if( imc <= 24.9){
                
                JOptionPane.showMessageDialog(null, "você possui " + (im.format(imc)) + " De imc você esta no do peso ideal, Parabéns"); 
            }else if( imc <= 29.9){
                
                JOptionPane.showMessageDialog(null, "você possui " + (im.format(imc)) + " De imc você está acima do seu peso ideal");
            }else if( imc <= 34.9){
                
                JOptionPane.showMessageDialog(null, "você possui " + (im.format(imc)) + " De imc você está com obesidade grau I");
            }else if( imc <= 39.9){
                 
                 JOptionPane.showMessageDialog(null, "você possui " + (im.format(imc)) + " De imc você está com obesidade grau II");
            }else{
            
                 JOptionPane.showMessageDialog(null, "você possui " + (im.format(imc)) + " De imc você está com obesidade grau III");
            }          
    }
}
