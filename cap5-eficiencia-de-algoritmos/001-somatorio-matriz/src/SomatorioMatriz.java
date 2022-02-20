/*
 * Notação assíntotica desse algoritmo: O(n²), pois é n para o laço mais externo e n para o mais interno. Sendo necessário passar por todos os elementos. 
 */

public class SomatorioMatriz {

	public static void main(String[] args) {
		// Matriz
							// linha 0          linha 1              linha 2
		int[][] matriz = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };
		// indices          0  1  2  3  4  
		
		System.out.println("O somatório dos termos da matriz é: " + somatorioDeMatriz(matriz));		

	}
	
	// Método iterativo
	private static int somatorioDeMatriz(int[][] matriz) {
		int soma = 0;
		// itera sobre as linhas
		for(int i = 0; i < matriz.length; i++) {
			// itera sobre colunas
			for(int j = 0; j < matriz[0].length; j++) {
				soma += matriz[i][j];
			}
		}
		
		return soma;
	}
}
