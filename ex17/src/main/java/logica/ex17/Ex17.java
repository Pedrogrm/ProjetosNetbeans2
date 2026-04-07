/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex17;

import java.util.Scanner;
       
/**
 *
 * @author Aluno
 */
public class Ex17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o valor desejado");
        System.out.print("|Digite|:");
        int num = sc.nextInt();
        
        if(num == 0){
            System.out.println("O numero inserido e igual zero");
        }else if(num < 0){
            System.out.println("o numero "+ num +" e negativo, ele e menor que zero");
        }else{
            System.out.println("o numero "+ num +" e positivo, ele e maior que zero");
        }
        
        
        
    }
}
