/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica.ex22;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * - Desenvolva um programa em Java que calcule o reajuste salarial de um colaborador
de acordo com os seguintes critérios:
 Salários até R$ 1.280,00: aumento de 20%;
 Salários entre R$ 1.280,01 e R$ 1.700,00: aumento de 15%;
 Salários entre R$ 1.700,01 e R$ 2.500,00: aumento de 10%;
 Salários de R$ 2.500,01 em diante: aumento de 5%.
O programa deve:
1. Solicitar ao usuário o nome, a função e o salário do colaborador.
2. Calcular o aumento com base no salário e nas faixas de valor fornecidas.
3. Exibir na tela:
o O nome e função do funcionário.
o O percentual de aumento aplicado.
o O salário antes do reajuste.
o O novo salário.

Certifique-se de exibir as informações de forma clara e amigável, para que o
colaborador entenda os detalhes do reajuste salarial.
 * 
 * @author Aluno
 */
public class Ex22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("R$##,###,##");
        
        DecimalFormat po = new DecimalFormat("###.#%");
        
        System.out.println("==========================================");
        System.out.println("");
        System.out.println("==== Calculadora de reajuste salarial ====");
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("");
        
        System.out.println("Insira seu nome");
        System.out.print("|Digite|: ");
            String nome = sc.nextLine();
         
        System.out.println("");
        
        System.out.println("Insira seu cargo");
        System.out.print("|Digite|: ");
            String cargo = sc.nextLine();
            
        System.out.println("Insira seu salario");
        System.out.print("|Digite|: ");
            double salario = sc.nextDouble();  
            
        if(salario <= 1.280 ){
            
             double porcento = 0.20;
    
            double aumento = salario + (salario * porcento) ;
            
        }else if( salario <= 1.700){
            
             double porcento = 0.15;
                
            double aumento = salario + (salario * porcento) ;
               
        }else if( salario <= 2.500){
            
             double porcento = 0.10;
                
            double aumento = salario + (salario * porcento) ;
               
        }else{
            
             double porcento = 0.05;
            
            double aumento = salario + (salario * porcento) ;
               
        }
        
        
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("");
                
        System.out.printf("O funcionario "+ nome + "no cargo de "+ cargo + "vai receber um aumento de"+ (po.format(porcento)) + " Do salario de "+ (df.format(salario)) +" apartir do aumento vai receber"+ (df.format(aumento)) );
            
         
        
        
        
        
    }
}
