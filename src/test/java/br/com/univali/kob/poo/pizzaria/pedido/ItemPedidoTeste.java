package br.com.univali.kob.poo.pizzaria.pedido;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import br.com.univali.kob.poo.pizzaria.item.Ingrediente;
import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.item.Pizza;
import br.com.univali.kob.poo.pizzaria.item.Tamanho;

public class ItemPedidoTeste {

	@Test
	public void testaValorTotalItemPedido() {
		Collection<Ingrediente> ingredientes = new ArrayList<>();
		ItemPedido itemPedido = new ItemPedido(2,
				new ItemMenu(50.00, new Pizza("Portuguesa", ingredientes), new Tamanho(12, "Grande")));

		assertEquals(100.00, itemPedido.getTotal(), 0.00001);
	}

}
