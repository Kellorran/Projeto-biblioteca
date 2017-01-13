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

public abstract class Usuario extends Pessoa {
	protected String matricula;
	private int quant_livros_locados;
	

    public Usuario(int quant_livros_locados, String nome, String rg, String endereco, String senha, String email) {
        super(nome, rg, endereco, senha, email);
        this.quant_livros_locados = quant_livros_locados;
    }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getQuant_livros_locados() {
		return quant_livros_locados;
	}

	public void setQuant_livros_locados(int quant_livros_locados) {
		this.quant_livros_locados = quant_livros_locados;
	}
        
        
	
	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", quant_livros_locados="
				+ quant_livros_locados + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + quant_livros_locados;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (quant_livros_locados != other.quant_livros_locados)
			return false;
		return true;
	}

	public void locar(){
		
	}
	
}

