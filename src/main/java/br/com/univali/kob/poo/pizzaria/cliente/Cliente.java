
package br.com.univali.kob.poo.pizzaria.cliente;

public class Cliente {
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private int codigo;
	private static int proxCodigo = 1;

	public Cliente(String nome, String telefone, String endereco, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.codigo = proxCodigo++;
	}

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

	@Override
	public String toString() {
		return nome;
	}

	@Override
	protected Cliente clone() throws CloneNotSupportedException {
		return (Cliente) super.clone();
	}

}
