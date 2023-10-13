package enriquez.jose;
import enriquez.jose.vistas.MenuAgua;
import enriquez.jose.vistas.MenuHamburguesa;
import enriquez.jose.vistas.MenuHotDog;
import enriquez.jose.vistas.MenuPizza;
import enriquez.jose.vistas.MenuPrincipal;
import enriquez.jose.vistas.MenuRefresco;
import enriquez.jose.vistas.MenuSecundario;
import enriquez.jose.vistas.Textos;

public class ComidaRapidaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = MenuPrincipal.showMenu();
		opcionesSecundarias(opcion);
	}

	public static void opcionesSecundarias(int opcion) {
		switch(opcion)
		{
		case 1:
			MenuSecundario.mostrar(Textos.menuBebidas);
			//MenuAgua.showMenuAgua();
		break;
		case 2:
			MenuSecundario.mostrar(Textos.menuBebidas);
			//MenuRefresco.menuRefresco();
		break;
		case 3:
			MenuSecundario.mostrar(Textos.menuHamburguesa);
			//MenuHamburguesa.menuHamburguesa();
		break;
		case 4:
			//MenuPizza.menuPizza();
		break;
		case 5:
			MenuHotDog.menuHotDog();
		break;
		default:
			System.out.println(Textos.opcionIncorrecta);
		break;
		}
	}
}
