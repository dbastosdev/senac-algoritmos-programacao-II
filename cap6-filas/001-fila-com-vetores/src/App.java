
public class App {

	public static void main(String[] args) {
		// Aqui iremos realizar o teste da fila
		
		// Instanciando a fila com o construtor personalizado
		Fila fila = new Fila(5);
		
		System.out.println("Adicionando elementos \n");
	
		// Enfileirando:
		try {
			fila.enfileirar(29);
			fila.enfileirar(10);
			fila.enfileirar(83);
			fila.enfileirar(15);
			fila.enfileirar(35);
			fila.mostrarFila();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("\nRemovendo elementos \n");
		
		// Desenfileirando:
		try {
			fila.desenfileira();
			fila.desenfileira();
			fila.desenfileira();
			fila.desenfileira();
			fila.mostrarFila();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
