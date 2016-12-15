package br.com.univali.kob.poo.pizzaria.sistema;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.io.FileGenerator;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorClientes;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorPizzas;
import br.com.univali.kob.poo.pizzaria.menu.Menu;
import br.com.univali.kob.poo.pizzaria.pedido.Pedido;
import helper.RandomHelper;

public class Pizzaria {

	private final int RODADAS_MAX_PEDIDOS;
	private Set<Pedido> pedidos;
	private Menu menu;
	public Map<Integer, Cliente> clientes;

	/**
	 * Construtor da pizzaria
	 *
	 * @param totalPedidos
	 *            - Quantidade de pedidos que serah feito pelo simulador de
	 *            pedidos
	 */
	public Pizzaria(int totalPedidos) {
		this.RODADAS_MAX_PEDIDOS = totalPedidos;
	}

	public void executa() {
		this.carregaClientes();
		this.carregaMenu();
		this.pedidos = new HashSet<>();
		this.simularPedidos();
		this.gerarRelatorios();
	}

	private void gerarRelatorios() {
		try {
			FileGenerator.generateFilePizzas(this.pedidos, this.menu);
		} catch (IOException e) {
			ConsoleWrite.printComQuebraDeLinha(e);
		}

	}

	/**
	 * Carrega a lista de menu com as pizzas e seus respectivos itens de menu
	 */
	private void carregaMenu() {
		try {
			LeitorPizzas leitorPizzas = new LeitorPizzas();
			this.menu = new Menu(leitorPizzas.importaItensMenu());
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

	private void simularPedidos() {

		for (int i = 0; i < RODADAS_MAX_PEDIDOS; i++)
			novoPedido();

	}

	private void novoPedido() {
		int quantidadeItens = RandomHelper.getRandomInteger(1, 10), quantidade;
		int codItemMenu = -1;
		boolean confirmado = RandomHelper.getRandomBoolean();
		Pedido pedido = new Pedido(confirmado, clientes.get(RandomHelper.getRandomInteger(1, this.clientes.size())));
		do {
			codItemMenu = RandomHelper.getRandomInteger(1, menu.qtdItensMenu(), codItemMenu);
			quantidade = RandomHelper.getRandomInteger(1, quantidadeItens);
			quantidadeItens -= quantidade;
			pedido.adicionaItemPedido(quantidade, this.menu.getItemPedido(codItemMenu));
		} while (quantidadeItens > 0);
		ConsoleWrite.printComQuebraDeLinha(pedido);
		this.pedidos.add(pedido);
	}

	/**
	 * importar os clientes a partir do leitor de clientes
	 */
	private void carregaClientes() {
		try {
			LeitorClientes leitor = new LeitorClientes();
			clientes = leitor.importaClientes();
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

}
