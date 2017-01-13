/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.LivroDAO;
import model.bean.Livro;
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
public class LivroDAOimplBD implements LivroDAO{
    
    public void create (Livro l){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = conextion.prepareStatement ("INSERT INTO Livro_tb (codigo, titulo, autor, genero, materia_relacionada, isbn, estado_do_livro ) VALUES (?)");
            stmt.setInt(1,l.getCodigo()) ;
            stmt.setInt(2,l.getIsbn());
            stmt.setString(3,l.getTitulo());
            stmt.setString(4,l.getAutor());
            stmt.setString(5,l.getMateria_relacionada());
            stmt.setString(6,l.getGenero());
            stmt.setString(7,l.getEstado_do_livro());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
   
    public Livro get(String codigo) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Livro lv = new Livro(null, null, null, null, null, 0, 0) {};
      
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Livro_tb WHERE codigo = ?");
            stmt = setInt(1, codigo);
            rs = stmt.executeQuery();
        
            while(rs.next()){
                lv.setCodigo(rs.getInt("titulo"));
                lv.setTitulo(rs.getString("codigo"));
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return lv;
    }

    public void delete(Livro l) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = conextion.prepareStatement("DELETE FROM Livro_tb WHERE codigo =(?)");
            stmt.setInt(1, l.getCodigo());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    public void update(Livro l, Livro l2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Livro_tb SET nome = ? WHERE codigo = ?");
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
    


}
