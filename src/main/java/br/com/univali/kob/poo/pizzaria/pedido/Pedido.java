package br.com.univali.kob.poo.pizzaria.pedido;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.item.ItemMenu;

public class Pedido {

	private static int proxCodigo = 1;
	private boolean confirmado;
	private int codigo;
	private Cliente cliente;
	private Set<ItemPedido> itensDoPedido = new HashSet<>();

	public Pedido(boolean confirmado, Cliente cliente) {
		super();
		this.cliente = cliente;
		this.confirmado = confirmado;
		this.codigo = proxCodigo++;
	}

	public void adicionaItemPedido(int quantidade, ItemMenu itemMenu) {
		this.itensDoPedido.add(new ItemPedido(quantidade, itemMenu));
	}

	public double getValorTotal() {
		Double total = 0.0D;
		for (ItemPedido itemPedido : this.itensDoPedido)
			total += itemPedido.getTotal();

		return total;
	}

	@Override
	public String toString() {
		return "Cliente: " + cliente + " itens: " + itensDoPedido + "\nvalorTotal: " + getValorTotal() + " Confirmado: "
				+ confirmado;
	}

	public int getCodigo() {
		return codigo;
	}

	public Set<ItemPedido> getItensPedido() {
		return Collections.unmodifiableSet(itensDoPedido);
	}

	public boolean isConfirmado() {
		return confirmado;
	}

}
