package br.com.univali.kob.poo.pizzaria.teste.imports;

import java.io.FileNotFoundException;
import java.util.Collection;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorClientes;

public class ImportClientesTestes {
	public void testaImportacaoClientes() throws FileNotFoundException{
		LeitorClientes leitor = new LeitorClientes();	
		Collection<Cliente> clientes = leitor.importaClientes();
		for (Cliente cliente : clientes) {
			ConsoleWrite.printComQuebraDeLinha(cliente.getNome()+";"+cliente.getTelefone()+";"+cliente.getEndereco()+";"+cliente.getCpf());
		}
	}

}
