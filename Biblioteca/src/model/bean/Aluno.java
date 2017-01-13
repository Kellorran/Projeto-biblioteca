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
import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Usuario {
	private String curso;
	private String serie;
	protected boolean monitoria;

    public Aluno(String curso, String serie, boolean monitoria, int quant_livros_locados, String nome, String rg, String endereco, String senha, String email) {
        super(quant_livros_locados, nome, rg, endereco, senha, email);
        this.curso = curso;
        this.serie = serie;
        this.monitoria = monitoria;

    }

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public boolean getMonitoria() {
		return monitoria;
	}

	public void setMonitoria(boolean monitoria) {
		this.monitoria = monitoria;
	}

        
    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", serie=" + serie + ", monitoria=" + monitoria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.curso);
        hash = 37 * hash + Objects.hashCode(this.serie);
        hash = 37 * hash + (this.monitoria ? 1 : 0);
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
        final Aluno other = (Aluno) obj;
        if (this.monitoria != other.monitoria) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        return true;
    }


	
}
    