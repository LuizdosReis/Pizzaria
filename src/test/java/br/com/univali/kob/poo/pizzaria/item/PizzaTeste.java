package br.com.univali.kob.poo.pizzaria.item;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class PizzaTeste {

	@Test
	public void testaAlteraçãoIngrediente() {
		Collection<Ingrediente> ingredientes = new ArrayList<>();
		Ingrediente ingrediente = new Ingrediente("Molho");

		ingredientes.add(ingrediente);

		Pizza pizza = new Pizza("Portuguesa", ingredientes);

		assert ingredientes.contains(ingrediente);

		pizza.alteraIngrediente(ingrediente, "Molho de tomate");

		assertEquals("Molho de tomate", ingrediente.getNome());

	}

	@Test(expected = IllegalArgumentException.class)
	public void testaAlteracaoDeIngredienteInexistente() {
		Collection<Ingrediente> ingredientes = new ArrayList<>();
		Ingrediente ingrediente = new Ingrediente("Molho");
		Ingrediente ingrediente2 = new Ingrediente("Queijo");

		ingredientes.add(ingrediente);

		Pizza pizza = new Pizza("Portuguesa", ingredientes);

		pizza.alteraIngrediente(ingrediente2, "Queijo Mussarela");
	}

}
