/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import model.bean.Livros_sugeridos;

/**
 *
 * @author Kellorran
 */
public interface Livros_sugeridosDAO {
    
    public void create(Livros_sugeridos l);
    
    public Livros_sugeridos get(int codigo);
    
    public void delete(Livros_sugeridos l); 
    
    public void update(Livros_sugeridos l, Livros_sugeridos l2);
    
}
