package br.com.univali.kob.poo.pizzaria.teste;

/**
 *
 * @author Marcello Thiry
 */
public class RelatorioSequencia extends Relatorio {
    
    private int atual = 10;
    
    public RelatorioSequencia(int numLinhas) {
        super(numLinhas);
    }
    
    @Override
    protected void imprimirLinha() {
        System.out.println(atual);
        atual += 10;
    }
    
}
