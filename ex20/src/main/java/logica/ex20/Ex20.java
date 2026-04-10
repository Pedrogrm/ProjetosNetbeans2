/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex20;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * 
 * Se a média for maior ou igual a 7, exibir a mensagem &quot;Aluno aprovado&quot;.
o Se a média for inferior a 7, exibir a mensagem &quot;Aluno reprovado&quot;.
 *
 * @author Pedro Murilo
 */
public class Ex20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat nt = new DecimalFormat("###.#");
        
        System.out.println("========================================== \n");
        System.out.println("Calculadora de medida \n");
        System.out.println("==========================================\n");
         
        System.out.println("Insira as 4 notas do aluno \n");
        
        // entrada das notas
        
        System.out.println("Insira a primeira nota");
        System.out.print("|Digite|:");
            double nota1 = sc.nextDouble();
            
        System.out.println("Insira a segunda nota");
        System.out.print("|Digite|:");
            double nota2 = sc.nextDouble();
            
        System.out.println("Insira a terceira nota");
        System.out.print("|Digite|:");
            double nota3 = sc.nextDouble();
            
        System.out.println("Insira a quarta nota");
        System.out.print("|Digite|:");
            double nota4 = sc.nextDouble();
            
        //calculo
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4 ;
        
        System.out.println("\n");
        System.out.println("==========================================\n");
        
        //decisão
        
        if(media >= 7){
            
            System.out.printf("Aluno aprovado com "+ (nt.format(media)));
        
        }else{
            
            System.out.printf("Aluno reprovado com "+ (nt.format(media)));
            
        }
    }
}
