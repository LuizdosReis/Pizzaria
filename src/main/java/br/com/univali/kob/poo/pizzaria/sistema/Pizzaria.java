package br.com.univali.kob.poo.pizzaria.sistema;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorClientes;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorPizzas;
import br.com.univali.kob.poo.pizzaria.menu.Menu;
import br.com.univali.kob.poo.pizzaria.pedido.Pedido;

public class Pizzaria {

	private Set<Pedido> pedido;
	private Menu menu;
	public Map<Integer, Cliente> clientes = new HashMap();

	public void carregaMenu() {
		try {
			LeitorPizzas leitorPizzas = new LeitorPizzas();
			this.menu = new Menu(leitorPizzas.importaItensMenu());
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

	public void novoPedido() {
		// TODO implement me
	}

	public void executa() {
		// TODO implement me
	}

	public void salva() {
		// TODO implement me
	}

	/**
	 * importar os clientes a partir do leitor de clientes
	 */
	public void carregaClientes() {
		try {
			LeitorClientes leitor = new LeitorClientes();
			clientes = leitor.importaClientes();
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

}
