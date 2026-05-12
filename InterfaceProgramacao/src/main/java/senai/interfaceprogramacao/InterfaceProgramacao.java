/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package senai.interfaceprogramacao;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author Aluno
 */
public class InterfaceProgramacao {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        //nome da janela
        JFrame janela = new JFrame("Teste Interface");
        
        //tamanho da janela
        janela.setSize(700,300);
        
        // o null centraliza a tela 
        janela.setLocationRelativeTo(null);
        
        // adiciona um texto a janela
        JLabel texto = new JLabel("Olá, mundo!",  SwingConstants.CENTER);
        janela.add(texto);
        
        //definir o comportamento ao fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //tornar a janela visivel
        janela.setVisible(true);
        
        
    }
}
