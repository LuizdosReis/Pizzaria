package br.com.univali.kob.poo.pizzaria.pedido;

import java.util.Set;

public class Pedido {

	private static int proxCodigo;
	private boolean confirmado;
	private int numero;
	private Set<ItemPedido> itemPedido;

	public Pedido() {
		super();
	}

	public Pedido(boolean confirmado, Set<ItemPedido> itemPedido) {
		super();
		this.confirmado = confirmado;
		this.itemPedido = itemPedido;
		this.numero = proxCodigo++;
	}

	public void adicionaItemPedido(ItemPedido itemPedido) {
		this.itemPedido.add(itemPedido);
	}

	public double getValorTotal() {
		Double total = 0.0D;
		for (ItemPedido itemPedido : this.itemPedido) {
			total += itemPedido.getPreco();
		}

		return total;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isConfirmado() {
		return confirmado;
	}
	
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public Set<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(Set<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}

}
