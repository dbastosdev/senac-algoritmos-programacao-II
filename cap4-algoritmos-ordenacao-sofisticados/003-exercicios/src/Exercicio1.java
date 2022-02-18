
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


public class Exercicio1 {

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

	// Método estático de divisão / ordenaçao / classificação do vetor:
		public static void sort(int[] vetor, int indiceInicial, int indiceFinal) {
			// Ocorre as chamadas recusivas para dividir o vetor ao meio enquanto o indice do início é menor que o índice do fim. Até que o vetor 
			// esteja completamente dividido
			if(indiceInicial < indiceFinal) {
				// Código de calcular a metade do vetor e chamar recursivamente a divisão do vetor
				int meio = (indiceInicial + indiceFinal) / 2;
				// Chama o método de divisão recursiva do vetor para 0 até a metade
				sort(vetor, indiceInicial, meio);
				// Chama o método de divisão recursiva do vetor da metade + 1 até o final
				sort(vetor, meio + 1, indiceFinal);
				
				// Chama a implementação do método estático que faz o merge / mistura / fundi do vetor
				// A cada nova divisão o método merge é solicitado
				merge(vetor, indiceInicial, meio, indiceFinal);
				
			}
		}

		private static void merge(int[] vetor, int indiceInicial, int meio, int indiceFinal) {
			// Índices auxiliares
			int i, esquerda, direita;
			// Vetor auxiliar
			int[] vetorAuxiliar = new int[vetor.length];
			
			// Guarda os dados do vetor de entrada no vetor auxiliar
			for(i = indiceInicial; i <= indiceFinal; i++) {
				vetorAuxiliar[i] = vetor[i];
			}
			
			// Atualiza os índices auxiliares
			esquerda = indiceInicial;
			direita = meio + 1;
			i = indiceInicial;
			
			// Atualiza os dados do vetor de entrada, colocando os dados maiores à direita e os menores à esquerda.
			while(esquerda <= meio && direita <= indiceFinal) {
				if(vetorAuxiliar[esquerda] <= vetorAuxiliar[direita]) {
					vetor[i++] = vetorAuxiliar[esquerda++];
				} else {
					vetor[i++] = vetorAuxiliar[direita++];
				}
			}
			
			while(esquerda <= meio) {

				vetor[i++] = vetorAuxiliar[esquerda++];
				
			}
			
		}

}
