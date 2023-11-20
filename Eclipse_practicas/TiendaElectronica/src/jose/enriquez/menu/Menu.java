package jose.enriquez.menu;

import java.util.Scanner;

import jose.enriquez.dispositivos.Audifonos;
import jose.enriquez.dispositivos.ComputadoraEscritorio;
import jose.enriquez.dispositivos.Dispositivos;
import jose.enriquez.dispositivos.Laptop;
import jose.enriquez.dispositivos.Memoria;
import jose.enriquez.dispositivos.NoteBook;
import jose.enriquez.dispositivos.Tableta;
import jose.enriquez.dispositivos.Telefono;

public class Menu {
	private static Scanner scanner = new Scanner(System.in);
	public static int getOpcion(String menu) {		
		System.out.println(menu);
		return scanner.nextInt();
	}
	public static double seleccionar(int opcion) {
		int marca = 0;
		double precio = 0;
		switch(opcion){
			case 1:
				marca = getOpcion(Textos.menuComputadora);
				Dispositivos laptop = new Laptop(marca);
				precio = laptop.calcularPrecio();
				System.out.printf("Laptop: %.2f.", precio);
				break;
			case 2:
				marca = getOpcion(Textos.menuComputadora);
				Dispositivos computadoraEscritorio = new ComputadoraEscritorio(marca);
				precio = computadoraEscritorio.calcularPrecio();
				break;
			case 3:
				marca = getOpcion(Textos.menuTableta);
				Dispositivos tableta = new Tableta(marca);
				precio = tableta.calcularPrecio();
				break;
			case 4:
				marca = getOpcion(Textos.menuTelefono);
				Dispositivos telefono = new Telefono(marca);
				precio = telefono.calcularPrecio();
				break;
			case 5:
				marca = getOpcion(Textos.menuComputadora);
				Dispositivos noteBook = new NoteBook(marca);
				precio = noteBook.calcularPrecio();
				break;
			case 6:
				marca = getOpcion(Textos.menuAudifono);
				Dispositivos audifonos = new Audifonos(marca);
				precio = audifonos.calcularPrecio();
				break;
			case 7:
				marca = getOpcion(Textos.menuMemoria);
				Dispositivos memoria = new Memoria(marca);
				precio = memoria.calcularPrecio();
				break;
			case 10:
			System.out.println(Textos.menuSalir);
			System.exit(0);
				break;
			default:
				System.out.println(Textos.menuOpcionIncorecta);
		}
		return precio;
	}
}
