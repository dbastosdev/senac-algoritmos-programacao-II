/*
 * Exemplo de recursão linear. No método existe apenas um chamada recursiva. Assim como é feito no fatorial. 
 */


public class SomatorioVetor {

	public static void main(String[] args) {
		// Declaração de vetor
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Imprimindo o vetor
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("v[%d]: %d", i, vetor[i]);
			System.out.println();
			soma += vetor[i];
		}
		
		// Conferindo a soma de forma iterativa
		System.out.println();
		System.out.println("Soma iterativa: " + soma);
		System.out.println();
		
		// Imprimindo a soma
		System.out.println("A soma dos elementos do vetor é: " + somatorioDoVetor(vetor, vetor.length));

	}

	private static Integer somatorioDoVetor(int[] vetor, int tamanhoDoVetor) {
		
		// Caso base
		// Quando o vetor possui apenas um de tamanho, a soma desse vetor é o próprio vetor. 
		if(tamanhoDoVetor == 1) {
			return vetor[0];
		// Caso recursivo
		// Enquanto o tamanho do veto não é unitário, é realizada uma chamada recursiva iniciando da última posição do vetor e 
		// indo até a primeira somando os resultados recursivamente. 
		// A soma começa do último index até o caso base do índice zero == tamanho 1.
		} else {
			return vetor[tamanhoDoVetor -1] + somatorioDoVetor(vetor, tamanhoDoVetor - 1);
		}
		
		
	}

}
