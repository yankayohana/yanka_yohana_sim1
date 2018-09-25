package yanka_yohana_sim1;

/**
 * representa o cardápio virtual.
 * 
 * @author yanka yohana
 *
 */
public class Cardapio {

	private String nomeEstabelecimento;
	private Item[] itens;

	public Cardapio(String nomeEstabelecimento, int tamanhoCardapio) {
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.itens = new Item[tamanhoCardapio];

	}

	@SuppressWarnings("unused")
	public void adicionaItens(Item item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				itens[i] = item;
			}
			break;
		}
	}

	public String listaCardapio() {
		String vazia = "";
		for (int i = 0; i < itens.length; i++) {
			vazia += i + 1 + " - " + itens[i].toString();

		}
		return vazia;
	}

	public int calcularCaloriasRefeicao(String[] refeicao, String tamanhoRefeicao) {
		int soma = 0;
		boolean achou = false;
		for (int i = 0; i < itens.length; i++) {
			for (int j = 0; j < refeicao.length; i++) {
				if (itens[i].getNome().equals(refeicao[j])) {
					achou = true;
					if (tamanhoRefeicao.equals("padrão")) {
						soma += itens[i].getCalorias();
					} else if (tamanhoRefeicao.equals("grande")) {
						soma += itens[i].getCalorias() * 2;
					} else if (tamanhoRefeicao.equals("mega")) {
						soma += itens[i].getCalorias() * 3;
					}
				}
			} if(achou == false) {
				throw new IllegalArgumentException();
			}
		} return soma;

	}

}
