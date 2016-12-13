package br.com.univali.kob.poo.pizzaria.teste.imports;

import java.io.FileNotFoundException;
import java.util.Map;

import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorPizzas;

public class ImportPizzaTeste {
	public void importaPizzaTeste() throws FileNotFoundException{
		LeitorPizzas leitor = new LeitorPizzas();
		Map<Integer, ItemMenu> itensMenu = leitor.importaItensMenu();
	
		for (ItemMenu i : itensMenu.values()) {
			System.out.println(i);
		}
		
	}
	

}
