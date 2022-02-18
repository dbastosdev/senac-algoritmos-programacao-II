/*
 * Trata-se de um dos algoritmos de busca sofisticado. Utiliza o conceito de divisão, conquista e e combinação. Logo, vale-se muito de
 * técnicas de recursão. 
 * 
 * Esse algoritmo possui um processo mais simples e eficiênte. 
 * 
 * Caso básico: O vetor possui apenas um único elemento ou então se ele for vazio, retorna o próprio vetor. 
 * 
 *  Caso recursivo: Se o vetor possuir dois ou mais elementos, esses devem ser divididos em subconjuntos. 
 *  
 *  O merge sort é mais rápido que o bubble sort, insertion sort e o selection sort( mais lento).
 * 
 */

public class MergeSort {

	public static void main(String[] args) {
		// Declaração do vetor desordenado
		int[] vetor = {31, 10, 29, 42, 51, 19, 83, 7};
		
		// Imprimindo o vetor na tela
		System.out.println("Vetor original: \n");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vd[%d]: %d %n", i, vetor[i]);
		}
		
		// Ordenando o vetor
		sort(vetor, 0, vetor.length - 1);
		
		// Imprimindo o vetor ordenado na tela
		System.out.println(" \nVetor ordenado com merge sort: \n");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vo[%d]: %d %n", i, vetor[i]);
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
