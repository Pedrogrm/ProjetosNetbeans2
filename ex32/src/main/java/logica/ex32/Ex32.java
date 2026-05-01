/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex32;

import javax.swing.JOptionPane;
        
/**
 *
 *
 * @author Aluno
 */
public class Ex32 {

    public static void main(String[] args) {
     
        StringBuilder sb = new StringBuilder("Numeros Sorteados \n\n");
        int[] numeros = new int[6];
        String nomePrograma = "Sorteador";

        //int aleatorio = (int)(Math.random() * 100);
    
        //System.out.println(Numeros +" | "+ aleatorio);
        
        JOptionPane.showConfirmDialog(
                null, 
                "Bem vindo ao sorteador de numeros",
                nomePrograma,
                JOptionPane.PLAIN_MESSAGE
        );
        
        for( int vezes = 0; vezes < numeros.length; vezes++){
            
           int aleatorio = (int)(Math.random() * 100); 
           
           numeros[vezes] = aleatorio;
           
           sb.append(numeros[vezes]);
           
           if(vezes == 5){
               sb.append(" ");
           }else{
               sb.append(", ");
           }
           
        }  
        
        String resultado = sb.toString();
        
        JOptionPane.showConfirmDialog(
                null, 
                resultado,
                nomePrograma,
                JOptionPane.PLAIN_MESSAGE
        );
        
        
    }
}
