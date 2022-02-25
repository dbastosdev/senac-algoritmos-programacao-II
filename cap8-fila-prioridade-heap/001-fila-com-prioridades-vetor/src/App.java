
public class App {

	public static void main(String[] args) {
		
		// Instancia uma fila com prioridades
		FilaComPrioridadeVetor f = new FilaComPrioridadeVetor(6);
		
		// Usando os métodos para empilhar e tratando as exceções
		try {
			f.enfileirar(new Item<String>("roxo", 5));
			f.enfileirar(new Item<String>("preto", 1));
			f.enfileirar(new Item<String>("laranja", 0));
			f.enfileirar(new Item<String>("branco", 4));
			f.enfileirar(new Item<String>("verde", 1));
		} catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
		// Lista de valores adicionados ao vetor de forma desordenada
		System.out.printf("%s\n\n", f);
		
		// Usando método para desenfileirar
		try {
			while(!f.ehVazia()) {
				// Desempilhando os itens de forma ordenada
				System.out.println(f.desenfileira());
			}
		} catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}

}
