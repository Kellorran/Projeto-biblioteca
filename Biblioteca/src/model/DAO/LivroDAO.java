/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.bean.Livro;

/**
 *
 * @author Kellorran
 */
public interface LivroDAO {
    public void create(Livro l);
    
    public Livro get(String codigo);
    
    public void delete(Livro l); 
    
    public void update(Livro l, Livro l2);
    
}
