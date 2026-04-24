
package logica.eletrocalc;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Murilo
 */
public class EletroCalc {

    public static void main(String[] args) {
        
        //formatação decimais
        DecimalFormat df = new DecimalFormat("00A");
        DecimalFormat bi = new DecimalFormat("#0.0mm²");
        DecimalFormat vo = new DecimalFormat("##00V");
        DecimalFormat wa = new DecimalFormat("###00W");
        
        // perguntas para descobrir a potencia em watts e a tensão em volts
        JOptionPane.showMessageDialog(null, "EletroCalc Pro \n Bem vindo a calculadora para equipamentos eletronicos");
            String potencia = JOptionPane.showInputDialog(null, "Insira a Potência do equipamento (em Watts, somente numeros, sem abreviações )");
            String tensao = JOptionPane.showInputDialog(null, "Insira Tensão de alimentação (em Volts, somente numeros, sem abreviações)");
            
            // converte as string para double
            double potenciacon = Double.parseDouble(potencia);       
            double tensaocon = Double.parseDouble(tensao);
            
            // Faz o calculo para descobrir o amper
            double amper = potenciacon / tensaocon;
            
            //criando as variaveis da bitola e do disjutor
            double bitola = 0.0 ;
            String disjuntor = "";
            
            // decição a resposta do sistema dependendo da amperagem
            if( amper <= 15){
                
                bitola = 1.5 ;
                disjuntor = "10 A ou 15 A";
      
            }else if( amper <= 21){
                
                bitola = 2.5 ;
                disjuntor = "16 A ou 20 A";
 
            }else if( amper <= 28){
                
                bitola = 4 ;
                disjuntor = "25 A";
 
            }else if( amper <= 36){
            
                bitola = 6 ;
                disjuntor = "32 A";
 
            }else if( amper <= 50){
                
                bitola = 10 ;
                disjuntor = "40 A ou 50 A";
                
            }else{
             
                bitola = 16;
                disjuntor = "63 A";
                
            }
            
            // resposta
            JOptionPane.showMessageDialog(null, " A pontencia "+ potencia + " e a tensao de "+ tensao +" a corrente de " + (df.format(amper)) + "\n\n A bitola recomendada é de " +(bi.format(bitola))+ "\n\n O disjuntor recomendado é de " + disjuntor );
        
    }
}
