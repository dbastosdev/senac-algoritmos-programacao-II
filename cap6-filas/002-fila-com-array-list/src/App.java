
public class App {
	public static void main() {
		// Aqui iremos realizar o teste da fila
		
		// Instanciando a fila com o construtor personalizado
		Fila2 fila = new Fila2();
		
		System.out.println("Adicionando elementos \n");
	
		// Enfileirando:
		try {
			fila.enfileirar(29);
			fila.enfileirar(10);
			fila.enfileirar(83);
			fila.enfileirar(15);
			fila.enfileirar(35);
			fila.toString();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("\nRemovendo elementos \n");
		
		// Desenfileirando:
		try {
			fila.desenfileirar();
			fila.desenfileirar();
			fila.desenfileirar();
			fila.desenfileirar();
			fila.toString();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
