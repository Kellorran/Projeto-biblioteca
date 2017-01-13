/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import model.bean.Pessoa;

/**
 *
 * @author Kellorran
 */
public interface PessoaDAO {
    
    public void create(Pessoa p);
    
    public Pessoa get(String rg);
    
    public void delete(Pessoa p); 
    
    public void update(Pessoa p, Pessoa p2);
    
}
