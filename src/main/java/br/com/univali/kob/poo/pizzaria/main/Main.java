package br.com.univali.kob.poo.pizzaria.main;

import java.io.FileNotFoundException;

import br.com.univali.kob.poo.pizzaria.sistema.Pizzaria;

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
    	Pizzaria pizzaria = new Pizzaria(20);
    	pizzaria.executa();
    	
    }
    
}
