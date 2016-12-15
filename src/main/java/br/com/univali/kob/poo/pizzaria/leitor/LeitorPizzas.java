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

		//retira o caracter "," da string
		for (String[] strings : frases) {
			strings[0] = strings[0].replace("<", "");
		}

		// importa a quantidade de tamanhos das pizzas 
		int quantidadeDeTamanhos = Integer.parseInt(frases.get(0)[0]);

		// ira guarda os tamanhos 
		List<Tamanho> tamanhos = new ArrayList<>();

		//importa os tamanhos
		for (int i = 1; i < quantidadeDeTamanhos * 2; i += 2)
			tamanhos.add(new Tamanho(Integer.parseInt(frases.get(i + 1)[0]), frases.get(i)[0]));

		// importa a quantidade de tipos de pizzas
		int quantidadeDePizzas = Integer.parseInt(frases.get(quantidadeDeTamanhos * 2 + 1)[0]);
		
		// ira guarda a quantidade de ingredientes de cada pizza
		int quantidadeDeIngredientes;
		//guarda todos os ingredientes
		Collection<Ingrediente> ingredientes = new HashSet<>();

		// importa os itens de menu
		for (int i = quantidadeDeTamanhos * 2 + 2; i < frases.size();) {
			// recebe a quantidade de ingredientes da pizza 
			quantidadeDeIngredientes = Integer.parseInt(frases.get(i+1)[0]);
			
			// guarda os ingredientes de cada pizza
			Collection<Ingrediente> ingredientesDaPizza = new HashSet<>();
			
			//importacao dos ingredientes
			for (int j = i + 2; j <= quantidadeDeIngredientes + i;j++) {
				Ingrediente ingrediente = new Ingrediente(frases.get(j)[0]);
				
				// verifica se o ingrediente ja existe
				if (ingredientes.contains(ingrediente)) {
					// se o ingrediente ja existe, usa o ingrediente que ja esta criado para adicionar na pizza
					for (Ingrediente ingr : ingredientes) {
						if (ingr.equals(ingrediente))
							ingrediente = ingr;
					}
					// salva o ingrediente da lista na pizza
					ingredientesDaPizza.add(ingrediente);
				} else {
					// senao salva o ingrediente na lista de ingredientes e na lista de ingredientes da pizza
					ingredientes.add(ingrediente);
					ingredientesDaPizza.add(ingrediente);
				}
			}
			
			//cria uma pizza passando o nome da pizza e a lista de ingredientes
			Pizza pizza = new Pizza(frases.get(i)[0], ingredientesDaPizza);
			
			// cria os items de menu com os tamanhos, precos e a pizza
			for (int j = 0; j < quantidadeDeTamanhos; j++) {
				ItemMenu itemMenu = new ItemMenu(Double.parseDouble(frases.get(i+quantidadeDeIngredientes+j+2)[0]), pizza, tamanhos.get(j));
				itensMenu.add(itemMenu);
			}
			
			// salto do for baseado na quantidade de ingrediente + quantidades de tamanhos 
			i += quantidadeDeIngredientes+quantidadeDeTamanhos+2;
		}
		
		return itensMenu;

	}

}
