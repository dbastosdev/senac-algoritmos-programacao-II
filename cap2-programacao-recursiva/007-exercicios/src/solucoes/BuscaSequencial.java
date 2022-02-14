package solucoes;

public class BuscaSequencial {

	public static void main(String[] args) {
		// vetor
		int[] vetor = {1, 2, 3, 7, 5, 6, 98, 8, 9, 10};
		
		int resultado = buscaSequencial(vetor, vetor.length - 1, 10);
		
		if(resultado == -1) {
			System.out.println("Valor buscado não foi encontrado");
		} else {
			System.out.println("Valor buscado no index: " + resultado);
		}
	}
	
	// método recursivo
	public static int buscaSequencial(int[] vetor, int index, int valorProcurado) {
		// Caso base: 
		if(valorProcurado == vetor[index]) {
			return index;
		// Caso recursivo:
		} else if(index < vetor.length - 1) {
			return buscaSequencial(vetor, index - 1, valorProcurado);
		} 
		return -1;
	}

}
