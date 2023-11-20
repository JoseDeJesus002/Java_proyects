package enriquez.jose.vistas;

import java.util.Scanner;

import enriquez.jose.Cliente;
import enriquez.jose.productos.Agua;
import enriquez.jose.productos.Hamburguesa;
import enriquez.jose.productos.HotDog;
import enriquez.jose.productos.PapasFrancesa;
import enriquez.jose.productos.Pizza;
import enriquez.jose.productos.Refresco;

public class MenuSecundario {
	private static Scanner scanner = new Scanner(System.in); 
	public static int mostrar(String texto) {
		System.out.println(texto);
		System.out.println(": ");
		return scanner.nextInt();
	}
	//Funcion de opciones secundarias
	public static double opcionesSecundarias(int opc) {
		double precio = 0;
		switch(opc)
		{
		case 1:
			int tamanio = mostrar(Textos.menuBebidas);
			Agua agua = new Agua(tamanio) {};
			precio = agua.calcularPrecio();
			System.out.println(precio);
			mostrarPrecioConDelay(precio);
		break;
		case 2:
			tamanio = mostrar(Textos.menuBebidas);
			Refresco refresco = new Refresco(tamanio) {};
			precio = refresco.calcularPrecio();
			System.out.println(precio);
			mostrarPrecioConDelay(precio);
		break;
		case 3:
			tamanio = mostrar(Textos.menuHamburguesa);
			Hamburguesa hamburguesa = new Hamburguesa(tamanio) {};
			precio = hamburguesa.calcularPrecio();
			mostrarPrecioConDelay(precio);
		break;
		case 4:
			tamanio = mostrar(Textos.menuPizza);
			Pizza pizza = new Pizza (tamanio) {};
			precio = pizza.calcularPrecio();
			mostrarPrecioConDelay(precio);
		break;
		case 5:
			tamanio = mostrar(Textos.menuHotDogs);
			HotDog hotDog = new HotDog (tamanio) {};
			precio = hotDog.calcularPrecio();
			mostrarPrecioConDelay(precio);
		break;
		case 6:
			tamanio = mostrar(Textos.menuPapas);
			PapasFrancesa papasFrancesa = new PapasFrancesa(tamanio) {};
			precio = papasFrancesa.calcularPrecio();
			mostrarPrecioConDelay(precio);
		break;
		case 7:
			System.out.println("Gracias vuelva pronto");
		break;
		default:
			System.out.println(Textos.opcionIncorrecta);
		}
		return precio;
	}
	private static void mostrarPrecioConDelay(double precio) {
        System.out.println("Calculando precio...");
        try {
            Thread.sleep(2000); // Delay de 2 segundos (ajusta el tiempo según tus necesidades)
        } catch (InterruptedException e) {
            // Manejar la excepción si es necesario
        }
        System.out.println("Precio: " + precio);
	}
}


