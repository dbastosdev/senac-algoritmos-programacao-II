package solucoes;

public class Exercicio2 {

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
		a1 = insertionSort(a1);
		a2 = insertionSort(a2);
		a3 = insertionSort(a3);
		
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
	
	public static int[] insertionSort(int[] vetor) {
		for(int i = 1; i < vetor.length; i++) {
			int valorSelecionado = vetor[i];
			for(int j = i - 1; j >= 0; j--) {
				
				if(valorSelecionado < vetor[j]) {
					// Realiza a troca
					// A troca ocorre sempre com elementos do vetor baseados no índice j. Pois é esse o índice variável nesse laço.
					vetor[j + 1] = vetor[j];
					vetor[j] = valorSelecionado;
				}
				
				
			}
		}
		
		return vetor;
	}

}
