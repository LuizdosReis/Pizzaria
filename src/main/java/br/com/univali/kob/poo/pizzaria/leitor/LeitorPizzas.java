package br.com.univali.kob.poo.pizzaria.leitor;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.univali.kob.poo.pizzaria.io.FileImport;
import br.com.univali.kob.poo.pizzaria.item.Ingrediente;
import br.com.univali.kob.poo.pizzaria.item.ItemMenu;
import br.com.univali.kob.poo.pizzaria.item.Pizza;
import br.com.univali.kob.poo.pizzaria.item.Tamanho;

public class LeitorPizzas {
	private Collection<ItemMenu> itensMenu = new HashSet<>();

	public Collection<ItemMenu> importaItensMenu() throws FileNotFoundException {
		List<String[]> frases = FileImport.retornaListaDeFrases("Pizzas.txt", ">");

		for (String[] strings : frases) {
			strings[0] = strings[0].replace("<", "");
		}

		int quantidadeDeTamanhos = Integer.parseInt(frases.get(0)[0]);

		List<Tamanho> tamanhos = new ArrayList<>();

		for (int i = 1; i < quantidadeDeTamanhos * 2; i += 2)
			tamanhos.add(new Tamanho(Integer.parseInt(frases.get(i + 1)[0]), frases.get(i)[0]));

		int quantidadeDePizzas = Integer.parseInt(frases.get(quantidadeDeTamanhos * 2 + 1)[0]);
		
		int quantidadeDeIngredientes;
		Collection<Ingrediente> ingredientes = new HashSet<>();

		for (int i = quantidadeDeTamanhos * 2 + 2; i < frases.size();) {
			quantidadeDeIngredientes = Integer.parseInt(frases.get(i+1)[0]);
			
			Collection<Ingrediente> ingredientesDaPizza = new HashSet<>();
			
			for (int j = i + 2; j <= quantidadeDeIngredientes + i;j++) {
				Ingrediente ingrediente = new Ingrediente(frases.get(j)[0]);
				if (ingredientes.contains(ingrediente)) {
					for (Ingrediente ingr : ingredientes) {
						if (ingr.equals(ingrediente))
							ingrediente = ingr;
					}
					ingredientesDaPizza.add(ingrediente);
				} else {
					ingredientes.add(ingrediente);
					ingredientesDaPizza.add(ingrediente);
				}
			}
			Pizza pizza = new Pizza(frases.get(i)[0], ingredientesDaPizza);
			
			for (int j = 0; j < quantidadeDeTamanhos; j++) {
				ItemMenu itemMenu = new ItemMenu(Double.parseDouble(frases.get(i+quantidadeDeIngredientes+j+2)[0]), pizza, tamanhos.get(j));
				itensMenu.add(itemMenu);
			}
			
			i += quantidadeDeIngredientes+quantidadeDeTamanhos+2;
		}
		
		for (ItemMenu i : itensMenu) {
			System.out.println(i);
		}
		
		System.out.println(itensMenu.size());

		return itensMenu;

	}

}
