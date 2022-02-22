
/*
 * Classe elemento utilizada na fila com lista ligada. 
 * 
 */

public class Elemento {
	// Atributos
	private int valor;
	private Elemento proximo;
	
	// Construtor padrão
	public Elemento() {
		valor = -1;
		proximo = null;
	}
	
	// Construtor personalizado
	public Elemento(int valor) {
		this.valor = valor;
		proximo = null;
	}
	
	// pegar valor do elemento
	public int getValor() {
		return valor;
	}
	
	// Seta o próximo elemento da fila
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	// Pega o próximo elemento
	public Elemento getProximo() {
		return proximo;
	}
}

