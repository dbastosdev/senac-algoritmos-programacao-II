package app;

public class BuscaSequencial {

	public static void main(String[] args) {
		
		// Declaração do vetor:
		int vetor [] = {1, 2, 3, 4, 5};
		
		// Valor procurado:
		int valorProcurado = 3;
		
		int retorno = buscaSequencial(vetor, valorProcurado);
		
		// Impressão do vetor
		
		System.out.println("Vetor:");
		System.out.println();
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("[%d] => %d", i, vetor[i]);
			System.out.println();
		}
		
		// Quebra de linha
		System.out.println();
		System.out.println();
		
		if(retorno == -1) {
			System.out.println("O valor procurado não foi encontrado");
		} else {
			System.out.printf("O índice do valor %d é: %d", valorProcurado, retorno);
		}
		
	}
	
	// Método para busca do valor no vetor
	// O método é estático para poder ser usado sem instanciar no método main
	
	public static int buscaSequencial(int[] vetorDeEntrada, int valorBuscado) {
		for(int i = 0; i < vetorDeEntrada.length; i++) {
			if(vetorDeEntrada[i] == valorBuscado) {
				// Quando há um retorno, o bloco do método é encerrado
				return i;
			}
		}
		
		return -1;
	}
	

}
