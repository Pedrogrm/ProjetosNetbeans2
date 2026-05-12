/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.herancacomposicao;

/**
 *
 * @author Aluno
 */
public class Motor {

    StringBuilder sb = new StringBuilder("");
    private int potenciaint;

    public Motor(int potencia) {
        this.potenciaint = potenciaint;
    }

    public void exibirMotor() {
        sb.append("Potencia: " + potenciaint + "CV");
        System.out.println("Potencia: " + potenciaint + "CV");
    }
    
    
}
