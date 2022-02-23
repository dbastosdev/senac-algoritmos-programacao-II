import java.util.Arrays;

/*
 * É considerada uma estrutura de dados do tipo LIFO. Last in First out. Ou seja, o último objeto inserido é sempre o primeiro a ser
 * removido da pilha. O que muda da estrutura anterior são as regras de inclusão e remoção de itens. 
 * 
 * Métodos utilizados em uma pilha: 
 * 
 * ehVazia(): Retorna um resultado booleano informando se a pilha está vazia ou não. 
 * 
 * tamanho(): Retorna a quantidade de elementos armazenados no momento da consulta. 
 * 
 * topo(): Retorna em modo consulta o elemento que está no topo da pilha
 * 
 * empilha(): Insere um elemento no topo da pilha
 * 
 * desempilha(): remove e retorna o elemento que está no topo da pilha. 
 * 
 * A implementação da pilha pode ser realizada de três maneiras mais conhecidas: vetor primitivo, vetor dinâmico ou uma lista ligada. 
 * 
 */

public class Pilha {
	
	// atributos
	private int[] dados;
	private int topo;
	private int capacidade;
	
	// construtor personalizado
	public Pilha(int capacidade) {
		this.capacidade = capacidade;
		dados = new int[this.capacidade];
		// Quando a pilha é inicializada, coloca-se o topo em -1 pois é um valor fora do range de índices primitvos do array.
		topo = -1;
	}
	
	// construtor padrão
	public Pilha() {
		// Esse this(10) ainda não descobri o que é... 
		this(10);
	}
	
	// método para avaliar se pilha está vazia
	public boolean ehVazia() {
		return topo == -1;
	}
	
	// método para consulta do topo
	public int topo() {
		return dados[topo];
	}
	
	// retorna o tamanho da pilha
	public int tamanho() {
		return topo + 1;
	}
	
	// método para inserir elemento na pilha
	public void empilha(int numero) {
		if(topo + 1 >= capacidade){
			throw new RuntimeException("A pilha está cheia!");
		} else {
			// primeiro realiza o incremento e em seguida coloca o dado no topo da pilha
			dados[++topo] = numero;
		}
	}
	
	// método para remover item da pilha
	public int desempilha() {
		if(ehVazia()) {
			throw new RuntimeException("A pilha está vazia!");
		} else {
			return dados[topo--];
		}
	}
	
	// Reescritura do método toString
	// Formatação que facilita a visualização dos dados
	@Override
	public String toString() {
		return Arrays.toString(dados);
	}

}























