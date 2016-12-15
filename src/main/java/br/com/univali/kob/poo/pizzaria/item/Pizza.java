
package br.com.univali.kob.poo.pizzaria.item;

import java.util.Collection;
import java.util.Collections;

public class Pizza {

	private String nome;
	private Collection<Ingrediente> ingredientes;

	public Pizza(String nome, Collection<Ingrediente> ingrediente) {
		this.nome = nome;
		this.ingredientes = ingrediente;
	}

	public String getNome() {
		return nome;
	}

	public Collection<Ingrediente> getIngredientes() {
		return Collections.unmodifiableCollection(ingredientes);
	}

	public void alteraIngrediente(Ingrediente ingrediente, String novoNome) {
		if (ingredientes.contains(ingrediente))
			ingrediente.setNome(novoNome);
		else
			throw new IllegalArgumentException("O ingrediente não pertence a esta pizza");
	}

	@Override
	public String toString() {
		String print = nome + " ";
		return print += ingredientes;
	}
}
