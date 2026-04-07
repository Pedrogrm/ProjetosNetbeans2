

package logica.testescanner;

import java.util.Scanner;

/**
 *
 * @author grygs
 */
public class TesteScanner {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
        //System.out.print("digite seu nome:");
        //System.out.print("digite sua idade:");
        System.out.print("quantos reais você tem?:");

        
       // String nome = sc.nextline();
        //System.out.println("Seja bem vindo ao sistema "+ nome +"!");
        
        int idade = sc.nextInt();
        //float idade = sc.nextFloat();
        System.out.println("Voce tem "+ idade +" anos!");
        
        Double dinheiro = sc.nextDouble();
        System.out.println("Você tem R$"+ dinheiro);
        
    }
}
