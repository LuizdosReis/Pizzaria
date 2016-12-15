package br.com.univali.kob.poo.pizzaria.leitor;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Map;

import org.junit.Test;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;

public class LeitorClientesTest {

	@Test
	public void testaImportaçãoDeClienteAPartirDeUmArquivo() throws FileNotFoundException {
		LeitorClientes leitor = new LeitorClientes();	
		Map<Integer,Cliente> clientes = leitor.importaClientes();
		
		System.out.println(clientes.isEmpty());
		
		assertTrue("Importação não efetuada", !clientes.isEmpty());
		
		
	}

}
