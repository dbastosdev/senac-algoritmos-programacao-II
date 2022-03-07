import java.util.Scanner;

public class TrabalhandoComVetor {

	public static void main(String[] args) {
		
		// Configurando a entrada de dados
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de números que o seu vetor deverá receber");
		int quantidade = sc.nextInt();
		// Quebra de linha
		System.out.println();
		
		// Instanciando um vetor de inteiros
		int[] vetor = new int[quantidade];
		
		// Populando o vetor
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Digite o valor da posição vetor[%d] ", i);
			int valor = sc.nextInt();
			vetor[i] = valor;
		}
		
		// Quebra de linha
		System.out.println();
		
		// Exibindo os dados preenchidos pelo usuário
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d] = %d%n", i, vetor[i]);
		}
		
		// Quebra de linha
		System.out.println();
		
		// letra a: 
		System.out.printf("Letra a) A maior diferença entre dois elementos é: %d%n",maiorDiferenca(vetor));
		// letra b: 
		System.out.printf("Letra b) Vetor está ordenado em ordem crescente? %b%n",verificaOrdenacao(vetor));
		
	}
	
	// letra a: Método para verificar a maior diferença entre dois elementos distintos do vetor.
	public static int maiorDiferenca(int[] vetor) {
		int maior = 0;
		int menor = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				maior = vetor[i];
				menor = vetor[i];
			} else {
				if(vetor[i] > maior) {
					maior = vetor[i];
				} else if(vetor[i] < menor) {
					menor = vetor[i];
				}
			}
		}
		
		return maior - menor;
		
	}
	
	// letra b: Método para verificar se o vetor está em ordem crescente => true ou não => false. 
	public static boolean verificaOrdenacao(int[] vetor) {
		int atual = 0;
		int posterior = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				atual = vetor[i];
				posterior = vetor[i];
			} else {
				posterior = vetor[i];
				if(posterior < atual) {
					return false;
				} else {
					atual = vetor[i];
				}
			}
		}
		
		return true;
	}
}
