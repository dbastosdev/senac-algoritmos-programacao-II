/*
 * Fatorial recursivo: 
 * Ligeiramente melhor no processamento, contudo consome um pouco mais de memória.
 * 
 * Fatorial iterativo: 
 * Consome menos memória, contudo leva mais tempo de processsamento. 
 * */

package solucoes;

public class FatorialIterativo {

	public static void main(String[] args) {
		
		// Teste do fatorial iterativo
		for(int i = 1; i < 11; i++) {
			System.out.printf("%d! = %d", i, calculoFatorialRecursivo(i));
			System.out.println();
		}

	}
	
	// Método para cálculo do fatorial iterativo
	public static int calculoFatorial(int numero) {
		int total = 1;
		if(numero == 1) {
			return 1;
		} else {
			for(int i = 1; i < numero; i++) {
				total += total * (numero - i);
			}
			
			return total;
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
