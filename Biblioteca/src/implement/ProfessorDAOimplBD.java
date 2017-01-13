/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.ProfessorDAO;
import model.bean.Professor;
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
public class ProfessorDAOimplBD implements ProfessorDAO{
    
    public void create (Professor p){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{ 
            stmt = conextion.prepareStatement ("INSERT INTO Professor_tb (rg_prof, senha_prof, endereco_prof, nome_prof, matricula_prof) VALUES (?,?,?,?,?)");
            stmt.setString(1,p.getRg());
            stmt.setString(2,p.getSenha());
            stmt.setString(3,p.getEndereco());
            stmt.setString(4,p.getNome());
            stmt.setString(5,p.getMatricula());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
   
    public Professor get(Professor matricula) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String disciplina = null;
        int quant_livros_locados = 0;
        String nome = null;
        String rg = null;
        String endereco = null;
        String senha = null;
        String email = null;
        
        Professor pf = new Professor(disciplina, quant_livros_locados, nome, rg, endereco, senha, email);
      
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Professor_tb WHERE matricula = ?");
            stmt = setString(1, matricula);
            rs = stmt.executeQuery();
        
            while(rs.next()){
                pf.setMatricula(rs.getString("nome"));
                pf.setNome(rs.getString("rg"));
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return pf;
    }

    public void delete(Professor p) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
        try {
            stmt = conextion.prepareStatement("DELETE FROM Professor_tb WHERE matricula =(?)");
            stmt.setString(1, p.getMatricula());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    public void update(Professor p, Professor p2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Professor_tb SET nome = ? WHERE matricula = ?");
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

    @Override
    public Professor get(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PreparedStatement setString(int i, Professor matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
    

