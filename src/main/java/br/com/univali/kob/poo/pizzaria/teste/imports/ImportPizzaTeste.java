package br.com.univali.kob.poo.pizzaria.teste.imports;

import java.io.FileNotFoundException;
import java.util.Collection;

import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorPizzas;

public class ImportPizzaTeste {
	public void importaPizzaTeste() throws FileNotFoundException{
		LeitorPizzas leitor = new LeitorPizzas();
		Collection<ItemMenu> itensMenu = leitor.importaItensMenu();
	
		for (ItemMenu i : itensMenu) {
			System.out.println(i);
		}
		
	}
	

}
