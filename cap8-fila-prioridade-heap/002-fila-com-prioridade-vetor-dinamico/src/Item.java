
/*
 * Item que será adicionado a fila em modo de prioridades. 
 * 
 */

// T é genérico e pode assumir qualquer tipo a critério do tipo da lista
public class Item<T> {
	// atributos
	private T valor;
	private int prioridade;
	
	// Construtor personalizado
	public Item(T valor, int prioridade) {
		this.valor = valor;
		this.prioridade = prioridade;
	}
	
	// Método para retornar o valor do item
	public T getValor() {
		return valor;
	}
	
	// Método para retornar a prioridade
	public int getPrioridade() {
		return prioridade;
	}
	
	// Método que sobreescreve o toString()
	@Override
	public String toString() {
		return String.format("(%d - %s)", prioridade, valor.toString());
	}
}
