
// Exemplo de recusão binária em que um retorno de dupla recursão é realizado. 
// Revisar. Não compreendido muito bem algoritmos da apostila. 

public class SomatoriaBinaria {

	public static void main(String[] args) {
		// Declaração do vetor
		int[] vetor = {1, 2, 3, 4, 5};
		
		// Imprimindo o vetor ordem direta
		System.out.println("VETOR INICIAL");
		System.out.println();
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d]: %d", i, vetor[i]);
			System.out.println();
			soma += vetor[i];
		}
		
		// Imprimindo a soma do vetor
		System.out.println("Somatório iterativo: " + soma);
		System.out.println();
		System.out.println("A soma do vetor é dada por: " + somatorioBinario(vetor, 0, vetor.length));

	}
	
	// Método recursivo binário
	public static int somatorioBinario(int[] vetor, int indexInicial, int indexFinal) {
		// caso báisco
		// Ocorre quando o index final é igual a 1. Nesse caso retorna o valor do primeiro index, index zero. 
		if(indexFinal == 1) {
			return vetor[indexInicial];
		// Caso recursivo
		// Divide um vetor em duas partes e aplica o método recursivo
		} else {
			// Metade inferior do vetor. De 0 até a metade
			return somatorioBinario(vetor, indexInicial, (indexFinal + 1) / 2) + 
					// Metade superior do vetor. Da metade até o final.
					somatorioBinario(vetor, indexInicial + (indexFinal + 1) / 2, indexFinal / 2);
			
			
		}
		
	}

}
