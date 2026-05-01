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
       
        String nomeBanco = "Banco tananam";
        boolean continuar = true;
        int escolha = 0;
        String nome = "";
        
        URL img = Ex30.class.getResource("/img/bank.png");
        
        ImageIcon iconeCustomizado = new ImageIcon(img);
        
        JOptionPane.showMessageDialog(
            null,
            "Bem vindo ao Banco tananam",
            nomeBanco,
            JOptionPane.QUESTION_MESSAGE,
            iconeCustomizado
        );   
        
        try{
            nome = (String) JOptionPane.showInputDialog(
                null,
                "Insira seu nome",
                nomeBanco,
                JOptionPane.QUESTION_MESSAGE,
                iconeCustomizado,
                null,
                null
            );
            
        }catch( NumberFormatException | java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(
            null,
            "Digite algo",
            nomeBanco,
            JOptionPane.ERROR_MESSAGE); 
            
              String senha = (String) JOptionPane.showInputDialog(
                null,
                "Insira sua senha",
                nomeBanco,
                JOptionPane.QUESTION_MESSAGE,
                iconeCustomizado,
                null,
                null
            );

            while(continuar){

                //senha = senha.replace(senha, "********");


                Object opcoes[] = {"deposito", "saque", "saldo","emprestimos", "sair"};
                escolha = JOptionPane.showOptionDialog(
                    null,
                    nome + ", Voce deseja qual opção",
                    nomeBanco,
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    iconeCustomizado,
                    opcoes,
                    opcoes[0]
                    );




                switch(escolha){
                    case 0 -> {
                        JOptionPane.showMessageDialog(
                                null,
                                "0",
                                nomeBanco,
                                JOptionPane.PLAIN_MESSAGE
                        );
                    }

                    case 1 -> {
                        JOptionPane.showMessageDialog(
                                null,
                                "1",
                                nomeBanco,
                                JOptionPane.PLAIN_MESSAGE
                        );
                    }

                    case 2 -> {
                        JOptionPane.showMessageDialog(
                                null,
                                "2",
                                nomeBanco,
                                JOptionPane.PLAIN_MESSAGE
                        );
                    }

                    case 3 -> {
                        JOptionPane.showMessageDialog(
                                null,
                                "3",
                                nomeBanco,
                                JOptionPane.PLAIN_MESSAGE
                        );
                    }

                    case 4 -> {
                       continuar = false;
                        }
                }
            }                                
    }
}
