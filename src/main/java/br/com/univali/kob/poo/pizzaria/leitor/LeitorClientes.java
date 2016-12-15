package br.com.univali.kob.poo.pizzaria.leitor;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;
import br.com.univali.kob.poo.pizzaria.io.FileImport;

public class LeitorClientes {
	private Map<Integer, Cliente> clientes = new HashMap<>();

	public Map<Integer, Cliente> importaClientes() throws FileNotFoundException {
		List<String[]> frases = FileImport.retornaListaDeFrases("Clientes.txt", ";");

		for (String[] strings : frases) {
			Cliente cliente = new Cliente(strings[0], strings[1], strings[3], strings[2]);
			if (!clientes.values().contains(cliente))
				clientes.put(cliente.getCodigo(), cliente);
		}

		return Collections.unmodifiableMap(clientes);
	}

}
