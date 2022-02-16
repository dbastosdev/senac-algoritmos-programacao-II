package solucoes;

public class Exercicio3 {

	public static void main(String[] args) {
		// Declaração do vetor
		System.out.println("VETOR DESORDENADO: ");
		System.out.println();
		int[] a1 = {36, 15, 75, 2, 16, 48, 42, 51};
		int[] a2 = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int[] a3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		// Imprimindo o vetor desordenado
		for(int i = 0; i < a1.length; i++) {
			System.out.printf("a1[%d] = %d", i, a1[i]);
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < a2.length; i++) {
			System.out.printf("a2[%d] = %d", i, a2[i]);
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < a3.length; i++) {
			System.out.printf("a3[%d] = %d", i, a3[i]);
			System.out.println();
		}
		System.out.println();
		
		// Ordenação do vetor
		a1 = selectionSort(a1);
		a2 = selectionSort(a2);
		a3 = selectionSort(a3);
		
		// Imprimindo o vetor ordenado
		System.out.println("VETOR ORDENADO: ");
		System.out.println();
		for(int i = 0; i < a1.length; i++) {
			System.out.printf("a1[%d] = %d", i, a1[i]);
			System.out.println();
		}
		System.out.println();
		
		// Imprimindo o vetor ordenado
		for(int i = 0; i < a2.length; i++) {
			System.out.printf("a2[%d] = %d", i, a2[i]);
			System.out.println();
		}
		System.out.println();
		
		// Imprimindo o vetor ordenado
		for(int i = 0; i < a3.length; i++) {
			System.out.printf("a3[%d] = %d", i, a3[i]);
			System.out.println();
		}
		System.out.println();

	}


	
	public static int[] selectionSort(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			
			int menor = i;
			
			/*
			 * Pulo do gato aqui é fazer um avanço tanto no índice que é considerado menor, quanto nos ínidces que serão comparados. 
			 * A cada volta longa de i, o j avança uma casa, pois já ordenou o menor em sua posição correta. 
			 */
			
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[j] < vetor[i]) {
					menor = j;
				}
			}
			
			// troca após determinar o menor
			int auxiliar = vetor[i];
			vetor[i] = vetor[menor];
			vetor[menor] = auxiliar;
		}
		
		return vetor;
	}

}
