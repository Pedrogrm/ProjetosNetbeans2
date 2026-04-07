/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex16;

import java.util.Scanner;

/**
 * 
 *
 * @author Aluno
 */
public class Ex16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o valor da compra");
        System.out.print("|Digite|: ");
            double valor = sc.nextDouble();
            
        
        System.out.println("");
        System.out.println("===================================");
        System.out.println("");
        
        if(valor >= 150){
        
            double desconto = valor * 0.15;
            
            double resultado = valor - desconto;
            
            System.out.printf("O valor de desconto de 15%% sera aplicado de %.2f e ficando " , desconto );
            System.out.printf("%.2f", resultado );
            
        }else{
            System.out.println("Valor abaixo de R$150, o desconto nao sera aplicado");
        }
        
        
            
        
        
        
    }
}
