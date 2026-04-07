/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex11;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem vindo a calculadora de cambio");
        
        System.out.println("");
        
        System.out.println("Insira o valor em reais que voce deseja converter");
        System.out.print("digite: ");
        double reais = sc.nextDouble();
        
        double dollar = 5.16f;
        
        double euro = 5.95f; 
        
        double reaisdollar = reais / dollar;
         System.out.printf("a conversao em dolares ficou "+ "%.2f", reaisdollar );
        
        System.out.println("");
         
        double reaiseuro = reais / euro;
         System.out.printf("a conversao em euros ficou "+ "%.2f", reaiseuro);
        
        //System.out.println("a conversao em dolares ficou" + dollar);
        //System.out.println("a conversao em euros ficou" + euro);
        
    }
}
