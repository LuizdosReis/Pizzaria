
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
		ingrediente.setNome(novoNome);
	}

	@Override
	public String toString() {
		String print = nome + "\n";
		return print += ingredientes;
	}
}
>>>>>>> 661a3afa914229dd7ab934db66c89e044b7b12ad
