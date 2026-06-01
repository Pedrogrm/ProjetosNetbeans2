/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.adegatable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/adega_sucao";
    private static final String USER = "root";
    private static final String PASS = "Senai@118"; // Senha Super Secreta :)

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + e.getMessage());
            return null;
        }
    }
}
