
public class BubbleSortOtimizado2 {

public static void main(String[] args) {
				
		// Declaração do vetor
		int[] vetor = {36, 12, 29, 42, 10, 83};
		
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
		
		// Flag que indica que ainda é necessário executar o algoritmo de troca
		// Enquanto a flag é true, o laço mais longo é executado. 
		// Na prática, faz o laço do primeiro for se comportar como um Do while. Se não houver uma troca realizada, só o primeiro laço
		// é executado. Se houver troca, o laço externo com i = 1 é executado. Até que não haja mais trocas a serem realizdas. 
		boolean flag = true;
		
		for(int i = 0; i < vetor.length && flag == true; i++) {
			
			// Troca o estado da flag para falso. Ou seja, se o vetor já for ordenado, apenas um laço longo é executado. 
			flag = false;
			
			for(int j = 0; j < vetor.length - 1 - i; j++) {
								
				// Se o elemento atual é maior que o elemento do indice seguinte, realiza a troca dos elementos. 
				if(vetor[j] > vetor[j + 1]) {
					int variavelAuxiliar = 0;
					variavelAuxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = variavelAuxiliar;
					
					// Caso ainda haja troca sendo realizada, volta a flag para true. Assim indica que um laço longo deve ser
					// chamado novamente. 
					flag = true;
					
				}
				// Marcador dos laços. 
				System.out.println("laço longo - repetições para ordenar: " + i + " laço curto - efetua trocas: " + j);
			}
			
		}
		
		return vetor;
	}
	
	
}