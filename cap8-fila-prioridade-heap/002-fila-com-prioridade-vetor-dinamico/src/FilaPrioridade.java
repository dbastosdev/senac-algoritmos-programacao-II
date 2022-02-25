import java.util.ArrayList;
import java.util.List;

/*
 * A implementação com vetores possui alguns pontos deficiências quanto a controle dos itens da lista, tamanho limitado e código mais verboso. 
 * Pode-se usar o ArrayList que é mais confiável e com métodos embutidos que pode facilitar a implementação. 
 * 
 * Essa implementação reduz muito as linhas de códigos. Com o ArrayList temos muita flexibilidade. 
 * 
 * O único ponto em que há maior trabalho é no método de desenfileirar. 
 * 
 */

public class FilaPrioridade {
	// Atributos
	private List<Item<?>> itens = new ArrayList<Item<?>>();
	
	// método para avaliação se fila está fazia
	public boolean ehVazia() {
		return itens.isEmpty();
	}
	
	// Método para checar o tamanho da fila
	public int tamanho() {
		return itens.size();
	}
	
	// Método para enfileirar um item
	public void enfileirar(Item<?> i) {
		itens.add(i);
	}
	
	// Método para desenfileirar
	public Item<?> desenfileira(){
		if(ehVazia()) {
			throw new RuntimeException("A fila está vazia");
		} else {
			Item<?> altaPrioridade = itens.get(0);
			for(Item<?> i: itens) {
				if(i.getPrioridade() < altaPrioridade.getPrioridade()) {
					altaPrioridade = i;
				}
			}
			
			itens.remove(altaPrioridade);
			return altaPrioridade;
		}
	}
	
	// Reescrevendo o método
	@Override
	public String toString() {
		return itens.toString();
	}
}
