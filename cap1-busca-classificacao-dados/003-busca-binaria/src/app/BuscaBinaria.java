/*
 * A busca binária exige que o a lista ou vetor esteja ordenado.  
 * a ideia é descartar o maior número de elementos através da subdivisão do vetor principal em 
 * dois subvetores. A subdivisão deve ser baseada no ponto central dos dados, de forma eliminar o maior
 * número de ocorrências possíveis. A busca binária é O(log n). Conforme a quantidade de elementos aumenta
 * maior é a eficiência desse algoritmo quando comparado a busca sequencial. 
 * 
 * A busca binária é a mais rápida entre as buscas. A partir do vetor ordenado, a busca binária subdivide o vetor original em subvetores menores descartando um subvetor quando esse
 * está fora do intervalo dos valores buscados. A solução ótima é baseada na divisão na metade do conjunto de dados. Essa estratégia reduz a complexidade da busca de n, quando 
 * são realizados n passos igual ao tamanho do vetor para encontrar o valor buscado para log n. Conforme o conjunto de dados aumenta, mais otimizada é a busca binária. 
 * 
 * 
 */

package app;

public class BuscaBinaria {

	public static void main(String[] args) {
		
		// Declaração do vetor
			 //índices: 0  1   2   3   4   5   6    7   
		int[] vetor = {10, 15, 29, 35, 83, 98, 100, 102};
		
		// Testes de busca: 
		
		int teste = buscaBinaria(vetor, 102);
		
		if(teste > -1) {
			System.out.println("O valor buscado está no índice: " + teste);
		} else {
			System.out.println("O valor buscado não foi encontrado no vetor");
		}
		
	}
	
	// Método de busca binária
	public static int buscaBinaria(int[] vetor, int valorProcurado) {
		
		// Aqui são declarados os índices inicial e final do vetor para que seja possível encontrar
		// o primeiro ponto de busca que é o meio do vetor
		
		int posicaoInicial = 0;
		int posicaoFinal = vetor.length - 1;
		
		// Enquanto o índice de início e fim não são os mesmos repete
		while(posicaoInicial <= posicaoFinal) {
			// Encontrando o meio do vetor
			int posicaoDoMeio = (posicaoInicial + posicaoFinal) / 2;
			
			// Checa se o valor procurado é igual ao valor do meio do vetor. Caso não seja, decarta metade 
			// do vetor e atualiza os índices de início ou fim do vetor e repete o processo. Caso seja, 
			// retorna o valor da posicao do meio no índice. 
			if(vetor[posicaoDoMeio] < valorProcurado ) {       // atualiza a posição inicial se o valor procurado for maior
				posicaoInicial = posicaoDoMeio + 1;
			} else if(vetor[posicaoDoMeio] > valorProcurado) { // atualiza a posição final se o valor procurado for menor
				posicaoFinal = posicaoDoMeio - 1;
			} else {
				return posicaoDoMeio; 						   // retorna a posição do meio pois é igual ao valor buscado
			}
			
			// Com log n, para 8 valores, temos no máximo 3 voltas. 
			System.out.println("Índice da posição do meio: " + posicaoDoMeio);
		}
		
		// Caso o valor buscado não se encontre no vetor, retorna -1 indicando que a busca não obteve sucesso. 
		return -1;
	}

}
