package enriquez.jose.vistas;

import java.util.Scanner;

public class MenuSecundario {
	private static Scanner scanner = new Scanner(System.in); 
	public static int mostrar(String texto) {
		System.out.println(texto);
		System.out.println(": ");
		return scanner.nextInt();
	}
}
