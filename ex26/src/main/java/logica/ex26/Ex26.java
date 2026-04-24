/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex26;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class Ex26 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("###0.0");
        
        double numcon;
        
        do{     
        JOptionPane.showMessageDialog(null, "Verificador de numeros");
        String num = JOptionPane.showInputDialog("Insira um numero positivo ou negativo");
            numcon = Double.parseDouble(num);
            
            if(numcon < 0){
            
                JOptionPane.showMessageDialog(null, "O numero "+ num +" é menor que zero");
            }else if(numcon > 0) {
            
                JOptionPane.showMessageDialog(null, "O numero "+ num +" é maior que zero");
            }else{
            
                JOptionPane.showMessageDialog(null, "O numero é zero");
            }
                
        }while(numcon == 0);
        
    }
}
