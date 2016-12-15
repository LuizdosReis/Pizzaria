package br.com.univali.kob.poo.pizzaria.leitor;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Map;

import org.junit.Test;

import br.com.univali.kob.poo.pizzaria.cliente.Cliente;

public class LeitorClientesTest {

	@Test
	public void testaImporta��oDeClienteAPartirDeUmArquivo() throws FileNotFoundException {
		LeitorClientes leitor = new LeitorClientes();
		Map<Integer, Cliente> clientes = leitor.importaClientes();

		assertTrue("Importa��o n�o efetuada", !clientes.isEmpty());

	}

}
