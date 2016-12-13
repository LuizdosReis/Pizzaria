package br.com.univali.kob.poo.pizzaria.teste.imports;

import java.io.FileNotFoundException;
import java.util.Collection;

import br.com.univali.kob.poo.pizzaria.item.Ingrediente;
import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.leitor.LeitorPizzas;

public class ListaDeIngredientesTeste {
	public void testaAlteracaoIngrediente() throws FileNotFoundException{
		LeitorPizzas leitor = new LeitorPizzas();
		Collection<ItemMenu> itensMenu = leitor.importaItensMenu();
		
		for (ItemMenu i : itensMenu) {
			if(i.getPizza().getNome().equals("ALHO E OLHO"))
				for (Ingrediente ingrediente : i.getPizza().getIngredientes()){
					if(ingrediente.getNome().equals("Mussarela"))
						i.getPizza().alteraIngrediente(ingrediente, "MussaleraModificada");
				}
		}
		
		for (ItemMenu i : itensMenu) {
			System.out.println(i);
		}
	}

}
