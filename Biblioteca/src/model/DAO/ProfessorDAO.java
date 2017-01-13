/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.bean.Professor;

/**
 *
 * @author Kellorran
 */
public interface ProfessorDAO {
    
    public void create(Professor p);
    
    public Professor get(String matricula);
    
    public void delete(Professor p); 
    
    public void update(Professor p, Professor p2);
    
}
