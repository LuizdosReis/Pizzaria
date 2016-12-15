package br.com.univali.kob.poo.pizzaria.menu;

import java.util.Map;

import br.com.univali.kob.poo.pizzaria.item.ItemMenu;

public class Menu {
	private Map<Integer, ItemMenu> itensDeMenu;

	public Menu(Map<Integer, ItemMenu> itensDeMenu) {
		super();
		this.itensDeMenu = itensDeMenu;
	}

	public ItemMenu getItemPedido(Integer codigo) {
		return this.itensDeMenu.get(codigo);
	}

	public int qtdItensMenu() {
		return this.itensDeMenu.size();
	}

	public Map<Integer, ItemMenu> getItensDeMenu() {
		return itensDeMenu;
	}

	public void setItensDeMenu(Map<Integer, ItemMenu> itensDeMenu) {
		this.itensDeMenu = itensDeMenu;
	}

}
