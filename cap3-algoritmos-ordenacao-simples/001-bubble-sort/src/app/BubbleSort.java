package app;

public class BubbleSort {

	public static void main(String[] args) {
		// Declaração do vetor
		int[] vetor = {2,3,5,4,1};
		
		// Imprimindo o vetor desordenado
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}
		
		System.out.println();
		
		// Ordenação do vetor
		vetor = bubbleSort(vetor);
		
		System.out.println();
		
		// Imprimindo o vetor ordenado
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}

	}

	// Método para ordernação
	public static int[] bubbleSort(int[] vetor) {
		int troca = 0;
		// laço para percorrer o vetor n vezes, em que n é a quantidade de elementos do vetor. 
		// n voltas, permite que os valores menores ao final do vetor consigam ir para o ínicio
		for(int i = 0; i < vetor.length; i++) {
			// a cada laço para percorrer o vetor, são realizadas as comparações para ordenação.
			for(int j = 0; j < vetor.length - 1; j++) {
				// Se o elemento atual é maior que o elemento do indice seguinte, realiza a troca dos elementos. 
				if(vetor[j] > vetor[j + 1]) {
					int variavelAuxiliar = 0;
					variavelAuxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = variavelAuxiliar;
					troca++;
					
				}
				// Marcador dos laços. Note que é necessário fazer todos os laços para dar a resposta. 
				// Mesmo que o vetor já esteja ordenado no primeiro laço longo. 
				System.out.println("laço longo - repetições para ordenar: " + i + " laço curto - efetua trocas: " + j + "trocas " + troca);
			}
			
		}
		
		return vetor;
	}
	
	
}
