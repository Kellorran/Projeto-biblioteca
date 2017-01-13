/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import model.DAO.AlunoDAO;
import model.bean.Aluno;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Livros_sugeridos;
/**
 *
 * @author Kellorran
 */
public class AlunoDAOimplBD implements AlunoDAO{
    
    public void create (Aluno a){
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = conextion.prepareStatement ("INSERT INTO Aluno_tb (curso, serie,  monitoria, quant_livros_locados, matricula_aluno, nome, rg_aluno, endereco, senha, email) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1,a.getCurso());
            stmt.setString(2,a.getSerie());
            stmt.setBoolean(3,a.getMonitoria());
            stmt.setInt(4,a.getQuant_livros_locados());
            stmt.setString(5,a.getMatricula());
            stmt.setString(6,a.getNome());
            stmt.setString(7,a.getRg());
            stmt.setString(8,a.getEndereco());
            stmt.setString(9,a.getSenha());
            stmt.setString(10,a.getEmail());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }
    
    //matriculas
    public Aluno get(String matricula) {
        Connection conextion = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Aluno aln = new Aluno(null, null, false, 0, null, null , null, null, null);
        
        try{
            stmt = conextion.prepareStatement("SELECT * FROM Aluno_tb WHERE matricula_aluno = ?");
            stmt = setString(1, matricula);
            rs = stmt.executeQuery();
        
                while(rs.next()){
                aln.setMatricula(rs.getString("nome"));
                aln.setNome(rs.getString("matricula_aluno"));
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt, rs);
        }
        return aln;
    }

    public void delete(Aluno a) {
       Connection conextion = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
            stmt = conextion.prepareStatement("DELETE FROM Aluno_tb WHERE matricula =(?)");
            stmt.setString(1, a.getMatricula());
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOimplBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(conextion, stmt);
        }
    }

    public void update(Aluno a, Aluno a2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Aluno_tb SET nome = ? WHERE matricula = ?");
            stmt.setString(1,a2.getNome());
            stmt.setString(2,a.getMatricula());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }

    private PreparedStatement setString(int i, String matricula_aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}