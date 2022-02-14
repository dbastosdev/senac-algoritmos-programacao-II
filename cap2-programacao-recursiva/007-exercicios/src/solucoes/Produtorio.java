package solucoes;

public class Produtorio {

	public static void main(String[] args) {
		// vetor
		int[] vetor = {1, 2, 3, 4};
		
		int resultado = produtorio(vetor, vetor.length - 1);
	
		System.out.println("O produtório é: " + resultado);

	}

	private static int produtorio(int[] vetor, int index) {
		// caso base: Quando o comprimento do index chega a zero, retorna a primeira posição do vetor
		if(index == 0) {
			return vetor[index];
			// caso recursivo: retorna o valor do index atual * anterior
		} else {
			return vetor[index] * produtorio(vetor, index - 1);
		}
	}

}
