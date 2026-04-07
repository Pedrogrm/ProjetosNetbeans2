/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex9;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex9 {

    public static void main(String[] args) {
        System.out.println("bem vindo a calculadora de media");
        
        System.out.println("");
        System.out.println("================================ ");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero");
            System.out.print("digite: ");
                int num1 = sc.nextInt();
                    System.out.println("");
        
        System.out.println("Insira o segundo numero");
            System.out.print("digite: ");
                int num2 = sc.nextInt();
                    System.out.println("");
                    
        System.out.println("Insira o terceiro numero");
            System.out.print("digite: ");
                int num3 = sc.nextInt();
                    System.out.println("");
                    
        System.out.println("Insira o quarto numero");
            System.out.print("digite: ");
                int num4 = sc.nextInt();
                    System.out.println("");
        
        System.out.println("Insira o quinto numero");
            System.out.print("digite: ");
                int num5 = sc.nextInt();
                    System.out.println("");
                    
        //calculo
        int media = num1 + num2 + num3 + num4 + num5;
        
        //resposta
        System.out.println("A media dos numeros e "+ media);
                    
                    
                    
                    
                
            
            
        
        
    }
}
