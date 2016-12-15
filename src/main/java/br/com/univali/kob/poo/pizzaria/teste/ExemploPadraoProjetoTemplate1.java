package br.com.univali.kob.poo.pizzaria.teste;

public class ExemploPadraoProjetoTemplate1 {

    public static void executarTesteRelatorioFibonacci() {
        RelatorioFibonacci rb = new RelatorioFibonacci(10);
        rb.imprimir();
    }
    
    public static void executarTesteRelatorioSequencia() {
        RelatorioSequencia rs = new RelatorioSequencia(10);
        rs.imprimir();
    }
        
    public static void main(String[] args) {
        executarTesteRelatorioFibonacci();
        executarTesteRelatorioSequencia();
    }
    
}
