import java.util.Scanner;

public class SolucaoProva {
	
	public static void main(String[] args) {
	
		// Entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// Determinando o tamanho do vetor
		System.out.println("Digite a quantidade de números que o seu vetor deverá receber");
		int n = sc.nextInt();
		
		// Instanciando um vetor
		int[] vetor = new int[n];
		
		// preenchendo o vetor
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d valor para o vetor: ", i);
			int valor = sc.nextInt();
			vetor[i] = valor;
		}
		
		// imprimindo o vetor (teste)
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d] = %d %n", i, vetor[i]);
		}
		
		// Resultado
		System.out.printf("A soma dos números ímpares é igual a: %d ", somaImpares(vetor));
	
	}
	
	// Função para somar os números ímpares
	public static int somaImpares(int[] vetor) {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 != 0) {
				soma += vetor[i];
			}
		}
		return soma;
	}
}
