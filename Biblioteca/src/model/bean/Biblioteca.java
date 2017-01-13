package model.bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kellorran
 */
import java.util.ArrayList;

public class Biblioteca {
	protected ArrayList<Livro> livros;

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public Biblioteca(ArrayList<Livro> livros) {
		super();
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Biblioteca [livros=" + livros + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biblioteca other = (Biblioteca) obj;
		if (livros == null) {
			if (other.livros != null)
				return false;
		} else if (!livros.equals(other.livros))
			return false;
		return true;
	}

	public void addLivro(Livro l){
		livros.add(l);
	}
	
	public void remoLivro(Livro l){
		livros.remove(l);
	}
}

