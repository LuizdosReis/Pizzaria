package br.com.univali.kob.poo.pizzaria.io;

import java.text.NumberFormat;
import java.util.List;

import br.com.univali.kob.poo.pizzaria.pedido.ItemPedido;

public class ItemPedidoReport extends GenericReport<ItemPedido> {

	public ItemPedidoReport(List<ItemPedido> list, String fileName) {
		super(list, fileName);
	}

	@Override
	protected String printLine(ItemPedido itemPedido) {
		StringBuilder sb = new StringBuilder("");
		sb.append(itemPedido.getQuantidade())
				.append(" - " + NumberFormat.getCurrencyInstance().format(itemPedido.getTotal()))
				.append(" - " + itemPedido.getItemMenu().getPizza().getNome())
				.append(" - " + itemPedido.getItemMenu().getTamanho().getDescricao())
				.append(" (" + itemPedido.getItemMenu().getTamanho().getFatias() + " fatias)")
				.append(System.lineSeparator());
		return sb.toString();
	}

}
