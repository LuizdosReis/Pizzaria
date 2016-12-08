package br.com.univali.kob.poo.pizzaria.main;

import br.com.univali.kob.poo.pizzaria.teste.io.FileImportTeste;
import br.com.univali.kob.poo.pizzaria.teste.pizzaria.ImportClientesTestes;

/**
 *
 * @author luizhenrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ImportClientesTestes t = new ImportClientesTestes();
       t.testaImportacaoClientes();
    }
    
}
