package br.com.univali.kob.poo.pizzaria.teste.imports;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Map;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorClientes;

public class ImportClientesTestes {
	public void testaImportacaoClientes() throws FileNotFoundException{
		LeitorClientes leitor = new LeitorClientes();	
		Map<Integer,Cliente> clientes = leitor.importaClientes();
		for (Cliente cliente : clientes.values()) {
			ConsoleWrite.printComQuebraDeLinha(cliente.getNome()+";"+cliente.getTelefone()+";"+cliente.getEndereco()+";"+cliente.getCpf());
		}
	}

}
