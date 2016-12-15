package br.com.univali.kob.poo.pizzaria.item;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */

public class Ingrediente implements Cloneable {
	private String nome;

	public Ingrediente(String nome) {
		this.nome = nome;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Ingrediente clone = (Ingrediente) super.clone();
		clone.nome = this.nome;
		return clone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (nome == null ? 0 : nome.hashCode());
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
		Ingrediente other = (Ingrediente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

}
