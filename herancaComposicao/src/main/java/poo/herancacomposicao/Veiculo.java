/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica.poo.herancacomposicao;

/**
 *
 * @author Aluno
 */
public class Veiculo {


    //atributos
    protected String marca;
    protected String modelo;
    //metodos
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }    
    public void exibirDados(){
        System.out.println("Marca "+marca+"\nModelo "+modelo);
    }
}
