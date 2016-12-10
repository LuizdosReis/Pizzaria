package br.com.univali.kob.poo.pizzaria.teste.imports;

import java.io.FileNotFoundException;

import br.com.univali.kob.poo.pizzaria.leitor.LeitorPizzas;

public class ImportPizzaTeste {
	public void importaPizzaTeste() throws FileNotFoundException{
		LeitorPizzas leitor = new LeitorPizzas();
		leitor.importaItensMenu();
	}

}
