/*
 * A fila é uma estrutura utilizada quando há a necessidade de processar informações na sequência em que chegam ao sistema. 
 * Ex.: simulações, escalanodor de tarefas, gerenciamento de impressão e etc. 
 *
 * Essa estrutura possui um número limitado de operações e só pode ter um novo elemento inserido em seu final e ao mesmo tempo somente 
 * o primeiro elemento pode ser removido. First In, First Out - FIFO.
 *
 * Métodos básicos: 
 * 
 * ehVazia: Indica se a fila está vazia;
 * tamanho: indica a quantidade de elementos;
 * primeiro: Indica o primeiro elemento a ser removido da lista;
 * enfileirar: Insere um elemento ao final da fila; 
 * desenfileirar: Remove o primeiro elemento da fila; 
 * 
 * É possível implementar uma fila com um vetor simples, vetor dinâmico, lista circular ou uma lista ligada. 
 * 
 * Nessa implementação, poucos são os métodos já implementados, uma vez que o vetor possui apenas o método de tamanho. 
 * 
 */


public class Fila {
	
	// Atributos
	private int[] dados;
	private int capacidade;
	private int fim;
	
	// Construtor personalizado
	public Fila(int capacidade) {
		this.capacidade = capacidade;
		dados = new int[this.capacidade];
		fim = 0;
	}
	
	// Construtor padrão
	public Fila() {
		dados = new int[10];
	}

	// MÉTODOS BÁSICOS DA FILA
	
	// Verifica se a lista é vazia: 
	public boolean ehVazia() {
		if(fim == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Verifica o tamanho
	public int tamanho() {
		return dados.length;
	}
	
	// Retorna o primeiro elemento
	public int primeiro() {
		return dados[0];
	}
	
	// Enfileira elemento na fila
	public void enfileirar(int numero) {
		
		// Se o final da fila é maior que a capcidade, retorna uma RunTimeException
		if(fim > capacidade) {
			throw new RuntimeException("A fila está com capacidade máxima.");
		// Caso contrário, insere um elemento ao final da fila
		} else {
			dados[fim] = numero;
		}
		// Incrementa o final da fila
		fim++;
	}
	
	// Desenfileira os elementos da fila
	public int desenfileira() {
		// decrementa o final da fila
		fim--;
		// Se a lista estiver vazia, não há como desenfileirar
		if(ehVazia()) {
			throw new RuntimeException("A fila está vazia.");
		} else {
			// Armazena o primeiro elemento da fila
			int numero = dados[0];
			
			// Organiza os demais elementos:
			for(int i = 0; i < fim; i++) {
				// Anda com todos os elementos da fila para uma casa a frente 
				dados[i] = dados[i + 1];
			}
			
			
			
			return numero;			
		}
	}
	
	// Modificando o toString
	public void mostrarFila() {
		System.out.print("Fila atual: ");
		System.out.print("[");
		for(int i = 0; i < fim; i++) {
			if(i == fim - 1) {
				System.out.print(dados[i]);
			} else {
				System.out.print(dados[i]+", ");
			}
			
		}
		System.out.print("]\n");
	}

	
}
