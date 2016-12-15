
package br.com.univali.kob.poo.pizzaria.item;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */

public class ItemMenu {

	private double preco;
	private int codigo;
	private Pizza pizza;
	private Tamanho tamanho;
	private static int proxCodigo = 1;

	public ItemMenu(double preco, Pizza pizza, Tamanho tamanho) {
		this.preco = preco;
		this.pizza = pizza;
		this.tamanho = tamanho;
		this.codigo = proxCodigo++;
	}

	public double getPreco() {
		return preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		return pizza + " " + preco;
	}

}
