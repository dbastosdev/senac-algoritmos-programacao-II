/*
 * Com uma lista ligada, temos a maneira mais eficiênte de implementar uma fila. Encontra-se um custo-benefício ideal entre uso da memória e tempo de processamento. 
 * 
 * Contudo, para implementar esse tipo de fila é necessário criar uma classe adicional chamada de elemento. Essa contém dois atributos: um inteiro para o valor e 
 * um atributo do tipo elemento para armazenar o próximo elemento da lista. 
 * 
 * todos os métodos dessa lista possuem complexidade O(1). 
 * 
 * No Java existe uma implementação em collections chamada Queue que faz com que a implementação desse tipo de estrutura não tenha que ser feita do zero. 
 * 
 */


public class Fila4 {
	// Atributos
	private Elemento primeiro = null;
	private Elemento ultimo = null;
	private int tamanho = 0;
	
	// Construtor padrão
	public Elemento primeiro() {
		return primeiro;
	}
	
	// Método para avaliação se lista está vazia
	public boolean ehVazia() {
		return tamanho == 0;
	}
	
	// Retorna o tamanho da lista
	public int tamanho() {
		return tamanho;
	}
	
	// Enfileira novo elemento na lista
	public void enfileira(int numero) {
		// Se a fila está vazia, um elemento é inserido na primeira posição
		if(primeiro == null) {
			primeiro = new Elemento(numero);
			// Se existe apenas um único elemento na fila
		} else if(ultimo == null){
			ultimo = new Elemento(numero);
			primeiro.setProximo(ultimo);
			// Se existem dois ou mais elementos na fila
		} else {
			Elemento e = new Elemento(numero);
			ultimo.setProximo(e);
			ultimo = new Elemento();
			ultimo = e;
		}
		tamanho++;
	}
	
	// Desenfileira um elemento da fila
	public Elemento desenfileira() {
		if(ehVazia()) {
			throw new RuntimeException("A fila está vazia. ");
		}
		
		Elemento e = primeiro;
		primeiro = primeiro.getProximo();
		// reduz o tamanho da fila em uma unidade
		tamanho--;
		
		// Se o tamanho chega a zero, os atributos primeiro e último recebem o valor nulo. 		
		if(tamanho == 0) {
			primeiro = null;
			ultimo = null;
		}
		return e;
	}

}
