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


		List<ItemMenu> itensMenu = new ArrayList<>();
		Set<Ingrediente> ingredientes = new HashSet<>();
		int quantidadeDeIngredientes;
		for (int i = quantidadeDeTamanhos * 2 + 3; i < frases.size();){
			quantidadeDeIngredientes = Integer.parseInt(frases.get(i+1)[0]);
			for (int j = i+2; j < quantidadeDeIngredientes+i+2; j++) {
				
			}
			
		}
		
		
		return itensMenu;

	}

}
