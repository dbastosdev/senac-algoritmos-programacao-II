import java.util.Arrays;

/*
 * Uma fila com prioridade tem o comportamento parecido com uma fila comum. Exceto pelo fato de que
 * cada elemento conta com uma ordem de prioridade. Nesse caso o primeiro elemento a sair da fila
 * é o elemento de maior prioridade. Para cada elemento atribuido a fila, uma prioridade é definida. 
 * 
 * Logo, um elemento ou classe deve ser criado para possa guardar a prioridade e ser armazenado na fila. 
 * 
 * A prioridade mais alta é dada pelo valor de menor inteiro. 0 possui maior prioridade que o 5. 
 * 
 * ex.: para enfileirar cores - roxo/5 , preto/1, laranja/0, branco/4, verde/1, amarelo/3
 * 
 * saida: lranja/0, preto/1, verde/1, amarelo/3, branco/4, roxo/5. 
 * 
 * Indiferente da posição em que é enfileirado, a pilha se organiza de acorodo com a prioridade. Quando há dois itens com mesma
 * ordem de prioridade, respeita-se a ordem de inserção. 
 * 
 * Podem existir dois tipos: 1- restritas 2- sem restrições 
 * 
 * No caso das restritas, são determinados os intervalos que representam os valores de prioridades. Não há prioridade fora do intervalo
 * dado. 
 * 
 * No caso das sem restrições: Não há intervalo de inteiros de prioridade pré-determinado. 
 * 
 * Métodos aplicáveis a fila com prioridades: 
 * 
 * FilaPrioridade(): Cria um fila de prioridade sem restrições
 * 
 * FilaPrioridade(limite): cria uma fila de prioridade restrita indo de zero até o limite definido. 
 * 
 * ehVazia(): Retorna um valor booleano informando se a fila está vazia ou não
 * 
 * tamanho(): retorna a quantidade de elements armazenados na fila
 * 
 * enfileira(item, prioridade): Insere um elemento na fila de acordo com a ordem de prioridade informada
 * 
 * desenfileira(): remove e retorna o elemento da fila que está no início da ordem prioritária. 
 * 
 */

public class FilaComPrioridadeVetor {
	// atributos
	// ? é genérico e pode assumir qualquer tipo a critério do tipo da lista
	private Item<?>[] itens; // vetor de itens do tipo item 
	private int tamanho;
	private int capacidade; 
	
	// Construtor 
	public FilaComPrioridadeVetor(int capacidade) {
		tamanho = 0;
		this.capacidade = capacidade;
		this.itens = new Item[this.capacidade]; // Instancia o vetor com sua capacidade
	}
	
	// Construtor padrão
	public FilaComPrioridadeVetor() {
		this(10);
	}
	
	// método para avaliar se a fila está vazia
	public boolean ehVazia() {
		return tamanho == 0; // Se tamanho igual a 0, retorna true.  
	}
	
	// Retorna o tamanho 
	public int tamanho() {
		return tamanho;
	}
	
	// Método para adicionar lista a itens
	public void enfileirar(Item<?> i) {
		// Se afila está cheia, retorna erro
		if(capacidade == tamanho) {
			throw new RuntimeException("A fila está cheia! ");
		}
		// do contrário, incrementa um item na lista
		this.itens[this.tamanho++] = i;
	}
	
	// Método para desenfileirar
	public Item<?> desenfileira(){
		if(ehVazia()) {
			throw new RuntimeException("A fila está vazia");
		}
		
		int indice = buscaMaiorPrioridade();
		Item<?> altaPrioridade = itens[indice];
		
		for(int i = indice; i < tamanho() - 1; i++) {
			itens[i] = itens[i + 1];
		}
		
		tamanho--;
		return altaPrioridade;
	}
	
	// Método para realizar busca de maior prioridade
	private int buscaMaiorPrioridade() {
		int p = 0;
		for(int i = 0; i < tamanho(); i++) {
			if(itens[p].getPrioridade() > itens[i].getPrioridade()){
				p = i;
			}
		}
		
		return p;
	}
	
	// Reescrecendo o método toString()
	@Override
	public String toString() {
		return Arrays.toString(itens);
	}
	
}



























