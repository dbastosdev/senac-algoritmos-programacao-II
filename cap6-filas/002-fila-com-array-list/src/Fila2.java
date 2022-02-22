import java.util.ArrayList;
import java.util.List;

/*
 * Ao se construir uma fila com um vetor primitivo, temos uma limitação de capacidade uma vez que o tamanho de um vetor precisa ser declarado. Desse modo, caso se deseje
 * ampliar o tamanho da fila, uma nova fila precisa ser criada. 
 * 
 * Para superar esse problema é possível utilizar oa coleção ArrayList da API Java Collections. O comportamento é o de um vetor, contudo, ao invés de ocupar um espaço
 * contínuo de memória a ocupação é dinâmica e esparsa e não precisa ter sua capacidade declarada. Além disso, contém diversos métodos embutidos e é simples de excluir e incluir elementos. 
 * 
 * A implementação dessa maneira é muito mais simples e poderosa.
 * 
 * O método para desenfileirar não é otimizado. É realizado de forma linear, mas automaticamente organiza os endereços para fazer a ligação entre os elementos da lista. 
 * 
 * Esse é o único método com complexidade O(n). Todos os outros possuem complexidade O(1).
 * 
 */

public class Fila2 {
	// atributos
	private List<Integer> dados = new ArrayList<>();
	
	// Implementação dos métodos:
	
	// Retorna a primeira posição da lista:
	public int primeiro() {
		return dados.get(0);
	}
	
	// Retorna se a lista está vazia
	public boolean ehVazia() {
		return dados.isEmpty();
	}
	
	// Retorna o tamanho da fila
	public int tamanho() {
		return dados.size();
	}
	
	// Adiciona um novo dado ao final da fila
	public void enfileirar(int numero) {
		dados.add(numero);
	}
	
	// Remove um elemento da primeira posição da fila
	public int desenfileirar() {
		if(dados.isEmpty()) {
			throw new RuntimeException("A fila está vazia.");
		} else {
			return dados.remove(0);
		}
	}
	
	// Sobreescrita do toString()
	@Override
	public String toString() {
		return dados.toString();
	}
	
}
