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

public class Livros_sugeridos extends Livro {
	private String nomeProfessor;
	private String disciplinaProfessor;
	
	public Livros_sugeridos(String titulo, String autor,
			String materia_relacionada, String genero, String estado_do_livro,
			int codigo, int isbn, String nomeProfessor,
			String disciplinaProfessor) {
		super(titulo, autor, materia_relacionada, genero, estado_do_livro,
				codigo, isbn);
		this.nomeProfessor = nomeProfessor;
		this.disciplinaProfessor = disciplinaProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getDisciplinaProfessor() {
		return disciplinaProfessor;
	}

	public void setDisciplinaProfessor(String disciplinaProfessor) {
		this.disciplinaProfessor = disciplinaProfessor;
	}

	@Override
	public String toString() {
		return "Livros_Sugeridos [nomeProfessor=" + nomeProfessor
				+ ", disciplinaProfessor=" + disciplinaProfessor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((disciplinaProfessor == null) ? 0 : disciplinaProfessor
						.hashCode());
		result = prime * result
				+ ((nomeProfessor == null) ? 0 : nomeProfessor.hashCode());
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
		Livros_sugeridos other = (Livros_sugeridos) obj;
		if (disciplinaProfessor == null) {
			if (other.disciplinaProfessor != null)
				return false;
		} else if (!disciplinaProfessor.equals(other.disciplinaProfessor))
			return false;
		if (nomeProfessor == null) {
			if (other.nomeProfessor != null)
				return false;
		} else if (!nomeProfessor.equals(other.nomeProfessor))
			return false;
		return true;
	}
	
	
	
	

}
