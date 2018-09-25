package yanka_yohana_sim1;

/**
 * representa um item do cardápio.
 * 
 * @author yanka yohana
 *
 */
public class Item {

	private String nome;
	private int calorias;

	public Item(String nome, int calorias) {
		this.nome = nome;
		this.calorias = calorias;
	}

	public String getNome() {
		return nome;
	}

	public int getCalorias() {
		return calorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Item other = (Item) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toString() {
		return this.nome + "-" + this.calorias + "calorias/porção";
	}

}
