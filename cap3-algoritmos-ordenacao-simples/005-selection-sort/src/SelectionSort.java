
public class SelectionSort {

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
		vetor = selectionSort(vetor);
		
		System.out.println();
		
		// Imprimindo o vetor ordenado
		System.out.println("VETOR ORDENADO: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d] = %d", i, vetor[i]);
			System.out.println();
		}

	}
	
	public static int[] selectionSort(int[] vetor) {
		
		// Laço mais externo, guarda o índice em que deve estar o menor valor dentre todos os 
		// valores do vetor.
		for(int i = 0; i < vetor.length; i++) {
			
			// A cada incremento de i, o valor do índice de menor valor muda. 
			int indiceDoMenorValor = i;
			
			// Laço interno que percorre cada posição do vetor a partir da última posição
			// que foi o menor índice, a partir de i = 0. 
			// Extremamente importante realizar a comparação somente dos valores com índice superior
			// ao índice de menor valor atual. Do contrário gera erro. 
			for(int j = i + 1; j < vetor.length; j++) {
				// Avalia o valor com menor índice e armazena. 
				if(vetor[j] < vetor[indiceDoMenorValor]) {
					indiceDoMenorValor = j;
				}
			}
			
			// Após saber o índice do vetor com o menor valor, executa a troca. 
			int auxiliar = vetor[i];
			vetor[i] = vetor[indiceDoMenorValor];
			vetor[indiceDoMenorValor] = auxiliar;
			
		}
		
		return vetor;
	}

}
