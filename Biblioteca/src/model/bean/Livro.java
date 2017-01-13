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
public abstract class Livro {
	protected String titulo;
	protected String autor;
	protected String materia_relacionada;
	protected String genero;
	protected String estado_do_livro;
	protected int codigo;
	protected int isbn;
	
	public Livro(String titulo, String autor, String materia_relacionada,
			String genero, String estado_do_livro, int codigo, int isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.materia_relacionada = materia_relacionada;
		this.genero = genero;
		this.estado_do_livro = estado_do_livro;
		this.codigo = codigo;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getMateria_relacionada() {
		return materia_relacionada;
	}

	public void setMateria_relacionada(String materia_relacionada) {
		this.materia_relacionada = materia_relacionada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstado_do_livro() {
		return estado_do_livro;
	}

	public void setEstado_do_livro(String estado_do_livro) {
		this.estado_do_livro = estado_do_livro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor
				+ ", materia_relacionada=" + materia_relacionada + ", genero="
				+ genero + ", estado_do_livro=" + estado_do_livro + ", codigo="
				+ codigo + ", isbn=" + isbn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + codigo;
		result = prime * result
				+ ((estado_do_livro == null) ? 0 : estado_do_livro.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + isbn;
		result = prime
				* result
				+ ((materia_relacionada == null) ? 0 : materia_relacionada
						.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (codigo != other.codigo)
			return false;
		if (estado_do_livro == null) {
			if (other.estado_do_livro != null)
				return false;
		} else if (!estado_do_livro.equals(other.estado_do_livro))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (isbn != other.isbn)
			return false;
		if (materia_relacionada == null) {
			if (other.materia_relacionada != null)
				return false;
		} else if (!materia_relacionada.equals(other.materia_relacionada))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	

}
