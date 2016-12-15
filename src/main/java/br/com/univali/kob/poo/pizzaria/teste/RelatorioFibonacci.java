package br.com.univali.kob.poo.pizzaria.teste;

/**
 *
 * @author Marcello Thiry
 */
public class RelatorioFibonacci extends Relatorio {
    
    private int atual = 0;
    private int anterior1 = 1;
    private int anterior2 = 1;
    
    public RelatorioFibonacci(int numLinhas) {
        super(numLinhas);
    }
    
    @Override
    protected void imprimirLinha() {
        System.out.println(atual);
        if (getLinhaAtual() < 3) {
            atual = 1;
        }
        else {
            atual = anterior1 + anterior2;
            anterior2 = anterior1;
            anterior1 = atual;
        }
    }
    
}
