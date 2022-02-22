
public class App {

	public static void main(String[] args) {
		// Aqui iremos realizar o teste da fila
		
		// Instanciando a fila com o construtor personalizado
		Fila3 fila = new Fila3(5);
		
		System.out.println("Adicionando elementos \n");
		
		fila.enfileira(5);
		fila.enfileira(4);
		fila.enfileira(3);
		fila.enfileira(2);
		fila.enfileira(1);
		
		System.out.println(fila.toString());
		
		fila.desenfileira();
		fila.desenfileira();
		fila.desenfileira();
		
		System.out.println();
		System.out.println(fila.toString());


	}

}
