package br.com.univali.kob.poo.pizzaria.cliente;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTeste {

	@Test
	public void testaCodClienteEMaiorQueDoPenultimoCliente() {
		Cliente cliente = new Cliente(null, null, null, null);
		Cliente cliente2 = new Cliente(null, null, null, null);

		Assert.assertEquals(cliente.getCodigo() + 1, cliente2.getCodigo());
	}

}
