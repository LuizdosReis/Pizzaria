package br.com.univali.kob.poo.pizzaria.teste;

/**
 *
 * @author Marcello Thiry
 */
public abstract class Relatorio {
    
    private int numLinhas = 0;
    private int linhaAtual = 0;
    
    public Relatorio(int numLinhas) {
        this.numLinhas = numLinhas;
    }
    
    protected int getLinhaAtual() {
        return linhaAtual;
    }

    // solução permitida para a prova
    // cabeçalho e rodapé não precisavam ser redefinidos    
    protected void imprimirCabecalho() {
        System.out.println("Cabeçalho genérico");
    }
    
    protected void imprimirRodape() {
        System.out.println("Rodapé genérico");
    }
    
    protected abstract void imprimirLinha();
    
    // Corpo do relatório: template para qualquer relatório simples
    public void imprimir() {
        imprimirCabecalho();
        for (linhaAtual=1; linhaAtual<=numLinhas; linhaAtual++) {
            imprimirLinha();
        }
        imprimirRodape();
    }
    
}
