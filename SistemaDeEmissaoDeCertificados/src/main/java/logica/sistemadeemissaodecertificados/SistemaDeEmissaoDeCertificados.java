
package logica.sistemadeemissaodecertificados;

import java.util.Scanner;
import java.text.DecimalFormat;


/**
 * @author Pedro Murilo Grigorjevs Alves
 */
public class SistemaDeEmissaoDeCertificados {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // aqui a porcentagem vai aparecer (exemplo: 75,5 )
        DecimalFormat df = new DecimalFormat("###.#%");
        DecimalFormat nt = new DecimalFormat("###.#");
        
        System.out.println("==========================================");
        System.out.println("");
        System.out.println("=== Sistema de Emissão de Certificados ===");
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("");
        
        System.out.println("Insira a Frequencia do aluno");
        System.out.print("|Digite|:");
            double frequencia = sc.nextDouble();
            
            frequencia = frequencia / 100;

            //System.out.println(df.format(frequencia)+"");
            
            
            
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("");
        
        System.out.println("Insira o nome");
        System.out.print("|Digite|:");
            String nome = sc.nextLine();
        
        System.out.println("Insira a nota do aluno");
        System.out.print("|Digite|:");
            double nota = sc.nextDouble();
            
            //System.out.println(nt.format(nota)+"");
            
            System.out.println("");
            System.out.println("==========================================");
            System.out.println("");
            
            if(frequencia >= 75 && nota >= 50){
            
                System.out.println("O aluno "+ nome +" foi aprovado com " + (df.format(frequencia)) + "%% de frequencia e " + (nt.format(nota)) );
                
            }else{
            
                 System.out.println("O aluno "+ nome +" foi reprovado com " + (df.format(frequencia)) + " de frequencia e " + (nt.format(nota)) );
                
            }
            
            System.out.println("");
            System.out.println("==========================================");
            System.out.println("");
            
    }
}
        //grygs    