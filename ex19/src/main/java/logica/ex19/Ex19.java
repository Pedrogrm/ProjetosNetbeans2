/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex19;

import java.util.Scanner;

/**
 * @author Aluno
 */
public class Ex19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Sistema de verificação de idade ===");
        System.out.println("");
        
        System.out.println("Insira sua idade");
        System.out.print("|Digite|:");
            int idade = sc.nextInt();
            
        if(idade >= 18 && idade ){
        
            System.out.println("Com "+ idade +"anos  o voto é obrigatório" );
        }else if( idade >= 16 && idade <= 17 && idade > 70 ){ 
        
            System.out.println("Com "+ idade +"anos  o voto é facultativo" );
        }else{
                
            System.out.println("Com "+ idade +"anos não pode votar" );
        }
       
    }
}
