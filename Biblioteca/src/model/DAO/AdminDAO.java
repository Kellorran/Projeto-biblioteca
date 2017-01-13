/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import model.bean.Admin;

/**
 *
 * @author Kellorran
 */
public interface AdminDAO {
    
    public void create(Admin a);
    
    public Admin get(String codigo_admin);
    
    public void delete(Admin a); 
    
    public void update(Admin a, Admin a2);
}
