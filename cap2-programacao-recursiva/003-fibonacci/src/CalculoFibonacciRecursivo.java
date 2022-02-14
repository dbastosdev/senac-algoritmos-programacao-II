// Indica o n-zimo número da sequencia de fibonacci. 


public class CalculoFibonacciRecursivo {

	public static void main(String[] args) {
		// teste de fibonacci recursivo
		for(int i = 0; i < 11; i++) {
			System.out.printf("O #%d número fibonacci é: %d%n", i, calculoFibonacciRecursivo(i));
		}
			

	}
	
	// Método estático para cálculo de Fibonacci
	public static Integer calculoFibonacciRecursivo(Integer numero) {
		
		// Para entender o código, basta olhar para fórmula. Exceto por 0 e 1 que possuem o resulado padrão definido, todos os outros
		// termos da serie de fibonacci são a somas dos dois últimos números da série. 
		
		if(numero == 0) {
			return 0;
		} else if(numero == 1){
			return 1;
		}
		else {
			return calculoFibonacciRecursivo(numero -1) + calculoFibonacciRecursivo(numero - 2);
		}
	}

}
