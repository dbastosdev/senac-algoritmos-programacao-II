import java.math.BigInteger;

public class FatorialBigInteger {

	public static void main(String[] args) {
		// Teste e uso da função recursiva
		for(int i = 1; i < 6; i++) {
			System.out.printf("O fatorial de %d é igual a: %d", i, calculoFatorialRecursivo(BigInteger.valueOf(i)));
			System.out.println();
		}
		
		// System.out.printf("O fatorial de %d é igual a: %d", 5, calculoFatorialRecursivo(BigInteger.valueOf(5)));

	}
	
	// Método do fatorial de forma recursiva
	public static BigInteger calculoFatorialRecursivo(BigInteger numero) {
		
		// Caso base: caso que o método sabe solucionar e retorna resultado
		
		// O tipo BigInteger possui uma serie de métodos para manipulação de seus dados, logo deve-se conhecer esses métodos para 
		// implementação de algoritmos. 
		
		if(numero.compareTo(BigInteger.ONE) < 1) {
			return BigInteger.ONE;
		} else {
			// Caso recursivo. Particiona o problema em unidades menores e chama novamente a função de recursão
			// A cada passo recursivo a função chama novamente ela própria subtraindo uma unidade até que chegue o caso base
			// quando o resultado é 1 e a pilha de execução dos métodos recursivos começa a retornar os resultados
			return numero.multiply(calculoFatorialRecursivo(numero.subtract(BigInteger.ONE)));
		}
	}

}
