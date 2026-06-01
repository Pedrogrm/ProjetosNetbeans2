/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmocake.DAO;

import cosmocake.jdbc.Conexao;
import cosmocake.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PessoaDAO{
    
    public void cadastrarPessoa(Pessoa obj){
    
        String sql = "INSERT INTO tabelaDAO (nome, idade) VALUES (?, ?) ";

        try(Connection conn = Conexao.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)){

            pst.setString( 1, obj.getNome());
            pst.setInt( 2, obj.getIdade());
             
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados salvos com sucesso!");   
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no banco" + e);
        }
    }
}
