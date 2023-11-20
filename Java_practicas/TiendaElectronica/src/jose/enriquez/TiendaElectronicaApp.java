package jose.enriquez;

import jose.enriquez.menu.Menu;
import jose.enriquez.menu.Textos;
public class TiendaElectronicaApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		double total = 0;
		int opcion;
		do {
			opcion = Menu.getOpcion(Textos.menuPrincipal);
			total += Menu.seleccionar(opcion);
			System.out.printf("Total: %.2f.%n",total);
			Thread.sleep(3000);
		}while(opcion!=10);
	}

}
