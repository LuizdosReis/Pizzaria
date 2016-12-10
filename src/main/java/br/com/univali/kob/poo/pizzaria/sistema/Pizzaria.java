package br.com.univali.kob.poo.pizzaria.sistema;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.io.FileImport;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorClientes;
import br.com.univali.kob.poo.pizzaria.menu.Menu;
import java.util.Set;
import br.com.univali.kob.poo.pizzaria.pedido.Pedido;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Pizzaria {

	private Set<Pedido> pedido;
	private Menu menu;
	public Set<Cliente> clientes = new HashSet<>();

	public void carregaMenu() {
		// TODO implement me
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
