/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.PessoaDAO;
import model.bean.Pessoa;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Admin;
/**
 *
 * @author Kellorran
 */
public class PessoaDAOimplBD implements PessoaDAO{
    
    public void create (Pessoa p){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{ 
            stmt = conextion.prepareStatement ("INSERT INTO Pessoa_tb (rg, nome, endereco, senha, email) VALUES (?,?,?,?,?)");
            stmt.setString(1,p.getRg());
            stmt.setString(2,p.getNome());
            stmt.setString(3,p.getEndereco());
            stmt.setString(4,p.getSenha());
            stmt.setString(5,p.getEmail());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
   
    public Pessoa get(String rg) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String nome = null;
	String endereco = null;
	String senha = null;
        String email = null;
        int codigo_admin = 0;
        
        Pessoa ps = new Admin(nome, rg, endereco, senha, email, codigo_admin);
      
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Pessoa_tb WHERE rg = ?;");
            stmt.setString(1, rg);
            rs = stmt.executeQuery();
        
            while(rs.next()){
                ps.setRg(rs.getString("rg"));
                ps.setNome(rs.getString("nome"));
                ps.setEndereco(rs.getString("endereco"));
                ps.setSenha(rs.getString("senha"));
                ps.setEmail(rs.getString("email"));
                
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return ps;
    }

    public void delete(Pessoa p) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = conextion.prepareStatement("DELETE FROM Pessoa_tb WHERE rg =(?)");
            stmt.setString(1, p.getRg());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    public void update(Pessoa p, Pessoa p2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Pessoa_tb SET nome = ? WHERE rg = ?");
            stmt.setString(1,p2.getNome());
            stmt.setString(2,p.getRg());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }

    


}
