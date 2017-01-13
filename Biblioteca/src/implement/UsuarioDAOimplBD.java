/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.UsuarioDAO;
import model.bean.Usuario;
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
public class UsuarioDAOimplBD implements UsuarioDAO{
    
    public void create (Usuario u){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{ 
            stmt = conextion.prepareStatement ("INSERT INTO Usuario_tb (rg_usuario, senha_usuario, endereco_usuario, nome_usuario, matricula, quant_livros_locados) VALUES (?,?,?,?,?,?)");
            stmt.setString(1,u.getRg());
            stmt.setString(2,u.getSenha());
            stmt.setString(3,u.getEndereco());
            stmt.setString(4,u.getNome());
            stmt.setString(5,u.getMatricula());
            stmt.setInt(6,u.getQuant_livros_locados());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
   
    public Usuario get(Usuario matricula) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario us = new Usuario(0, null, null, null, null, null){};
      
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Usuario_tb WHERE matricula = ?");
            stmt = setString(1, matricula);
            rs = stmt.executeQuery();
        
            while(rs.next()){
                us.setMatricula(rs.getString("nome"));
                us.setNome(rs.getString("matricula"));
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return us;
    }

    public void delete(Usuario u) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = conextion.prepareStatement("DELETE FROM Usuario_tb WHERE matricula=(?)");
            stmt.setString(1, u.getMatricula());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    public void update(Usuario u, Usuario u2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Usuario_tb SET nome = ? WHERE matricula = ?");
            stmt.setString(1,u2.getNome());
            stmt.setString(2,u.getMatricula());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }

    @Override
    public Usuario get(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PreparedStatement setString(int i, Usuario matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    


}
