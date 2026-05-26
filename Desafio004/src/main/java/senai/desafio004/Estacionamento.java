/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.desafio004;
import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author pedro
 */

public class Estacionamento extends Servico {

    private LocalTime entrada;
    private LocalTime saida;

    public Estacionamento(String placa, String modelo,
            LocalTime entrada, LocalTime saida) {

        super(placa, modelo);

        this.entrada = entrada;
        this.saida = saida;
    }

    @Override
    public double calcularTotal() {

        long horas = Duration.between(entrada, saida).toHours();

        if (horas == 0) {
            horas = 1;
        }

        return horas * 10.0;
    }
}