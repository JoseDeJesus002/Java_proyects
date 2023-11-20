package jose.enriquez;

import jose.enriquez.menus.Menu;
import jose.enriquez.menus.Textos;

public class JuegoApp {
	public static void main(String[] args) throws InterruptedException {
		int opcion = Menu.getOpcion(Textos.menuInicio);
		
		Menu.seleccionarNivel(opcion);
		}
}
