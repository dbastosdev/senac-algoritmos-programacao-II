/*
 * Iterativo: 
 * Um pouco mais lenta. 
 * Consumo de memória baixo. 
 * 
 * Recursivo: 
 * Bem mais rápida que a iterativa. 
 * 
 * */

package solucoes;

public class FibonacciIterativo {

	public static void main(String[] args) {
		
		// teste de fibonacci recursivo
		for(int i = 0; i < 11; i++) {
			System.out.printf("O #%d número fibonacci é: %d%n", i, fibonacciIterativo(i));
		}
				

	}
	
	// Fibonacci iter
	public static int fibonacciIterativo(int numero) {
		
		if(numero == 0) {
			return 0;
		} else if(numero == 1) {
			return 1;
		} else {
			int[] resultado = new int[numero];
			resultado[0] = 1;
			resultado[1] = 1;
			for(int i = 2; i < numero; i++) {
				resultado[i] = resultado[i - 1] + resultado[i - 2];
				//System.out.println(resultado[i]);
			}
			
			return resultado[resultado.length - 1];
		}
		
		
	}

}
