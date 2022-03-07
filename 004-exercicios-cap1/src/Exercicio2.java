import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * Infelizmente, para quem não buscou conhecimento por fora o código é incompreensível. São utilizadas diversas API do Java sem o mínimo de suporte via material.  * 
 */

public class Exercicio2 {

		// Declarando um vetor
		ArrayList<Integer> dados = new ArrayList<>();
		// Declarando uma estrutura de dados que armazena o conjunto de chave / valor
		Map<Integer, Integer> tabelaIndexada = new HashMap<Integer, Integer>();
		
		// Construtor
		public Exercicio2() {
			// Classe de números aleatórios
			Random random = new Random();
			
			// Atribuindo dados à lista
			for(int i = 0; i <= 1000; i++) {
				dados.add(random.nextInt(1000)); // limita os números gerados de 0 até 1000
			}
			
			// Ordenando os dados da lista
			Collections.sort(dados);
			
			// Gerando a tabela indexada
			for(int i = 0; i <= 1000; i +=100) {
				tabelaIndexada.put(i, dados.get(i)); // Pega da lista ordenada os valores e índices
			}
		}
		
		// método que retornará o índice do elemento dentro da lista ordenada, otimizado pela tabela indexada. 
		public int buscaTabelaIndexada(int elemento) {
			// percorrendo o map
			for(Integer chave : tabelaIndexada.keySet()) {
				// Se os valores da tabela indexada forem maiores que o elemento buscado eu retorno o índice da tabela indexada que será o limite a ser percorrido na lista
				if(tabelaIndexada.get(chave) > elemento) {
					return chave;
				}
			}
			
			return -1;
		}
		
		public int busca(int elemento) {
			int posicaoMaxima = buscaTabelaIndexada(elemento);
			// caso não retorne valor positivo do método anterior, retorna -1 indicando que o item não existe na lista
			// Significa que o número buscado não existe na lista pois é maior que seus elementos
			if(posicaoMaxima < 0) {
				return -1;
			} else {
				for(int i = (posicaoMaxima -100); i < posicaoMaxima; i++ ) {
					if(dados.get(i) == elemento) {
						return i;
					}
				}
			}
			
			return -1;
			
		}	
}
