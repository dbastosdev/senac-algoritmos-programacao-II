package solucoes;

public class BuscaBinariaRecursiva {

	public static void main(String[] args) {
		// vetor
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int resultado = buscaBinaria(vetor, 0, vetor.length - 1, 60);
		
		if(resultado == -1) {
			System.out.println("Valor buscado não foi encontrado");
		} else {
			System.out.println("Valor buscado no index: " + resultado);
		}

	}

	private static int buscaBinaria(int[] vetor, int inicio, int fim, int valorProcurado) {
		// Achando o meio do vetor
		int meio = (inicio + fim) / 2;
		
		// Saída caso não encontre o valor procuradoß
		if(inicio == meio || fim == meio) {
			return -1;
		}
		
		// Caso base
		if(valorProcurado == vetor[meio]) {
			return meio;
		// Casos recursivos
		} else if(valorProcurado > vetor[meio]){
			return buscaBinaria(vetor, meio + 1, fim, valorProcurado);
		} else {
			return buscaBinaria(vetor, inicio, meio - 1, valorProcurado);
		}
	}

}
