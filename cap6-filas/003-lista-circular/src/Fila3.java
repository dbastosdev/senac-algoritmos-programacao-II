import java.util.Arrays;

/*
 * É uma maneira de otimizar o método de desenfileirar. 
 * 
 * Uma limitação desse tipo de lista é a necessidade de implementar uma capacidade máxima. 
 * É necessário ainda inserir variáveis de início e fim para suporte de elaboração da fila. 
 * 
 * É importante entender que há uma perda de espaço em memória devido a quantidade de dados que ficam armazenados apenas para estruturar esse tipo de estrutura de dados. 
 * 
 * A implementação é realizada com um vetor primitivo. 
 * 
 */

public class Fila3 {
	// Atributos
	private int[] dados;
	private int capacidade;
	private int primeiro;
	private int ultimo;
	private int tamanho;
	
	// Construtor
	public Fila3(int capacidade) {
		this.capacidade = capacidade;		// atualiza controle de capacidade
		dados = new int[this.capacidade];	// instancia tamanho da fila
		this.primeiro = 0; 					// seta o primeiro elemento
		this.ultimo = 0;					// seta o último elemento
		this.tamanho = 0;					// seta o tamanho
	}
	
	// Construtor padrão
	public Fila3() {
		this(10);
	}
	
	// MÉTODOS DE CONTROLE
	
	// retorna o primeiro elemento
	public int primeiro() {
		return dados[primeiro];
	}
	
	// Retorna se a lista está vazia com base nas variáveis de controle
	public boolean ehVazia() {
		return primeiro == ultimo && tamanho == 0;
	}
	
	// Retorna o tamanho da fila
	public int tamanho() {
		return tamanho;
	}
	
	// Enfileira elemento
	public void enfileira(int numero) {
		if(tamanho == capacidade) {
			throw new RuntimeException("A fila está vazia.");
		} else {
			dados[ultimo] = numero;
			ultimo = (ultimo + 1) % capacidade;
			tamanho++;
		}	
	}
	
	// Desenfileira elementos
	public int desenfileira() {
		if(ehVazia()) {
			throw new RuntimeException("A fila está vazia.");
		} else {
			int numero = dados[primeiro];
			dados[primeiro] = -1;
			primeiro = (primeiro + 1) % capacidade;
			tamanho--;
			return numero;
		}
	}
	
	// Sobreescrevendo o método toString
	@Override
	public String toString() {
		return Arrays.toString(dados);
	}
	
	
}




























