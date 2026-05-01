/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.heranca;

/**
 *
 * @author pedro
 */
public class animal {
    
    private String Nome;
    private int Idade;
    
    //metodos
    
    public animal(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }
    
    //

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
        
    public void dormir(){
        System.out.println("O animal esta dormindo");
    }
    
    public void fazerBarulho(){
        System.out.println("O animal esta fazendo barulho");
    }
    
}

