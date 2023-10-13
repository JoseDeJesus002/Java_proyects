package enriquez.jose.vistas;
import java.util.Scanner;

public class MenuAgua {
	private static Scanner scanner = new Scanner(System.in);
	public static int showMenuAgua() {
		System.out.println(Textos.menuBebidas);
		System.out.println(": ");
		return scanner.nextInt();
	}
}
