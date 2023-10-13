package enriquez.jose.vistas;

import java.util.Scanner;

public class MenuHotDog {
	private static Scanner scanner = new Scanner(System.in);
	public static int menuHotDog() {
		System.out.println();
		System.out.println(": ");
		return scanner.nextInt();
	}
}
