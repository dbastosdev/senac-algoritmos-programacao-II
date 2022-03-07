import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * Vamos pegar o Exercicio2 e inserir mais uma tabela indexada. Com isso, a redução feita no exercício 2 de reduzir de 1000 para 10 elementos será estendida, reduzindo agora para 5 elementos. 
 * 
 * Não torna a aplicação mais performática. Pois a redução de 10 para 5 foi mínima, com uma base de dados maior, aí sim teríamos um ganho em performance. 
 */

public class Exercicio3 {
	// Declarando um vetor
	ArrayList<Integer> dados = new ArrayList<>();
	// Declarando uma estrutura de dados que armazena o conjunto de chave / valor
	Map<Integer, Integer> tabelaIndexada = new HashMap<Integer, Integer>();
	Map<Integer, Integer> tabelaIndexada2 = new HashMap<Integer, Integer>();
	
	// Construtor
	public Exercicio3() {
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
		
		for(int i = 2; i <= 10; i += 2) {
			tabelaIndexada2.put(i * 100, tabelaIndexada.get(i * 100));
		}
	}
	
	// Método de busca indexada da tabela 2
	public int buscaTabelaIndexada2(int elemento) {
		// percorrendo o map
		for(Integer chave : tabelaIndexada2.keySet()) {
			// Se os valores da tabela indexada forem maiores que o elemento buscado eu retorno o índice da tabela indexada que será o limite a ser percorrido na lista
			if(tabelaIndexada2.get(chave) > elemento) {
				return chave;
			}
		}
		
		return -1;
	}
	
	// método que retornará o índice do elemento dentro da lista ordenada, otimizado pela tabela indexada. 
	public int buscaTabelaIndexada(int elemento) {
		int posicaoMaxima = buscaTabelaIndexada2(elemento);
		if(posicaoMaxima < 0) return -1;
		for(int i = posicaoMaxima - 200; i <= posicaoMaxima; i += 100) {
			if(tabelaIndexada.get(i) > elemento) {
				return i;
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
