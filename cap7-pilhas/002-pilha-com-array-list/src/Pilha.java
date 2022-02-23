import java.util.ArrayList;
import java.util.List;

/*
 * O problema do uso de um vetor primitivo é a necessidad de ter que criar todos os métodos de manipulação da pilha e ainda contar com uma estrutura de tamanho fixo. 
 * com vetores primitivos, há a necessidade de criar uma nova pilha temporária com os dados, criar uma pilha do tamanho desejado e fazer a transferência dos dados. 
 * 
 * Uma alternativa de solução para esse problema é implementar uma pilha com capacidade dinâmica. Para isso é possível utilizar uma lista da API Java Collections. 
 * 
 * Alguns pontos importantes: 
 * 
 * Não precisamos de um construtor, pois o tamanho é alocado de forma dinâmica. 
 * Há diversos métodos já implementados que facilitam a manipulação da pilha. 
 * 
 */



public class Pilha {
	// atributos
	private List<Integer> dados = new ArrayList<>();
	
	// método para verificar se lista está vazia
	public boolean ehVazia() {
		return dados.isEmpty();
	}
	
	// método para retornar o topo da pilha
	public int topo() {
		// valor da última posição da pilha de maneira calculada
		return dados.get(dados.size() - 1);
	}
	
	// método para retornar o tamanho da pilha
	public int tamanho() {
		return dados.size();
	}
	
	// método para empilhar
	public void empilha(int numero) {
		dados.add(numero);
	}
	
	// método para desempilhar
	public int desempilha() {
		if(ehVazia()) {
			throw new RuntimeException("A pilha está vazia!");
		} else {
			return dados.remove(dados.size() - 1);
		}
	}
	
	// Sobreescrevendo o método toString() de exibição dos dados
	public String toString() {
		return dados.toString();
	}
}


