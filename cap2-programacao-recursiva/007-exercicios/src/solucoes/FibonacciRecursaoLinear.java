/*
 * Implementação nada trivial de fibonacci. Estudar melhor o código para poder fazer interpretação. 
 * 
 * */

package solucoes;

public class FibonacciRecursaoLinear {

	public static void main(String[] args) {
		// teste de fibonacci recursivo
		for(int i = 0; i < 11; i++) {
			System.out.printf("O #%d número fibonacci é: %d%n", i, fibonacciLinear(i, 0, 1));
		}
		

	}
	
	// Método de recursão linear Fibonacci
	public static int fibonacciLinear(int numero, int a, int b) {
		if(numero == 0) {
			return a;
		} else if(numero == 1) {
			return b;
		} else {
			return fibonacciLinear(numero - 1, b, a + b);
		}
	}

}
