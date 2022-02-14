
public class FatorialRecursivo {

	public static void main(String[] args) {
		
		// Teste e uso da função recursiva
		for(int i = 0; i < 6; i++) {
			System.out.printf("O fatorial de %d é igual a: %d", i, calculoFatorialRecursivo(i));
			System.out.println();
		}

	}
	
	// Método do fatorial de forma recursiva
	public static int calculoFatorialRecursivo(int numero) {
		
		// Caso base: caso que o método sabe solucionar e retorna resultado
		if(numero == 0) {
			return 1;
		} else {
			// Caso recursivo. Particiona o problema em unidades menores e chama novamente a função de recursão
			// A cada passo recursivo a função chama novamente ela própria subtraindo uma unidade até que chegue o caso base
			// quando o resultado é 1 e a pilha de execução dos métodos recursivos começa a retornar os resultados
			return numero * calculoFatorialRecursivo(numero - 1);
		}
	}

}
