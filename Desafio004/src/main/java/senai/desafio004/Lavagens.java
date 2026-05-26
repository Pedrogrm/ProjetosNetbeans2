/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.desafio004;

/**
 *
 * @author Aluno
 */
public class Lavagens extends Servico {

    private String tipoLavagem;

    public Lavagens(String placa, String modelo, String tipoLavagem) {

        super(placa, modelo);

        this.tipoLavagem = tipoLavagem;
    }

    @Override
    public double calcularTotal() {

        if (tipoLavagem.equals("Lavagem Simples")) {
            return 40.0;
        }

        return 70.0;
    }
}

