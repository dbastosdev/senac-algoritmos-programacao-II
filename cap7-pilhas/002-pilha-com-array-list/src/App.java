
public class App {

	public static void main(String[] args) {
		// Instancia uma pilha com 3 elementos
		Pilha p = new Pilha();
		
		// Exibe a pilha
		System.out.printf("Pilha vazia: %s\n", p.toString());
		
		// Empilhando dados
		try {
			p.empilha(29);
			System.out.printf("Empilha: %s <= %d\n", p.toString(), 29);
			p.empilha(42);
			System.out.printf("Empilha: %s <= %d\n", p.toString(), 42);
			p.empilha(10);
			System.out.printf("Empilha: %s <= %d\n", p.toString(), 10);
			p.empilha(83);
			System.out.printf("Empilha: %s <= %d\n", p.toString(), 83);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
		// Quebra de linha
		System.out.println();
		
		// Desempilha elementos
		try {
			System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha());
			System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha());
			System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha());
			System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha());
			System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha());
		} catch (RuntimeException err) {
			System.err.println(err.getMessage());
		}

	}

}
