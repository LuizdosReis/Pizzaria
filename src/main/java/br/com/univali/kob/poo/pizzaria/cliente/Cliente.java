package br.com.univali.kob.poo.pizzaria.cliente;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */

public class Cliente implements Cloneable {
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private int codigo;
	private static int proxCodigo = 1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cpf == null ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	protected Cliente clone() throws CloneNotSupportedException {
		Cliente clone = (Cliente) super.clone();
		clone.codigo = this.codigo;
		clone.cpf = this.cpf;
		clone.endereco = this.endereco;
		clone.telefone = this.telefone;
		return clone();
	}

	public Cliente(String nome, String telefone, String endereco, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.codigo = proxCodigo++;
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

	public int getCodigo() {
		return codigo;
	}

}
