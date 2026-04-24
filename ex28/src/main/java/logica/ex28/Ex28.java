/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex30;
import javax.swing.JOptionPane;
//import java.util.Scanner;
import java.net.URL;
import javax.swing.ImageIcon;


/**
 *
 * @author Aluno
 */
public class Ex30 {

    public static void main(String[] args) {
       
        URL img = Ex30.class.getResource("img/bank.png");
        
        ImageIcon iconeCustomizado = new ImageIcon(img);
        
        JOptionPane.showInputDialog(null,
                "Bem vindo ao Banco tananam",
                "Banco tananam",
                JOptionPane.QUESTION_MESSAGE,
                iconeCustomizado,
                null,
                null
                );   
    }
}
