package br.com.univali.kob.poo.pizzaria.item;

import org.junit.Assert;
import org.junit.Test;

public class ItemMenuTeste {

	@Test
	public void testaCodItemMenuEMaiorQuePenultinoItemMenu() {
		ItemMenu itemMenu = new ItemMenu(0, null, null);
		ItemMenu itemMenu2 = new ItemMenu(0, null, null);

		Assert.assertEquals(itemMenu.getCodigo() + 1, itemMenu2.getCodigo());
	}

}
