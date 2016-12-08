package br.com.univali.kob.poo.pizzaria.cliente;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Cliente
{

	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;

	public Cliente(String nome, String telefone, String endereco, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getCpf() {
		return this.cpf;
	}

}

