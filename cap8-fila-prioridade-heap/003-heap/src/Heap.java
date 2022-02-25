import java.util.ArrayList;
import java.util.List;

/*
 * Tendo em vista que as implementações de fila com prioridades não possuem um desempenho ótimo, significa que pode ser melhorado. 
 * O principal ganho a ser buscado é na operação de inserção e retirada de itens. 
 * 
 * Isso pode ser realizado com uma estrutura do tipo heap. Dado que os tempos de inserção e deleção do heap é O(log n) contra 
 * O(n) das implementações anteriores. Gerando uma otimização do processo. 
 * 
 * Uma estrutura heap tem como premissa o abandono do uso de uma lista sequêncial. Ligado mais a uma árvore binária. 
 * a árvore binária represena as informações em termos de nós compostos por chave / valor ou apenas valor. 
 * 
 * O heap ainda deve manter propriedades: relacional e estrutural. 
 * 
 * Dois tipos de heap: 
 * 
 * max-heap -> Os elementos de nós raiz são maiores que as ramificações folhas. 
 * min-heap -> as ramificações folhas são maiores que as raízes.
 * 
 * O heap é uma estrutura de dados especializada com operaões limitadas. A inserção de um novo nó deixa-o posicionado de acordo
 * com a regra de ordenação. A remoção de itens é realizada a partir da raiz do heap. 
 * 
 * Removendo um nó: 
 * 
 * Só pode ocorrer a partir da raiz. No caso do max-heap, os elementos de valores maiores são removidos. Do contrário, no caso do min-heap
 * os valores menores são removidos. Para que a ordem seja mantida após a remoção de um nó, um nó folha deve ocupar o local de um nó raiz. 
 * 
 * 
 * Na estrutura implementada abaixo, é utilizado um ArrayList. O que altera é a forma em que se percorre essa estrutura que ocorre
 * como uma árvore binária. 
 * 
 * 
 */
public class Heap {
	// Atributos
	private List<Item<?>> itens = new ArrayList<Item<?>>();
	
	// método que retorna o tamanho
	public int tamanho() {
		return itens.size();
	}
	
	// Método que retorna se a estrutura está ou não vazia
	public boolean ehVazia() {
		return itens.isEmpty();
	}
	
	// Método para inserir item na estrutura
	public void adiciona(Item<?> i) {
		itens.add(i);
		siftUp(itens.size() - 1);
	}
	
	// 
	public Item<?> remove(){
		Item<?> removido = itens.get(0);
		itens.set(0, itens.get(itens.size() - 1));
		itens.remove(itens.size() - 1);
		this.siftDown(0);
		return removido;
	}
	
	// Recebe o último índice recebido e não se refere ao índice raiz. 
	private void siftUp(int n) {
		if(n > 0) {
			int pai = Math.floorDiv(n, 2);
			if(itens.get(n).getPrioridade() > itens.get(pai).getPrioridade()){
				swap(n, pai);
				siftUp(pai);
			}
		}
	}
	
	//
	private void siftDown(int n) {
		int esquerda = 2 * n + 1;
		int direita = 2 * n + 2;
		int maior = n;
		
		if(esquerda < itens.size() && itens.get(esquerda).getPrioridade() >= itens.get(maior).getPrioridade()) {
			maior = esquerda; 
		} else if((direita < itens.size()) && itens.get(direita).getPrioridade() >= itens.get(maior).getPrioridade()) {
			maior = direita;
		}
		
		if(maior != n) {
			swap(n, maior);
			siftDown(maior);
		}
	}
	
	//
	private void swap(int a, int b) {
		Item<?> temp = itens.get(a);
		itens.set(a, itens.get(b));
		itens.set(b, temp);
		
	}
	
	// Reescrevendo o método Override
	@Override
	public String toString() {
		return itens.toString();
	}
	
}
























