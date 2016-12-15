package br.com.univali.kob.poo.pizzaria.menu;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.com.univali.kob.poo.pizzaria.item.Ingrediente;
import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.item.Pizza;
import br.com.univali.kob.poo.pizzaria.item.Tamanho;

public class MenuTeste {

	@Test
	public void testaBuscaItemDeMenuPeloCodigo() {
		Collection<Ingrediente> ingredientes = new ArrayList<>();
		ItemMenu itemMenu = new ItemMenu(50.00, new Pizza("Portuguesa", ingredientes), new Tamanho(12, "Grande"));
		Map<Integer, ItemMenu> itensDeMenu = new HashMap<>();
		itensDeMenu.put(itemMenu.getCodigo(), itemMenu);
		Menu menu = new Menu(itensDeMenu);

		ItemMenu itemMenuBuscado = menu.getItemPedido(itemMenu.getCodigo());

		assertEquals(itemMenu, itemMenuBuscado);

	}

	@Test
	public void testBuscaItemDeMenuPorCodigoInexistente() {
		Collection<Ingrediente> ingredientes = new ArrayList<>();
		ItemMenu itemMenu = new ItemMenu(50.00, new Pizza("Portuguesa", ingredientes), new Tamanho(12, "Grande"));
		Map<Integer, ItemMenu> itensDeMenu = new HashMap<>();
		itensDeMenu.put(itemMenu.getCodigo(), itemMenu);
		Menu menu = new Menu(itensDeMenu);

		ItemMenu itemMenuBuscado = menu.getItemPedido(Integer.MIN_VALUE);

		assertEquals(null, itemMenuBuscado);
	}

}
