package br.com.univali.kob.poo.pizzaria.pedido;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.item.Ingrediente;
import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.item.Pizza;
import br.com.univali.kob.poo.pizzaria.item.Tamanho;

public class PedidoTeste {

	@Test
	public void testaCodPedidoEMaiorQuePenultimoPedido() {
		Cliente cliente = new Cliente("Luiz", "4899798243", "Rua ivo marques da silveira", "0849041308");
		Pedido pedido = new Pedido(false, cliente);
		Pedido pedido1 = new Pedido(false, cliente);

		assertEquals(pedido.getCodigo() + 1, pedido1.getCodigo());
	}

	private Pedido criaPedido() {
		Cliente cliente = new Cliente("Luiz", "4899798243", "Rua ivo marques da silveira", "0849041308");
		Pedido pedido = new Pedido(false, cliente);

		Collection<Ingrediente> ingredientes = new ArrayList<>();
		Ingrediente ingrediente = new Ingrediente("Molho");

		ingredientes.add(ingrediente);

		Pizza pizza = new Pizza("Portuguesa", ingredientes);

		ItemMenu itemMenu = new ItemMenu(32.00, pizza, new Tamanho(12, "Media"));

		pedido.adicionaItemPedido(2, itemMenu);

		return pedido;

	}

	@Test
	public void testaAdicaoDeItemPedido() {

		assertEquals(1, criaPedido().getItensPedido().size());

	}

	@Test
	public void testaValorTotal() {
		assertEquals(64.00, criaPedido().getValorTotal(), 0.00001);

	}

}
