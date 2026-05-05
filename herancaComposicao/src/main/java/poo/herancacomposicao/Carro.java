/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica.poo.herancacomposicao;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo {

    //atributos
    private Motor motor; //composição
    private String cor;
    //métodos
    public Carro(String marca, String modelo, String cor, int potencia) {
        super(marca, modelo);
        this.cor = cor;
        this.motor = new Motor(potencia);// Motor criado dentro de Carro
    }
    public void acelerar(){
        System.out.println("O carro "+cor+" está acelerando");
    }
    public void frear(){
        System.out.println("O carro "+cor+" está freando");
    }
    @Override
    public void exibirDados(){
        System.out.println("Marca "+marca+"\nModelo "+modelo+"\nCor "+cor);
        motor.exibirMotor();
    }
    
}
