package br.com.univali.kob.poo.pizzaria.io;

import java.util.List;

import br.com.univali.kob.poo.pizzaria.item.ItemMenu;

public class ItemMenuReport extends GenericReport<ItemMenu> {

	public ItemMenuReport(List<ItemMenu> list, String fileName) {
		super(list, fileName);
	}

	@Override
	protected String printLine(ItemMenu itemMenu) {
		StringBuilder sb = new StringBuilder("");
		sb.append(itemMenu.getPizza().getNome()).append(" - " + itemMenu.getTamanho().getDescricao())
				.append(" (" + itemMenu.getTamanho().getFatias() + " fatias)").append(System.lineSeparator());
		return sb.toString();
	}

}
