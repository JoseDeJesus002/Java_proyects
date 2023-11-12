package enriquez.jose.vistas;
import java.util.Scanner;

public class MenuHamburguesa {
	private static Scanner scanner = new Scanner(System.in);
	public static int menuHamburguesa() {
		System.out.println(Textos.menuHamburguesa);
		System.out.println(": ");
		return scanner.nextInt();
	}
}
