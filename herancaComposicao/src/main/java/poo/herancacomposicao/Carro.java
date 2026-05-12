/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.herancacomposicao;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo {

    StringBuilder sb = new StringBuilder("O carro ");
    
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
        
        sb.append(cor + " está acelerando\n\n");
    }
    public void frear(){
        System.out.println("O carro "+cor+" está freando");
        
        sb.append(cor+ " está freando\n\n");
    }
    @Override
    public void exibirDados(){
        sb.append("Marca "+marca+"\nModelo "+modelo+"\nCor "+cor);
        System.out.println("Marca "+marca+"\nModelo "+modelo+"\nCor "+cor);
        motor.exibirMotor();
        String exibir = sb.toString();
    }
    
    String exibir = sb.toString();
}
