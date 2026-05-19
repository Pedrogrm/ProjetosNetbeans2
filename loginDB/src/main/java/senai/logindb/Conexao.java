/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.logindb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/testejava_db";
    
    private static final String USER = "root";
    
    private static final String PASSWORD = "Senai@118";
    
    public static Connection conectar() throws SQLException {
        
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
