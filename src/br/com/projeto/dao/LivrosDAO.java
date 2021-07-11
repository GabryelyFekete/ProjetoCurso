
package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Livros;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LivrosDAO {
    private Connection connection;
    
    public LivrosDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarLivros(Livros liv){
        try {
            String sql =
                    "INSERT INTO tb_livros(titulodaobra, editora, recomendacao, recomendaria, autor, numerodepaginas, colecao, nota, genero,"
                    + "filme, personagemfavorito)"
                    + " values(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, liv.getTitulodaobra());
            stmt.setString(2, liv.getAutor());
            stmt.setString(3, liv.getEditora());
            stmt.setString(4, liv.getColecao());
            stmt.setInt(5, liv.getNumerodepaginas());
            stmt.setInt(6, liv.getNota());
            stmt.setString(7, liv.getRecomendacao());
            stmt.setString(8, liv.getRecomendaria());
            stmt.setString(9, liv.getGenero());
            stmt.setString(10, liv.getFilme());
            stmt.setString(11, liv.getPersonagemfavorito());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! "+ ex);
        }
                 
    }
    
    public List<Livros> listarLivros(){
        try {
            List<Livros> lista = new ArrayList<>();            
            String sql = "SELECT * FROM tb_livros";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Livros liv = new Livros();
                
                liv.setId(rs.getInt("id"));
                liv.setTitulodaobra(rs.getString("titulodaobra"));
                liv.setAutor(rs.getString("autor"));
                liv.setEditora(rs.getString("editora"));
                liv.setColecao(rs.getString("colecao"));
                liv.setNumerodepaginas(rs.getInt("numerodepaginas"));
                liv.setNota(rs.getInt("nota"));
                liv.setRecomendacao(rs.getString("recomendacao"));
                liv.setRecomendaria(rs.getString("recomendaria"));
                liv.setGenero(rs.getString("genero"));
                liv.setFilme(rs.getString("filme"));
                liv.setPersonagemfavorito(rs.getString("personagemfavorito"));
                
                lista.add(liv);
            }
            return lista;         
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ ex);
            return null;
        }
    }
    
    public List<Livros> consultaPorNome(String nome){
        try {
            List<Livros> lista = new ArrayList<>();            
            String sql = "SELECT * FROM tb_livros WHERE nome like ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Livros liv = new Livros();
                
                liv.setId(rs.getInt("id"));
                liv.setTitulodaobra(rs.getString("titulodaobra"));
                liv.setAutor(rs.getString("autor"));
                liv.setEditora(rs.getString("editora"));
                liv.setColecao(rs.getString("colecao"));
                liv.setNumerodepaginas(rs.getInt("numerodepaginas"));
                liv.setNota(rs.getInt("nota"));
                liv.setRecomendacao(rs.getString("recomendacao"));
                liv.setRecomendaria(rs.getString("recomendaria"));
                liv.setGenero(rs.getString("genero"));
                liv.setFilme(rs.getString("filme"));
                liv.setPersonagemfavorito(rs.getString("personagemfavorito"));
                
                lista.add(liv);
            }
            return lista;         
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ ex);
            return null;
        }
    }
    
    public Livros buscaPorNome(String nome){
        try {
            String sql = "SELECT * FROM tb_livros WHERE nome = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();
            
            Livros liv = new Livros();
            
            if(rs.next()){                
                liv.setId(rs.getInt("id"));
                liv.setTitulodaobra(rs.getString("titulodaobra"));
                liv.setAutor(rs.getString("autor"));
                liv.setEditora(rs.getString("editora"));
                liv.setColecao(rs.getString("colecao"));
                liv.setNumerodepaginas(rs.getInt("numerodepaginas"));
                liv.setNota(rs.getInt("nota"));
                liv.setRecomendacao(rs.getString("recomendacao"));
                liv.setRecomendaria(rs.getString("recomendaria"));
                liv.setGenero(rs.getString("genero"));
                liv.setFilme(rs.getString("filme")); 
                liv.setPersonagemfavorito(rs.getString("personagemfavorito"));
            }
            return liv;      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
            return null;
        }
    }
    
    public void excluirLivro(Livros liv){
          try {
                       
            String sql = "DELETE FROM tb_livros WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,liv.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!!!");
                                 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ ex);           
        }
        
    }
    
    public void alterarLivro(Livros liv){
         try {
                       
            String sql = "UPDATE tb_livros SET titulodaobra = ?,autor = ?, editora = ?, colecao = ?, numerodepaginas = ?"
                    + "nota = ?, recomendacao = ?, recomendaria = ?, genero = ?, filme = ?, personagemfavorito = ?"
                    + " where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, liv.getTitulodaobra());
            stmt.setString(2, liv.getAutor());
            stmt.setString(3, liv.getEditora());
            stmt.setString(4, liv.getColecao());
            stmt.setInt(5, liv.getNumerodepaginas());
            stmt.setInt(6, liv.getNota());
            stmt.setString(7, liv.getRecomendacao());
            stmt.setString(8, liv.getRecomendaria());
            stmt.setString(9, liv.getGenero());
            stmt.setString(10, liv.getFilme());
            stmt.setString(11, liv.getPersonagemfavorito());
            
            stmt.setInt(12, liv.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!");
                                 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ ex);           
        }
    }
}
