package solucoes;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Utiliza-se função nanomilis  
		 */
		
		// Declaração do vetor
		System.out.println();
		int[] a1 = {36, 15, 75, 2, 16, 48, 42, 51};
		int[] a2 = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int[] a3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		// Ordenação do vetor
		
		System.out.println("Resultados do buble Sort");
		System.out.println();
		long ti = System.nanoTime();
		a1 = bubbleSort(a1);
		long tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		ti = System.nanoTime();
		a2 = bubbleSort(a2);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		ti = System.nanoTime();
		a3 = bubbleSort(a3);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		//############
		
		System.out.println();
		System.out.println("Resultados do Insertion Sort");
		System.out.println();
		ti = System.nanoTime();
		a1 = insertionSort(a1);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		ti = System.nanoTime();
		a2 = insertionSort(a2);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		ti = System.nanoTime();
		a3 = insertionSort(a3);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		//############
		
		System.out.println();
		System.out.println("Resultados do Selection Sort");
		System.out.println();
		ti = System.nanoTime();
		a1 = selectionSort(a1);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		ti = System.nanoTime();
		a2 = selectionSort(a2);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
		
		ti = System.nanoTime();
		a3 = selectionSort(a3);
		tf = System.nanoTime();
		
		System.out.printf("O vetor a demora: %d ns para ordenar%n", tf - ti);
						
				

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
		
		// Método insertion sort
		public static int[] insertionSort(int[] vetor) {
			
			// laço externo. Percorre cada um dos elementos a partir do índice 1 para compará-lo com os elementos a sua esquerda
			for(int i = 1; i < vetor.length; i++) {
				// Variável auxiliar que guarda o elemento selecionado a partir do índice 1 até o índice length - 1.
				// Esse elemento será inserido na sua posição correta, do menor para o maior ao longo do vetor
				int valorSelecionado = vetor[i];
			
			    // laço interno para comparação de cada um dos elementos à esquerda do elemento selecionado. 
				// A comparação é feita do índice mais a direita até o mais a esquerda. ex. indice 5 com o 4, 5 com o 3 ...
				// Se o vetor j, ou seja, à esquerda do valor selecionado for maior que o elemento selecionado, ocorre a troca. 
				// Note que o valor posicional do ValorSelecionado vai decrescendo juntamente com o valor em caso de troca. 
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
