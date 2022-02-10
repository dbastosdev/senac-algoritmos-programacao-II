/*
 * Esse programa conta com atualização na entrada de dados para popular o vetor de busca
 * e além disso, atualização do metodo de busca para otimizar a busca sequêncial. 
 * 
 * Caso de teste: 
 * 5 itens no vetor
 * 1, 2, 3, 5, 6
 * valor buscado 4
 * 
 * resultado: valor não encontrado. Será buscado até o valor 3, índice 2 do vetor. Pois 5 já é maior
 * que o valor procurado. 
 */


package app;

import java.util.Scanner;

public class BuscaSequencialOtimizada {
	public static void main(String[] args) {
		
		// Configuração do Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaração do vetor:
		int vetor [];
		

		// Instanciando o vetor
		System.out.println("Digite a quantidade de itens do vetor:");
		int n = sc.nextInt();
		vetor = new int[n];
		
		System.out.println();
		
		// Populando o vetor:
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite o valor do índice vetor[%d]: ", i);
			vetor[i] = sc.nextInt();
		}
		
		// Quebra de linha
		System.out.println();
		
		
		// Valor procurado:
		System.out.println("Digite o valor procurado:");
		int valorProcurado = sc.nextInt();
		
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
	
	/* Método para busca do valor no vetor */
	
	/*
	 * Enquanto o valor de i for menor que o tamanho do vetor a busca dentro do vetor continua. 
	 * Caso o valor seja encontrado, a busca se encerra. 
	 * Esse método considera um vetor ordenado. Isso gera um ganho para busca. Pois se o valor buscado
	 * for inferior ao valor do vetor[i] a busca também se encerra. 
	 */
	
	public static int buscaSequencial(int[] vetorDeEntrada, int valorBuscado) {
		for(int i = 0; i < vetorDeEntrada.length; i++) {
			if(vetorDeEntrada[i] == valorBuscado) {
				// Quando há um retorno, o bloco do método é encerrado
				return i;
			} else if(valorBuscado < vetorDeEntrada[i]) {
				return -1;
			}
			// Contagem de voltas nas buscas
			System.out.println("volta de busca: " + i + " - valor:" + vetorDeEntrada[i]);
		}
		
		return -1;
	}
}
