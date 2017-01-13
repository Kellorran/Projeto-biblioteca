/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import model.bean.Aluno;

/**
 *
 * @author Kellorran
 */
public interface AlunoDAO {
    
    public void create(Aluno a);
    
    public Aluno get(String matricula);
    
    public void delete(Aluno a); 
    
    public void update(Aluno a, Aluno a2);
    
}
