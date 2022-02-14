
/*
 * Recursão final: No método recursivo, não há operações matemáticas ou outras operações. Apenas chamdas recursivas. 
 */

public class InversaoDeVetor {

	public static void main(String[] args) {
		
		// Declaração do vetor
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Imprimindo o vetor ordem direta
		System.out.println("VETOR INICIAL");
		System.out.println();
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d]: %d", i, vetor[i]);
			System.out.println();
		}
		
		// Imprime o vetor invertido
		System.out.println();
		System.out.println("VETOR INVERTIDO");
		System.out.println();
		
		// Aplica o método recursivo para inversão do vetor
		vetor = inversaoDeVetor(vetor, 0, vetor.length - 1);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d]: %d", i, vetor[i]);
			System.out.println();
		}

	}
	
	// Método recursivo para inversão do vetor:
	
	public static int[] inversaoDeVetor(int[] vetor, int posicaoInicial, int posicaoFinal) {
		
		//  Variável auxiliar para assegurar a troca dos valores
		int aux = 0;
		
		// Caso base: 
		// Sempre que o valor das posições (índices do vetor) forem iguais, chega-se ao caso base e retorna o vetor. 
		if(posicaoInicial >= posicaoFinal) {
			return vetor;
			
		// Caso recursivo: 
		// Nesse caso, há a troca dos valores das posições inicial e final do vetor. 
		// O passo recursivo é garantido ao se reduzir periodicamente até o caso base os índices inicial e final do vetor. 
		} else {
			aux = vetor[posicaoInicial];
			vetor[posicaoInicial] = vetor[posicaoFinal];
			vetor[posicaoFinal] = aux;
			return inversaoDeVetor(vetor, posicaoInicial + 1, posicaoFinal - 1 );
		}
	}

}
