package br.com.univali.kob.poo.pizzaria.main;

import java.io.FileNotFoundException;

import br.com.univali.kob.poo.pizzaria.teste.imports.ImportClientesTestes;
import br.com.univali.kob.poo.pizzaria.teste.imports.ImportPizzaTeste;
import br.com.univali.kob.poo.pizzaria.teste.io.FileImportTeste;

/**
 *
 * @author luizhenrique
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
    	ImportPizzaTeste t = new ImportPizzaTeste();
    	t.importaPizzaTeste();
    }
    
}
