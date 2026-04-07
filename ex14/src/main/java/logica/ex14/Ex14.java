/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex14;

import java.util.Scanner;

/**
 *14 - Desenvolva um programa em Java que solicite ao usuário a entrada de dois
números. O programa deve calcular e exibir:
 A soma dos dois números.
 A subtração do primeiro número pelo segundo.
 A multiplicação dos dois números.
 A divisão do primeiro número pelo segundo.
Certifique-se de apresentar os resultados de forma organizada e com mensagens claras
para o usuário.
 * 
 * 
 * 
 * @author Pedro murilo
 */
public class Ex14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //perguntas
        System.out.println("Escreva dois numeros desejados");
        System.out.print("=======================================");
        System.out.println("");
        
        System.out.print("Digite o primeiro numero :");
        float num1 = sc.nextFloat();
        
        System.out.print("Digite o segundo numero :");
        float num2 = sc.nextFloat();
        
        // Calculos 
        float soma = num1 + num2;
        
        float subtracao = num1 - num2;
        
        float multiplicacao = num1 * num2;
        
        float divisao = num1 / num2;
        
        System.out.println("Os resultados sao");
        System.out.print("=======================================");
        System.out.println("");
        
        // respostas
        System.out.println("A soma dos dois numeros digitados é "+  soma);
        System.out.println("A subtracao dos dois numeros digitados é "+  subtracao);
        System.out.println("A multiplicacao dos dois numeros digitados é "+  multiplicacao);
        System.out.println("A divisao dos dois numeros digitados é "+  divisao);
        
         
        
        
       
        
    }
}
