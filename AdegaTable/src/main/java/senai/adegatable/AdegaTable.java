/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package senai.adegatable;

/**
 *
 * @author Aluno
 */
public class AdegaTable {

   public static void main(String[] args) {
        try {
        // Iniciando a biblioteca:
        //com.formdev.flatlaf.FlatLightLaf.setup(); 
    } catch (Exception ex) {
        System.err.println("Falha ao iniciar o tema moderno.");
    }

    // Abre sua tela normalmente:
    java.awt.EventQueue.invokeLater(() -> {
        new Interface().setVisible(true);
    });
    }
}
    