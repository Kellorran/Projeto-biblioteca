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

public abstract class Pessoa {
	protected String nome;
	protected String rg;
	protected String endereco;
	protected String senha;
        protected String email;
	
	public Pessoa(String nome, String rg, String endereco, String senha, String email) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.senha = senha;
                this.email = email;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

        public String getEmail(){
            return email;
        }
        
        public void setEmail(String email){
            this.email = email;
        }
        
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", endereco=" + endereco
				+ ", senha=" + senha + "email=" +email +"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
                return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
                if (email == null) {
                    if (other.email != null)
                        return false;
                } else if (!email.equals(other.email))
                    return false;
		return true;
	
        
        
        }

	
	
	
}

