/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senai.adegatable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class BebidasDAO {

    public List<Bebida> pesquisarBebidas(String nomeBusca) {
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Bebida> lista = new ArrayList<>();

        try {
            // Uso do LIKE para a pesquisa
            String sql = "SELECT * FROM bebidas WHERE nome LIKE ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nomeBusca + "%"); // Adiciona os curingas %

            rs = stmt.executeQuery();

            while (rs.next()) {
                Bebida b = new Bebida();
                b.setId(rs.getInt("id"));
                b.setNome(rs.getString("nome"));
                b.setDescricao(rs.getString("descricao"));
                b.setPrecoVenda(rs.getDouble("preco_venda"));

                lista.add(b);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao buscar: " + ex.getMessage());
        }
        return lista;
    }
    // MÉTODO SALVAR

    public void salvar(Bebida b) {
        String sql = "INSERT INTO bebidas (nome, descricao, preco_venda) VALUES (?, ?, ?)";
        try (Connection con = Conexao.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, b.getNome());
            stmt.setString(2, b.getDescricao());
            stmt.setDouble(3, b.getPrecoVenda());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao salvar: " + e);
        }
    }

    // MÉTODO ATUALIZAR
    public void atualizar(Bebida b) {
        String sql = "UPDATE bebidas SET nome=?, descricao=?, preco_venda=? WHERE id=?";
        try (Connection con = Conexao.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, b.getNome());
            stmt.setString(2, b.getDescricao());
            stmt.setDouble(3, b.getPrecoVenda());
            stmt.setInt(4, b.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar: " + e);
        }
    }

    // MÉTODO EXCLUIR
    public void excluir(int id) {
        String sql = "DELETE FROM bebidas WHERE id=?";
        try (Connection con = Conexao.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir: " + e);
        }
    }
}
