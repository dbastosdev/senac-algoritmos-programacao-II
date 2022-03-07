import java.util.ArrayList;

/*
 * A ideia é fazer com que a busca sequencial faça com que os elementos mais buscados vão para o início do vetor.
 * 
 * 
 */

public class Exercicio7 {
	
	// estrutura a ser percorrida
	ArrayList<Integer> dados = new ArrayList<>();
	
	// Método de busca e organização de dados
	public int busca(int elemento) {
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i) == elemento) {
				// fazendo troca
				if(i != 0) {
					troca(i);
				}
				// Retornando posição
				return i;
			}
		}
		
		return -1;
	}
	
	// método de troca
	// A troca só é realizada se o elemento for diferente de zero.
	public void troca(int posicao) {
		int aux = dados.get(posicao - 1);
		dados.set(posicao - 1, dados.get(posicao));
		dados.set(posicao, aux);
	}

}
