/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.bean.Usuario;

/**
 *
 * @author Kellorran
 */
public interface UsuarioDAO {

    public void create(Usuario u);
    
    public Usuario get(String matricula);
    
    public void delete(Usuario u); 
    
    public void update(Usuario u, Usuario u2);
    
}
