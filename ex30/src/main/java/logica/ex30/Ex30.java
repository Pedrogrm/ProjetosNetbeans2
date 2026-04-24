/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex30;
import javax.swing.JOptionPane;
//import java.util.Scanner;
import java.net.URL;
import javax.swing.ImageIcon;
import java.text.Format;


/**
 *
 * @author Aluno
 */
public class Ex30 {

    
    
    public static void main(String[] args) {
       
        URL img = Ex30.class.getResource("/img/bank.png");
        
        ImageIcon iconeCustomizado = new ImageIcon(img);
        
        JOptionPane.showMessageDialog(
            null,
            "Bem vindo ao Banco tananam",
            "Banco tananam",
            JOptionPane.QUESTION_MESSAGE,
            iconeCustomizado
        );   
        
        String nome = (String) JOptionPane.showInputDialog(
            null,
            "Insira seu nome",
            "Banco tananam",
            JOptionPane.QUESTION_MESSAGE,
            iconeCustomizado,
            null,
            null
        );
        
          String senha = (String) JOptionPane.showInputDialog(
            null,
            "Insira sua senha",
            "Banco tananam",
            JOptionPane.QUESTION_MESSAGE,
            iconeCustomizado,
            null,
            null
        );
          
        senha = senha.replace(senha, "********");
         
        escolha = JOptionPane.showOptionDialog(null,
            null,
            nome + ", Voce deseja qual opção",
            "Banco tananam    Usuario:"+ nome+ " Senha:"+ senha,
            JOptionPane.QUESTION_MESSAGE,
            iconeCustomizado
            );
         
        

        
        
        
    }
}
