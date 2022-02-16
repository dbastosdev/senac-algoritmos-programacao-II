package solucoes;

public class Exercicio1 {

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
		a1 = bubbleSort(a1);
		a2 = bubbleSort(a2);
		a3 = bubbleSort(a3);
		
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
	
	// Método estático bubble Sort simples: 
	public static int[] bubbleSort(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j + 1]) {
					troca(vetor, j, j + 1);
				}
			}
		}
		
		return vetor;
	}
	
	// Método de troca usado pelo bubble Sort. Troca a posição atual (valor maior) com o valor
	// da posição seguinte (valor menor)
	public static int[] troca(int[] vetor, int indiceMenor, int indiceMaior) {
		int auxiliar = vetor[indiceMaior];
		vetor[indiceMaior] = vetor[indiceMenor];
		vetor[indiceMenor] = auxiliar;
		
		return vetor;
	}

}
