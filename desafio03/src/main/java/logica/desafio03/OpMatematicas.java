/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.desafio03;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class OpMatematicas {
    
 // Atributos (características)
    public String modelo = "CalcJava - V.001";
    public double n1;
    public double n2;
    public String num1 = "";
    public String num2 = "";

    // Criamos o objeto 'op' a partir da classe OpMatematicas
    //Desafio03 op = new Desafio03();
    
    // Métodos (comportamentos)
    public void mostrarBoasVindas() {
        
        String boasvindas = "<html>"
                + "  <body style='width: 300px, font-family: Arial, sans-serif; font-size: 12pt;'>"
                + "    <p> <font color='green'> --- </font><i>Calculadora Iniciada</i><font color='green'> --- </font> </p>"
                + "  </body>"
                + "</html>";
        
         URL urlImagem = OpMatematicas.class.getResource("/img/calculadora.png");
        ImageIcon icone = new ImageIcon(urlImagem);
        JOptionPane.showMessageDialog( 
            null,
            boasvindas,
            modelo,
            JOptionPane.INFORMATION_MESSAGE,
            icone
            
        );
        
        //System.out.println("--- Calculadora Iniciada ---");
    }
    
    // Com retorno e com parâmetros
    
    //soma
    public double calcularSoma(double a, double b) {
        return a + b;
    }    
    
    public double calcularSubtracao(double a, double b) {
        return a - b;
    }
    public double calcularMultiplicao(double a, double b) {
        return a * b;
    }
    public double calcularDivisao(double a, double b) {
        return a / b;
    }
    
    // Chamada de método com retorno
    // Resultados guardados em uma variavel
    public String resposta(double a, double b) {
    double resultadoSom = calcularSoma(a, b);
    double resultadoSub = calcularSubtracao(a, b);
    double resultadoMul = calcularMultiplicao(a, b);
    double resultadoDiv = calcularDivisao(a, b);

    return "<html><body style='width: 300px; font-family: Arial; font-size: 12pt;'>"
        + "<p><b>Resultados:</b></p>"
        + "<p>A Soma: " + a + " + " + b + " = " + resultadoSom + "</p>"
        + "<p>A Subtração: " + a + " - " + b + " = " + resultadoSub + "</p>"
        + "<p>A Multiplicação: " + a + " X " + b + " = " + resultadoMul + "</p>"
        + "<p>A Divisão: " + a + " / " + b + " = " + resultadoDiv + "</p>"
        + "</body></html>";
    }
                   
    // Com retorno e sem parâmetros
    public String obterInfo() {
        return modelo;
    }
}