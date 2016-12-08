package br.com.univali.kob.poo.pizzaria.teste.pizzaria;

import java.util.Set;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.sistema.Pizzaria;

public class ImportClientesTestes {
	public void testaImportacaoClientes(){
		Pizzaria p = new Pizzaria();
		p.carregaClientes();
		Set<Cliente> clientes = p.getClientes();
		for (Cliente cliente : clientes) {
			ConsoleWrite.printComQuebraDeLinha(cliente.getNome()+";"+cliente.getTelefone()+";"+cliente.getEndereco()+";"+cliente.getCpf());
		}
	}

}
