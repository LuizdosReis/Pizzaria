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
	private Collection<Ingrediente> ingrediente;
	
	public Pizza(String nome, Collection<Ingrediente> ingrediente) {
		this.nome = nome;
		this.ingrediente = ingrediente;
	}

	public String getNome() {
		return nome;
	}

	public Collection<Ingrediente> getIngredientes() {
		return Collections.unmodifiableCollection(ingrediente);
	}

}

