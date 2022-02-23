
/*
 * 
 * 
 * 
 */

public class Elemento {
	// Atributos
	private int valor;
	private Elemento proximo;
	
	// Construtor: Ao criar um elemento o valor fica em uma posição anterior ao início da pilha, ou seja, inicializa com zero elementos. 
	public Elemento() {
		valor = -1;
		proximo = null;
	}
	
	// Construtor personalizado que já entra com um valor
	public Elemento(int valor, Elemento proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	// método para retornar o valor do elemento
	public int getValor() {
		return valor;
	}
	
	// Método para setar o próximo elemento
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	// método para retornar o valor do próximo elemento
	public Elemento getProximo() {
		return proximo;
	}
}
