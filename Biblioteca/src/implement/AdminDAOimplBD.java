/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.AdminDAO;
import model.bean.Admin;
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
public class AdminDAOimplBD implements AdminDAO{
    
    public void create (Admin a){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = conextion.prepareStatement ("INSERT INTO Admin_tb (rg_admin, senha_adm) VALUES (?,?)");
            stmt.setString(1,a.getRg());
            stmt.setString(2,a.getSenha());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
   
    public Admin get(int codigo_admin) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Admin adm = new Admin(null, null, null, null, null, 0);
      
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Admin_tb WHERE codigo_admin = ?");
            stmt = setInt(1, codigo_admin);
            rs = stmt.executeQuery();
        
             while(rs.next()){
                adm.setCodigo_admin(rs.getInt("codigo_admin"));
                adm.setSenha(rs.getString("senha_adm"));
                adm.setRg(rs.getString("rg_admin"));
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return adm;
    }

    @Override
    public void delete(Admin a) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
            stmt = conextion.prepareStatement("DELETE FROM Admin_tb WHERE codigo_admin =(?)");
            stmt.setInt(1, a.getCodigo_admin());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    @Override
    public void update(Admin a, Admin a2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Admin_tb SET nome = ? WHERE codigo_admin = ?");
            stmt.setString(1,a2.getNome());
            stmt.setInt(2,a.getCodigo_admin());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    

    private PreparedStatement setInt(int i, int codigo_admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin get(String codigo_admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
   

}
