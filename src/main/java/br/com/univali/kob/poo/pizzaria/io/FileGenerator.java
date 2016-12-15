package br.com.univali.kob.poo.pizzaria.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.menu.Menu;
import br.com.univali.kob.poo.pizzaria.pedido.ItemPedido;
import br.com.univali.kob.poo.pizzaria.pedido.Pedido;

public class FileGenerator {
	public static void generateFilePizzas(Set<Pedido> pedidos, Menu menu) throws IOException {
		Map<ItemMenu, Integer> mapItemPedidoQuantidade = new LinkedHashMap<>();
		List<ItemPedido> itemPedidosConfirmados = new ArrayList<>();
		List<ItemMenu> itensMenuNaoVendidos = new ArrayList<>();
		itensMenuNaoVendidos.addAll(menu.getItensDeMenu().values());

		for (Pedido pedido : pedidos)
			if (pedido.isConfirmado())
				for (ItemPedido itemPedido : pedido.getItensPedido()) {
					int quantidade = mapItemPedidoQuantidade.get(itemPedido.getItemMenu()) != null
							? mapItemPedidoQuantidade.get(itemPedido.getItemMenu()) + itemPedido.getQuantidade()
							: itemPedido.getQuantidade();
					mapItemPedidoQuantidade.put(itemPedido.getItemMenu(), quantidade);
					itensMenuNaoVendidos.remove(itemPedido.getItemMenu());
				}

		for (Map.Entry<ItemMenu, Integer> keyValue : mapItemPedidoQuantidade.entrySet()) {
			ItemPedido itemPedido = new ItemPedido(keyValue.getValue(), keyValue.getKey());
			itemPedidosConfirmados.add(itemPedido);
		}

		itemPedidosConfirmados.sort(new Comparator<ItemPedido>() {
			@Override
			public int compare(ItemPedido o1, ItemPedido o2) {
				return new Integer(o2.getQuantidade()).compareTo(new Integer(o1.getQuantidade()));
			}
		});

		ItemPedidoReport itemPedidoReport = new ItemPedidoReport(itemPedidosConfirmados, "pizzasVendidas.txt");
		itemPedidoReport.generateFile();
		ItemMenuReport itemMenuReport = new ItemMenuReport(itensMenuNaoVendidos, "pizzasNaoVendidas.txt");
		itemMenuReport.generateFile();
	}

}
