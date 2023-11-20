package enriquez.jose.vistas;
import java.util.Scanner;

public class MenuPrincipal {
	private static Scanner scanner = new Scanner(System.in);
	public static int showMenu() {
	System.out.println(Textos.menuPrincipal);
	System.out.print(": ");
		return scanner.nextInt();
	}
}
