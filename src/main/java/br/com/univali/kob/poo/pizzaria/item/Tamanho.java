package br.com.univali.kob.poo.pizzaria.item;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Tamanho
{

	private int fatias;
	private String descricao;
	
	
	public Tamanho(int fatias, String descricao) {
		super();
		this.fatias = fatias;
		this.descricao = descricao;
	}


	public int getFatias() {
		return fatias;
	}


	public String getDescricao() {
		return descricao;
	}


	@Override
	public String toString() {
		return "Tamanho [fatias=" + fatias + ", descricao=" + descricao + "]";
	}
	
	

}

