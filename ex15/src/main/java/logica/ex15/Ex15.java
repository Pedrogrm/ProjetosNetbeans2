/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex15;

import java.util.Scanner;

/**
 *
 *   
 * 
 * @author Aluno
 */
public class Ex15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        float saldo = 0;

       
        
                
        
        System.out.println("Banco Denhero");
        System.out.println("==================================");
        System.out.println("");
        
        
            
        System.out.println("Insira o valor que deseja depositar");
        System.out.print("|Digite|:");
        saldo = sc.nextFloat();
        
        System.out.println("");
        System.out.println("====================================");
        
        System.out.println("Insira o valor que voce deseja sacar");
        System.out.print("|Digite|:");
        saldo = saldo - sc.nextFloat();
        
        
        System.out.printf("Saldo atual: "+ "%.2f", saldo);
            
           
        
        
    }
}
