package br.com.univali.kob.poo.pizzaria.item;

import java.util.Collection;
import java.util.Collections;

public class Pizza implements Cloneable {

	private String nome;
	private Collection<Ingrediente> ingredientes;

	public Pizza(String nome, Collection<Ingrediente> ingrediente) {
		this.nome = nome;
		this.ingredientes = ingrediente;
	}

	@Override
	protected Pizza clone() throws CloneNotSupportedException {
		Pizza clone = (Pizza) super.clone();
		clone.ingredientes = Collections.unmodifiableCollection(this.ingredientes);
		clone.nome = this.nome;
		return clone;
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
