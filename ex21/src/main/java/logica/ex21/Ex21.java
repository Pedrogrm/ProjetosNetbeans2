/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex21;

import java.util.Scanner;

/**
 *
 * - Desenvolva um programa em Java que leia a idade e o nome de um jogador de
futsal e, com base na idade, informe sua categoria de acordo com a tabela abaixo:
 Infantil: até 10 anos
 Juvenil: até 18 anos
 Profissional: acima de 18 até 40 anos
 Master: acima de 40 anos
Exibir no terminal o nome e a categoria do jogador.
* 
 * @author Pedro murilo
 */
public class Ex21 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==========================================\n");
        
        System.out.println("Cadastro de jogadores de futebol \n");
        
        System.out.println("==========================================\n");
        
        System.out.println("Insira o as informaçoes do jogador \n");
        
        System.out.println("Insira o nome do jogador");
        System.out.print("|digite|:");
            String nome = sc.nextLine();
            
            System.out.println("\n");
            
        System.out.println("Insira a idade do jogador");
        System.out.print("|digite|:");
            int idade = sc.nextInt();    
            
        if( idade <= 10){
 
            System.out.println("Jogador"+ nome +" está registrado na categoria Infantil");
        }else if( idade <= 18 ){
        
            System.out.println("Jogador"+ nome +" está registrado na categoria Juvenil");
        }else if( idade > 18 && idade <=40 ){
        
            System.out.println("Jogador"+ nome +" está registrado na categoria Profissional");
        }else{
        
            System.out.println("Jogador"+ nome +" está registrado na categoria Master");
        }
            
            
            
            
        

        
    }
}
