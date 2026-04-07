/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex12;

import java.util.Scanner;

        
/**
 *
 * @author Aluno
 */
public class Ex12 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem vindo a a calculadora de salario");
        System.out.println("");
        
        System.out.println("insira o seu salario");
        System.out.print("digite: ");
       float salariob = sc.nextFloat();
       
       float adiantamento = salariob * 0.40f;
       
       float desconto = salariob * 0.08f;
       
       float salario = desconto + adiantamento - salariob;
       
       System.out.println("");
       System.out.printf("O seu salario no final do mes sera: R$"+ "%.2f", -salario);
       
      
       
       
       
        
    }
}
