/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.herancacomposicao;

import java.util.Scanner;
import javax.swing.JOptionPane;
import poo.herancacomposicao.Carro;

/**
 *
 * @author Aluno
 */
public class HerancaComposicao {

    public static void main(String[] args) {
        
        
        String nomeapp = "Registro carro";
        
        System.out.println("Testes com Herança e Composição");
        JOptionPane.showConfirmDialog(
                null, 
                "-- Testes com Herança e Composição --",
                "Registro Carro",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.PLAIN_MESSAGE
        );
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = JOptionPane.showInputDialog(
                null,
                "Qual a marca do veiculo",
                nomeapp,
                JOptionPane.PLAIN_MESSAGE
        );
        
        

        System.out.print("Modelo: ");
        String modelo = JOptionPane.showInputDialog(
                null,
                "Qual o modelo do veiculo",
                nomeapp,
                JOptionPane.PLAIN_MESSAGE
        );
        
        System.out.print("Cor: ");
        String cor = JOptionPane.showInputDialog(
                null,
                "Qual a cor do veiculo",
                nomeapp,
                JOptionPane.PLAIN_MESSAGE
        );

        System.out.print("Potência do motor: ");
        String potencia = JOptionPane.showInputDialog(
                null,
                "Qual a potencia do motor do veiculo",
                nomeapp,
                JOptionPane.PLAIN_MESSAGE
        );
        
        int potenciaint = Integer.parseInt(potencia);
        
        Carro carro = new Carro(marca, modelo, cor,potenciaint);

        System.out.println("\nDados do carro:");
        StringBuilder sb = new StringBuilder("\nDados do carro:");
        
        JOptionPane.showConfirmDialog(null,
            carro.exibir,
            nomeapp,
            JOptionPane.PLAIN_MESSAGE,
            JOptionPane.PLAIN_MESSAGE
        );
        
        carro.exibirDados();
        
        
    }
    
    
}
