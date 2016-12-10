package br.com.univali.kob.poo.pizzaria.leitor;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.FileImport;

public class LeitorClientes {
	private Collection<Cliente> clientes = new HashSet<>();

	public Collection<Cliente> importaClientes() throws FileNotFoundException{
		List<String[]> frases = FileImport.retornaListaDeFrases("Clientes.txt", ";");
		
		for (String[] strings : frases){
			clientes.add(new Cliente(strings[0], strings[1], strings[3], strings[2]));
		}
		
		return Collections.unmodifiableCollection(clientes);
	}
	
}
