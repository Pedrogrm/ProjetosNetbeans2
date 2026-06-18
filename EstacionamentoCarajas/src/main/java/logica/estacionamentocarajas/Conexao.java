/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.estacionamentocarajas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pedro
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/estacionamento";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection conn() {
        try{
            return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            );
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
