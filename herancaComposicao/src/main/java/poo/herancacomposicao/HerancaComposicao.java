/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.herancacomposicao;

import java.util.Scanner;
import logica.poo.herancacomposicao.Carro;

/**
 *
 * @author Aluno
 */
public class HerancaComposicao {

    public static void main(String[] args) {
        
        System.out.println("Testes com Herança e Composição");
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        
        System.out.print("Cor: ");
        String cor = sc.nextLine();

        System.out.print("Potência do motor: ");
        int potencia = sc.nextInt();

        Carro carro = new Carro(marca, modelo, cor,potencia);

        System.out.println("\nDados do carro:");
        carro.exibirDados();
    }
    
}
