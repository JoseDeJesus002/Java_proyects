package enriquez.jose.vistas;

import java.util.Scanner;

public class MenuPizza {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int menuPizza() {
		System.out.println(Textos.menuPizza);
		System.out.println(":");
		return scanner.nextInt();
	}
}
