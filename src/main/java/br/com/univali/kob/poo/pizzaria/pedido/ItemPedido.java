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

	public double getTotal() {
		return quantidade * itemMenu.getPreco();
	}

	@Override
	public String toString() {
		return "\nQuantidade: " + quantidade + " " + itemMenu.getPizza();
	}
}
