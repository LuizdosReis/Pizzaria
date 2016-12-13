package br.com.univali.kob.poo.pizzaria.item;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


public class Pizza
{

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
	
	public void alteraIngrediente(Ingrediente ingrediente, String novoNome){
		ingrediente.setNome(novoNome);
	}

	@Override
	public String toString() {
		String print = nome + "\n";
		return print += ingredientes;
	}
	
	

}

