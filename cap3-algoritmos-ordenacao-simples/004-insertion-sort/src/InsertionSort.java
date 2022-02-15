/*
 * Esse algoritmo é bem otimizado. Pois só realiza as comparações se o algarismo à esquerda for maior que o número selecionado. 
 * Do contrário, ele salta o laço interno e segue para o próximo valor. 
 */


public class InsertionSort {

	public static void main(String[] args) {
		// Declaração do vetor
		System.out.println("VETOR DESORDENADO: ");
		int[] vetor = {36, 12, 29, 42, 10, 83};
		
		// Imprimindo o vetor desordenado
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}
		
		System.out.println();
		
		// Ordenação do vetor
		vetor = insertionSort(vetor);
		
		System.out.println();
		
		// Imprimindo o vetor ordenado
		System.out.println("VETOR ORDENADO: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}

	}
	
	// Método insertion sort
	public static int[] insertionSort(int[] vetor) {
		
		// laço externo. Percorre cada um dos elementos a partir do índice 1 para compará-lo com os elementos a sua esquerda
		for(int i = 1; i < vetor.length; i++) {
			// Variável auxiliar que guarda o elemento selecionado a partir do índice 1 até o índice length - 1.
			// Esse elemento será inserido na sua posição correta, do menor para o maior ao longo do vetor
			int ValorSelecionado = vetor[i];
		
		    // laço interno para comparação de cada um dos elementos à esquerda do elemento selecionado. 
			// A comparação é feita do índice mais a direita até o mais a esquerda. ex. indice 5 com o 4, 5 com o 3 ...
			// Se o vetor j, ou seja à esquerda do valor selecionado for maior que o elemento selecionado, ocorre a troca. 
			// Note que o valor posicional do ValorSelecionado vai decrescendo juntamente com o valor em caso de troca. 
			for(int j = i - 1; j >= 0 && vetor[j] > ValorSelecionado; j--) {
				
				// Realiza a troca
				vetor[j + 1] = vetor[j];
				vetor[j] = ValorSelecionado;
			}
			
		}
		
		return vetor;
	}

}
