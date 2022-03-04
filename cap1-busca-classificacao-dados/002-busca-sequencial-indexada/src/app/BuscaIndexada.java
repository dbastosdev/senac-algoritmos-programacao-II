/*
 * Nesse tipo de busca não é recomendado o uso de um tipo abstrato de dado (TAD) do tipo lista ligada.
 * devido a possibilidade de gerar sobrecarga nos ponteiros de memória. 
 * 
 * A lista que será buscada deverá estar ordenada para o correto funcionamento do algoritmo.
 * 
 * Utiliza-se uma tabela auxiliar, chamada de índice para que o processo de busca seja otimizado. Esse índice contém um valor e seu índice no vetor de busca. 
 * Compara-se o valor buscado com os valores já conhecidos da tabela de índices. Assim, consegue-se delimitar o campo de busca de dados dentro da lista ou vetor pesquisado. 
 * 
 * 
 * */



package app;

public class BuscaIndexada {

	public static void main(String[] args) {
		
		// Vetor
		int[] vetor = {5, 8, 12, 18, 23, 27, 31, 35, 38, 42, 46, 49, 51, 55, 62};
		
		// Tabela de indíces previamente conhecidos
		int[] tabelaIndex = {31,6}; // Elemento 31 no índice 6 do vetor original a ser pesquisado 
		
		// Valor buscado
		int numeroBuscado = 12;
		
		// Defnição do limite de busca
		int limiteInferior = 0;
		int limiteSuperior = vetor.length;
		
		/*
		 * Caso o valor buscado seja inferior ao valor da tabela, o índice do elemento da tabela de index
		 * será o limite superior da região de busca. Caso o contrário, esse índice será o limite inferior.
		 * 
		 * */
		
		if(numeroBuscado < tabelaIndex[0]) {
			limiteSuperior = tabelaIndex[1];
		} else if(numeroBuscado > tabelaIndex[0]) {
			limiteInferior = tabelaIndex[1];
		}
		
		/* Usando o método de busca*/
		int respostaDaBusca = buscaIndexada(vetor, numeroBuscado, limiteInferior, limiteSuperior);
		System.out.println();
		
		// Tratamento e impressão da resposta obtida com o método. 
		if(respostaDaBusca < 0) {
			System.out.println("Valor não encontrado");
		} else {
			System.out.printf("O valor buscado: n. %d possui a posição de index: %d no vetor", numeroBuscado, respostaDaBusca);
		}


	}
	
	// Método para busca com base em um index.
	
	public static int buscaIndexada(int[] vetor, int valorBuscado, int limiteInferior, int limiteSuperior) {
		/* Realização da busca*/
		for(int i = limiteInferior; i < limiteSuperior; i++) {
			if(valorBuscado == vetor[i]) {
				return i;
			}
			
			System.out.printf("Indice: %d - Valor: %d do vetor ", i, vetor[i]);
			System.out.println();
		}
		return -1;
	}

}
