/*
 * Em seu pior caso, o quick sort terá o número de operações igual a nˆ2. Contudo, espera-se que seu tempo de execução seja n * log n
 * assim como no merge sort. Diferente do merge sort, a parte mais que possui o menor desempenho são as chamadas recursivas. 
 * Todas as chamadas recursivas são realizadas com base no pivo.
 * 
 * O processo de divisão e conquista é realizado com base na divisão do vetor de entrada em 3 outros vetores. 
 * -> um vetor com elementos menores que o pivô;
 * -> um vetor com elementos iguais ao vetor;
 * -> um vetor com elementos maiores que o pivô. 
 * 
 * O pivô pode ser um índice aleatório do vetor. Recomenda-se o início ou o fim. Mas nunca o meio pois essa posição pode não mais existir
 * ao longo da execução do algoritmo. A cada chamada recursiva o pivo é recalculado e os subvetores criados, até que haja apenas dois
 * elementos e esses possam ser unidos novamente de forma ordenada.
 * 
 * O pior caso desse algoritmo ocorre quando é usado um vetor já ordenado. Contuido, é a melhor opção para ordenação. 
 */


public class QuickSort {

	public static void main(String[] args) {
		// Declaração do vetor desordenado
		int[] vetor = {29, 10, 36, 18, 83, 42, 8, 20};
		
		// Imprimindo o vetor na tela
		System.out.println("Vetor original: \n");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vd[%d]: %d %n", i, vetor[i]);
		}
		
		// Ordenando o vetor
		sort(vetor, 0, vetor.length - 1);
		
		// Imprimindo o vetor ordenado na tela
		System.out.println(" \nVetor ordenado com quick sort: \n");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vo[%d]: %d %n", i, vetor[i]);
		}

	}
	
	// método estático recursivo de divisão do vetor
	public static void sort(int[] vetor, int inicio, int fim) {
		// Enquanto o indice de inicio é menor que o indice do fim, calcula-se um pivot, e chama-se recursivamente o método sort para
		// prosseguir com a divisão do vetor
		if(inicio < fim) {
			// Chama método para cálculo do pivot
			int pivot = divide(vetor, inicio, fim);
			// Chamadas recursivas
			sort(vetor, inicio, pivot - 1);
			sort(vetor, pivot + 1, fim);
		}
		
		// No caso base, assim como no merge sort, simplesmente sai do método. 
	}

	private static int divide(int[] vetor, int inicio, int fim) {
		// O pivo, é sempre o ínidice zero. Ou seja, o início do vetor. 
		int pivot = vetor[inicio];
		
		int postPivot = inicio;
		for(int i = inicio + 1; i <= fim; i++) {
			// Organização dos itens menores que o pivô
			if(vetor[i] < pivot) {
				vetor[postPivot] = vetor[i];
				vetor[i] = vetor[postPivot + 1];
				postPivot++;
			}
		}
		vetor[postPivot] = pivot;
		return postPivot;
	}

}
