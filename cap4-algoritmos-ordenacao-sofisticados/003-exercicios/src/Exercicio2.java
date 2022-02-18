
/*
 * Comparação entre desempenhos: 
 * 
 * v1: 
 * 
 * v2: 
 * 
 * v3: 
 *  
 */

public class Exercicio2 {

	public static void main(String[] args) {
		// Declaração do vetor desordenado
		int[] v1 = {36,15,75,2,16,48,42,51};
		int[] v2 = {13,45,38,20,23,7,6,5,10,11};
		int[] v3 = {9,8,7,6,5,4,3,2,1};
		
		// Imprimindo os vetores na tela
		System.out.println("Vetor 1 - desordenado: \n");
		for(int i = 0; i < v1.length; i++) {
			System.out.printf("v1_d[%d]: %d %n", i, v1[i]);
		}
	
		System.out.println("\nVetor 2 - desordenado: \n");
		for(int i = 0; i < v2.length; i++) {
			System.out.printf("v2_d[%d]: %d %n", i, v2[i]);
		}	
		
		System.out.println("\nVetor 3 - desordenado: \n");
		for(int i = 0; i < v3.length; i++) {
			System.out.printf("v3_d[%d]: %d %n", i, v3[i]);
		}
		
		// Ordenando o vetor
		sort(v1, 0, v1.length - 1);
		sort(v2, 0, v2.length - 1);
		sort(v3, 0, v3.length - 1);
		
		// Imprimindo o vetor ordenado na tela
		System.out.println(" \nVetor 1 ordenado com Merge sort: \n");
		for(int i = 0; i < v1.length; i++) {
			System.out.printf("v1_o[%d]: %d %n", i, v1[i]);
		}
		
		System.out.println(" \nVetor 2 ordenado com Merge sort: \n");
		for(int i = 0; i < v2.length; i++) {
			System.out.printf("v1_o[%d]: %d %n", i, v2[i]);
		}
		
		System.out.println(" \nVetor 3 ordenado com Merge sort: \n");
		for(int i = 0; i < v3.length; i++) {
			System.out.printf("v1_o[%d]: %d %n", i, v3[i]);
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
