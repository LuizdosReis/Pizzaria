package br.com.univali.kob.poo.pizzaria.sistema;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.io.FileImport;
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
	 * Carrega os clientes cadastrados no arquivo Clientes.txt
	 */
	public void carregaClientes() {
		try {
			List<String[]> frases = FileImport.retornaListaDeFrases("Clientes.txt", ";");
			for (String[] strings : frases){
				clientes.add(new Cliente(strings[0], strings[1], strings[3], strings[2]));
			}
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

	/**
	 * retorna os clientes em um set que não pode ser modificado
	 * 
	 * @return
	 */
	public Set<Cliente> getClientes() {
		return Collections.unmodifiableSet(clientes);
	}

}
