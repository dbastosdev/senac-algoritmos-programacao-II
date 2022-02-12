/*
 * Esse algoritmo está muito lento. A geração de um vetor aleatório ordenado é um tanto lenta pois os números 
 * devem ser crescentes e não repetidos. Contudo, esse caso reduzido do exercício funciona para o caso solicitado no exercício. 
 * É necessário fazer as devidas adaptações para operar com a quantidade de elementos que o exercício pede. 
 */

package ex02;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class BuscaIndexadarandom {

	public static void main(String[] args) {
		
		// CONFIGURAÇÕES: 
		
		// Configuração para geração de números aleatórios
		Random random = new Random(); 
		// Configurando o scanner
		Scanner sc = new Scanner(System.in);
		
		
		// ESTRUTURAS DE DADOS: 
		
		// Declaração do vetor: 
		int[] vetor = new int[10];
		
		// Criando um dicionário para otimizar a busca: 
		// Serão utilizadas duas chaves. Posições 2 e 6 do vetor
		Dictionary<Integer, Integer> dic = new Hashtable<Integer, Integer>();
		
		// Populando o vetor e dicionário com números aleatórios de forma ordenada
		for(int i = 0; i < vetor.length; i++) {
			int valorAleatorio = (Integer) 1 * random.nextInt(100);
			
			// Ordenando e adicionando valores ao vetor
			if(i == 0) {
				// valor aletório para posição zero
				vetor[0] = (Integer) 1 * random.nextInt(100);
			} else {
				// valores aleatórios ordenados para as demais posições
				valorAleatorio = (Integer) i * random.nextInt(100);
				while(valorAleatorio <= vetor[i-1]) {
					valorAleatorio = (Integer) i * random.nextInt(100);
				}
				
				// Adiciona o valor aleatório no vetor
				vetor[i] = valorAleatorio;
				
				// Adicionando valor no dicionário
				if(i == 2 || i == 6) {
					dic.put(i, valorAleatorio);
				}
			}
			
			
			
		}
		
		//Imprimindo o vetor
		System.out.println(" VETOR ORDENADO ALEATÓRIO: ");
		for(int i = 0; i < 10; i++) {
			System.out.printf(" v[%d] = %d |", i, vetor[i]);
		}
		
		//Imprimindo o dicionario
		System.out.println();
		System.out.println();
		System.out.println(" DICIONÁRIO: ");
		System.out.printf(" chave = [%d] | valor: %d |", 2, dic.get(2));
		System.out.printf(" chave = [%d] | valor: %d |", 6, dic.get(6));
		
		// Busca do valor na tabela
		System.out.println();
		System.out.println();
		int valorBuscado;
		System.out.println("Digite o valor procurado: ");
		valorBuscado = sc.nextInt();
		
		// Resultado
		int resultado = buscaIndexada(vetor, valorBuscado, dic);
		if(resultado == -1) {
			System.out.println("Valor buscado encontrado");
		} else {
			System.out.println("Valor se encontra no índice: " + resultado);
		}
		
	}
	
	public static int buscaIndexada(int[] vetor, int valorBuscado, Dictionary<Integer, Integer> dic) {
		
		int limiteInferior = 0;
		int limiteSuperior = vetor.length;
		
		if(valorBuscado > dic.get(2)) {
			limiteInferior = 2;
		} else if(valorBuscado > dic.get(6)) {
			limiteInferior = 6;
		} else if (valorBuscado < dic.get(2)) {
			limiteSuperior = 2;
		} else if (valorBuscado < dic.get(6)) {
			limiteSuperior = 6;
		}
		
		
		/* Realização da busca*/
		for(int i = limiteInferior; i < limiteSuperior; i++) {
			if(valorBuscado == vetor[i]) {
				return i;
			}
			
			System.out.printf("Indice: %d - Valor: %d do vetor ", i, vetor[i]);
			System.out.println();
		}
		return -1;
	}

}
