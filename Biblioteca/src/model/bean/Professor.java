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

public class Professor extends Usuario {
	protected String disciplina;

    public Professor(String disciplina, int quant_livros_locados, String nome, String rg, String endereco, String senha, String email) {
        super(quant_livros_locados, nome, rg, endereco, senha, email);
        this.disciplina = disciplina;
    }


	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Professor [disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((disciplina == null) ? 0 : disciplina.hashCode());
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
		Professor other = (Professor) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		return true;
	}

	// Não vai ser bem assim, pois não está linkado com o banco de dados, vossa
	// alteza.
	public void recomenda(int cod, ArrayList<Livro> l,
			ArrayList<Livros_sugeridos> ls) {

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getCodigo() == cod) {
				Livros_sugeridos s = new Livros_sugeridos(l.get(i).getTitulo(),
						l.get(i).autor, l.get(i).getMateria_relacionada(), l
								.get(i).getGenero(), l.get(i)
								.getEstado_do_livro(), l.get(i).getCodigo(), l
								.get(i).getIsbn(), nome, disciplina);
				ls.add(s);
			}
		}
	}
}
