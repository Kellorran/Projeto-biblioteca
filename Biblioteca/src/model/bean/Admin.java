/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Kellorran
 */


public class Admin extends Pessoa{
	protected int codigo_admin;

	public Admin(String nome, String rg, String endereco, String senha, String email, int codigo_admin) {
		super(nome, rg, endereco, senha, email);
		this.codigo_admin = codigo_admin;
	}


	public int getCodigo_admin() {
		return codigo_admin;
	}

	public void setCodigo_admin(int codigo_admin) {
		this.codigo_admin = codigo_admin;
	}

	@Override
	public String toString(){
		return "Admin [codigo_admin=" + codigo_admin + "]";
	}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo_admin;
        return hash;
    }

	@Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (this.codigo_admin != other.codigo_admin) {
            return false;
        }
        return true;
    }



	
}

