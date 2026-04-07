/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex13;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Ex13 {

    public static void main(String[] args) {
        
        System.out.println("conversor de celsios para Fahrenheit ");
        
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira os graus celcius que vc deseja converter");
        System.out.print("Digite: ");
        double cel = sc.nextDouble();
        
        double fah = (cel * 1.8f) + 32;
        
        System.out.println("");
        System.out.println("=============================");
        System.out.println("");
        
        System.out.printf(cel +"C graus celcius em fahrenheit são %.1f F", fah);
        //System.out.print("F");
    }
}
