package br.com.univali.kob.poo.pizzaria.pedido;

import br.com.univali.kob.poo.pizzaria.item.ItemMenu;

public class ItemPedido {

	private int quantidade;
	private ItemMenu itemMenu;

	public ItemPedido(int quantidade, ItemMenu itemMenu) {
		super();
		this.quantidade = quantidade;
		this.itemMenu = itemMenu;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public ItemMenu getItemMenu() {
		return itemMenu;
	}

	public double getPreco() {
		return quantidade * itemMenu.getPreco();
	}
}
