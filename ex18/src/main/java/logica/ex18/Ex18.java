/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex18;

import java.util.Scanner;

/**
 * 
 * 
 *
 * @author Aluno
 */
public class Ex18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o a quantidades de maça");
        System.out.print("|Digite|:");
            int maca = sc.nextInt();
            
        if(maca <= 12){
        
           double valor = maca * 0.30; 
           
            System.out.printf("O valor das macas sai por %.2f", valor);
        }else{
            
            double valor = maca * 0.25; 
           
            System.out.printf("O valor das macas sai por %.2f", valor);
        }
        
    }
}
