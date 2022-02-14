// Revisar: Não consegui desenvolver meu próprio algoritmo. 

package solucoes;

public class ProdutorioBinario {

	public static void main(String[] args) {
		// vetor
		int[] vetor = {1, 2, 3, 4};
		
		int resultado = produtorioBinario(vetor, 0, vetor.length - 1);
	
		System.out.println("O produtório é: " + resultado);
	}

	private static int produtorioBinario(int[] vetor, int inicio, int fim) {
		// Se a posição do início for maior que a posção final, retorna 1 que é o elemento neutro da multiplicação. 
		if(inicio > fim) {
			return 1;
		} 
		
		// Se os valores de index inicio e fim forem igual, retorna o valor do index atual
		if(inicio == fim) return vetor[inicio];
		
		// Caso recursivo
		int meio = (inicio + fim) / 2;
		return produtorioBinario(vetor, inicio, meio) * produtorioBinario(vetor, meio + 1, fim);
	}

	
}
