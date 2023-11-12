package enriquez.jose.vistas;
import java.util.Scanner;

public class MenuRefresco {
	private static Scanner scanner = new Scanner(System.in);
	public static int menuRefresco() {
		System.out.println(Textos.menuBebidas);
		System.out.println(": ");
		return scanner.nextInt();
	}
}
