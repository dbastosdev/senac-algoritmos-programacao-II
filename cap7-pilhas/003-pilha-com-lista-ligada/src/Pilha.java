
/*
 * O desempenho desse tipo de estrutura é similar ao de uma pilha implementada com um ArrayList. Contudo, o uso de uma lista ligada apresenta a vantagem de se manter o controle
 * em todos os passos e métodos de manipulação da pilha. 
 * 
 * O incoveniente dessa estrutura é a necessidade de utilizar uma classe de apoio que represente o elemento que será armazenado pela pilha. 
 * 
 */

public class Pilha {
	// atributos
	private Elemento topo;
	private int tamanho;
	
	// método para verificar se pilha está vazia
	public boolean ehVazia() {
		return topo == null; // Se topo for igual a null a lista está vazia e retorna true
	}
	
	// Retorna o elemento do tpo da pilha
	public Elemento topo() {
		return topo;
	}
	
	// Retorna o tamanho da pilha
	public int tamanho() {
		return tamanho;
	}
	
	// método para empilhar um elemento na pilha
	public void empilha(int numero) {
		Elemento novo = new Elemento(numero, null);
		// Se a pilha estiver vazia, o topo é incrementado com o novo elemento
		if(ehVazia()) {
			topo = novo;
			// Do contrário, caso a pilha já contenha algum elemento, é setado um novo elemento no topo. 
		} else {
			novo.setProximo(topo);
			topo = new Elemento();
			topo = novo;
		}
		tamanho++;
	}
	
	// Método para desempilhar
	public Elemento desempilha() {
		if(ehVazia()) {
			// Não cabe fazer tratamento de exceção para empilhar uma vez que o tamanho dessa estrutura não é rígido como na implementação com vetor primitivo. 
			throw new RuntimeException("A pilha está vazia");
		} else {
			Elemento removido = topo;
			topo = topo.getProximo();
			tamanho--;
			return removido;
		}
	}
	
	// Sobreescrita do método toString()
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if(!ehVazia()) {
			Elemento e = topo;
			while(e != null) {
				sb.append(e.getValor());
				if(e.getProximo() != null) {
					sb.append(", ");
					e = e.getProximo();
				}
			}
			
		}
		sb.append("]");
		return sb.toString();
	}
	
}
