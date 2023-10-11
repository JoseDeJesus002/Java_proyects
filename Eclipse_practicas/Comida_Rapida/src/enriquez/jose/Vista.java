package enriquez.jose;
import java.util.Scanner;

public class Vista {
	int orden;
	public int ordenar() {
		System.out.println("Buenas tardes que va a pedir?");
		
		System.out.println("Bebidas");
		System.out.println("1) Agua");
		System.out.println("2) Refresco");
		
		System.out.println("Alimentos");
		System.out.println("3) Hamburguesas");
		System.out.println("4) Pizzas");
		System.out.println("5) Hot Dogs");
		System.out.println("6) Papas a la francesa");
		
		Scanner scannerOrden = new Scanner(System.in);
		orden = scannerOrden.nextInt();
		return orden;
	}
}
