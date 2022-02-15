
public class BubbleSortOtimizado {

	public static void main(String[] args) {
		
		// Declaração do vetor
		int[] vetor = {36, 12, 29, 42, 83, 10};
		
		// Imprimindo o vetor desordenado
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}
		
		System.out.println();
		
		// Ordenação do vetor
		vetor = bubbleSortOtimizado(vetor);
		
		System.out.println();
		
		// Imprimindo o vetor ordenado
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}

	}

	// Método para ordernação
	public static int[] bubbleSortOtimizado(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			// a cada laço para percorrer o vetor, são realizadas as comparações para ordenação.
			// Com o termo '-i' as últimas posições do array são ignoradas nas demais passagens pelo laço, pois o vetor faz a ordenação
			// do último elemento para o primeiro. Propagando o menor valor do vetor para o índice zero. 
			for(int j = 0; j < vetor.length - 1 - i; j++) {
				if(vetor[j] > vetor[j + 1]) {
					int variavelAuxiliar = 0;
					variavelAuxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = variavelAuxiliar;
					
				}
				// Marcador dos laços. 
				System.out.println("laço longo - repetições para ordenar: " + i + " laço curto - efetua trocas: " + j);
			}
			
		}
		
		return vetor;
	}
	
	
}
