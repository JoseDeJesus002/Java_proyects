package enriquez.jose;
import enriquez.jose.productos.Agua;
import enriquez.jose.productos.Hamburguesa;
import enriquez.jose.productos.HotDog;
import enriquez.jose.productos.PapasFrancesa;
import enriquez.jose.productos.Pizza;
import enriquez.jose.productos.Refresco;
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

	public static void opcionesSecundarias(int opc) {
		int op;
		switch(opc)
		{
		case 1:
			op = MenuSecundario.mostrar(Textos.menuBebidas);
			Agua agua = new Agua(op) {};
			System.out.println(agua.calcularPrecio());
			int opcion = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opcion);
		break;
		case 2:
			op = MenuSecundario.mostrar(Textos.menuBebidas);
			Refresco refresco = new Refresco(op) {};
			System.out.println(refresco.calcularPrecio());
			int opcionr = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opcionr);
		break;
		case 3:
			op = MenuSecundario.mostrar(Textos.menuHamburguesa);
			Hamburguesa hamburguesa = new Hamburguesa(op) {};
			System.out.println(hamburguesa.calcularPrecio());
			int opcionh = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opcionh);
			//MenuHamburguesa.menuHamburguesa();
		break;
		case 4:
			op = MenuSecundario.mostrar(Textos.menuPizza);
			Pizza pizza = new Pizza (op) {};
			System.out.println(pizza.calcularPrecio());
			int opcionp = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opcionp);
			//MenuPizza.menuPizza();
		break;
		case 5:
			op = MenuSecundario.mostrar(Textos.menuHotDogs);
			HotDog hotDog = new HotDog (op) {};
			System.out.println(hotDog.calcularPrecio());
			int opciond = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opciond);
		break;
		case 6:
			op = MenuSecundario.mostrar(Textos.menuPapas);
			PapasFrancesa papasFrancesa = new PapasFrancesa(op) {};
			System.out.println(papasFrancesa.calcularPrecio());
			int opcionf = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opcionf);
		break;
		case 7:
			System.out.println("Gracias vuelva pronto");
		break;
		default:
			System.out.println(Textos.opcionIncorrecta);
		
		int opci = 0;
		while(opci != 7) {
			int opciong = MenuSecundario.mostrar(Textos.menuPrincipal);
			opcionesSecundarias(opciong);
		}
		}
	}
}
