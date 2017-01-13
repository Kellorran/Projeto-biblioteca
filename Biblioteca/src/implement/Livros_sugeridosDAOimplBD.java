/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.Livros_sugeridosDAO;
import model.bean.Livros_sugeridos;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Kellorran
 */
public class Livros_sugeridosDAOimplBD implements Livros_sugeridosDAO{
    
    public void create (Livros_sugeridos l){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = conextion.prepareStatement ("INSERT INTO Livros_sugeridos_tb (codigo_sug, titulo_sug, autor_sug, genero_sug, materia_relacionada, isbn_sug, estado_do_livro_sug, nome_Professor, disciplina_Professor) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1,l.getCodigo());
            stmt.setInt(2,l.getCodigo());
            stmt.setInt(3,l.getCodigo());
            stmt.setInt(4,l.getCodigo());
            stmt.setInt(5,l.getCodigo());
            stmt.setInt(6,l.getCodigo());
            stmt.setInt(7,l.getCodigo());
            stmt.setInt(8,l.getCodigo());
            stmt.setInt(9,l.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
   
    public Livros_sugeridos get(String codigo) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Livros_sugeridos ls = new Livros_sugeridos(null, null, null, null, null, 0, 0, null, null) {};
      
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Livros_sugeridos_tb WHERE codigo = ?");
            stmt = setInt(1, codigo);
            rs = stmt.executeQuery();
        
            while(rs.next()){
                ls.setCodigo(rs.getInt("titulo"));
                ls.setTitulo(rs.getString("codigo"));
                ls.setTitulo(rs.getString("nomeProfessor"));
                ls.setTitulo(rs.getString("disciplinaProfessor"));
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return ls;
    }

    public void delete(Livros_sugeridos l) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = conextion.prepareStatement("DELETE FROM Livros_sugeridos_tb WHERE codigo =(?)");
            stmt.setInt(1, l.getCodigo());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    public void update(Livros_sugeridos l, Livros_sugeridos l2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Livros_sugeridos_tb SET nome = ? WHERE codigo = ?");
            stmt.setString(1,l2.getTitulo());
            stmt.setInt(2,l.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }

    private PreparedStatement setInt(int i, String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Livros_sugeridos get(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
