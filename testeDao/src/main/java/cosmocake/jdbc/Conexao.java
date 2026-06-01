/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmocake.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/testeDao_db";
    private static final String USER = "root";
    private static final String PASS = "Senai@118";
    
        public static Connection getConexao() {
            try {
                return DriverManager.getConnection(URL, USER, PASS);
                
            } catch (SQLException e){
                throw new RuntimeException("Erro ao conectar "+ e.getMessage());
            }
        }
    }   
