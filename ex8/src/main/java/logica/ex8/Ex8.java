/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex8;

import java.util.Scanner;

/**
 *
 * @author Pedro Murilo
 */
public class Ex8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Bem vindo a caculadora de watts");
 
    System.out.println("");
    System.out.println("========================================");
    System.out.println("");
    
    //perguntas ("input")
    System.out.println("Qual a tensão em volts?");
	System.out.print("digite:");
            int volts = sc.nextInt();

    System.out.println("Qual a corrente em amperes?");
        System.out.print("digite:");
            int amperes = sc.nextInt();
    
    // calculo seguindo a formula P = V x I
    int potencia = volts * amperes;
    
    System.out.println("");
    System.out.println("========================================");
    System.out.println("");
    

    //Resposta (output)
    System.out.print("A potencia consumida: "+ potencia +"W");


        
    }
}
