/*
 * Para realizar o processo de busca é necessário um conjunto de dados que geralmente são estruturados como um vetor (pode-se usar também uma lista ligada). 
 * Um vetor possui objetos classificados em índices de 0 a n-1, em que n é o tamanho do vetor.
 * 
 * Vetores são ótimos para serem percorridos e consultados. Listas ligadas são ótimos para adição e deleção de itens. O vetor possui tamanho rígido a lista ligada não, pois tem seu 
 * tamanho fragmentado na memória. Há a necessidade de percorrer todos os elementos dessa última para acesso a um determinado elemento. 
 * 
 * Vetores e listas são exemplos de TAD (Tipo abstrato de dado).
 * 
 * A busca linear ou sequencial é intuitiva. É realizada a comparação de cada valor do vetor com o número buscado. As condições de parada são as seguintes: 
 *  
 * 1. Encontrou o elemento procurado, e retorna a posição do vetor desse elemento;
 * 2. Não encontrou o elemento procurado e retornou um índice fora do array, geralemente o -1. 
 *  
 * 
 *  
 * 
 */

package app;

public class BuscaSequencial {

	public static void main(String[] args) {
		
		// Declaração do vetor:
		int vetor [] = {1, 2, 3, 4, 5};
		
		// Valor procurado:
		int valorProcurado = 3;
		
		int retorno = buscaSequencial(vetor, valorProcurado);
		
		// Impressão do vetor
		
		System.out.println("Vetor:");
		System.out.println();
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("[%d] => %d", i, vetor[i]);
			System.out.println();
		}
		
		// Quebra de linha
		System.out.println();
		System.out.println();
		
		if(retorno == -1) {
			System.out.println("O valor procurado não foi encontrado");
		} else {
			System.out.printf("O índice do valor %d é: %d", valorProcurado, retorno);
		}
		
	}
	
	// Método para busca do valor no vetor
	// O método é estático para poder ser usado sem instanciar no método main
	
	public static int buscaSequencial(int[] vetorDeEntrada, int valorBuscado) {
		for(int i = 0; i < vetorDeEntrada.length; i++) {
			if(vetorDeEntrada[i] == valorBuscado) {
				// Quando há um retorno, o bloco do método é encerrado
				return i;
			}
		}
		// Se passar por todos elementos e não retornar o índice, cai aqui e saí do método. 
		return -1;
	}
	

}
