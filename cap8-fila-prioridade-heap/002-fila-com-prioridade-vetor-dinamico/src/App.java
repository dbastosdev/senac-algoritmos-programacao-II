
public class App {

	public static void main(String[] args) {
		// Instancia uma fila com prioridades
		// Não há quantidade de itens declarados
		FilaPrioridade f = new FilaPrioridade();
		
		// Usando os métodos para empilhar e tratando as exceções
		try {
			f.enfileirar(new Item<String>("roxo", 5));
			f.enfileirar(new Item<String>("preto", 4));
			f.enfileirar(new Item<String>("laranja", 3));
			f.enfileirar(new Item<String>("branco", 2));
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
