package enriquez.jose;

import enriquez.jose.productos.Agua;
import enriquez.jose.productos.Hamburguesa;
import enriquez.jose.productos.HotDog;
import enriquez.jose.productos.PapasFrancesa;
import enriquez.jose.productos.Refresco;

public class ComidaRapidaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agua agua = new Agua("chico");
		Refresco refresco = new Refresco("chico");
<<<<<<< HEAD
		Hamburguesa hamburguesa = new Hamburguesa("chico");
		Vista vista = new Vista();
		vista.ordenar();
		/*
		//HotDog hotDog = new HotDog("Mediano");
=======
		Hamburguesa hamburguesa = new Hamburguesa("sencilla");
		HotDog hotDog = new HotDog("mediano");
		PapasFrancesa papasFrancesa = new PapasFrancesa("chico");
		//Agua
>>>>>>> ea04f7d6f7c42dafee60d06559bb6dc5cc5be1f7
		System.out.println(agua.getTamanio());
		System.out.println(agua.getPrecio());
		//Refesco
		System.out.println(refresco.getTamanio());
		System.out.println(refresco.getPrecio());
		//Hamburguesa
		System.out.println(hamburguesa.getTamanio());
		System.out.println(hamburguesa.getPrecio());
<<<<<<< HEAD
		*/
=======
		//Hotdog
		System.out.println(hotDog.getNombre());
		System.out.println(hotDog.getTamanio());
		System.out.println(hotDog.getPrecio());
		//Papas a la francesa
		System.out.println(papasFrancesa.getTamanio());
		System.out.println(papasFrancesa.getPrecio());
>>>>>>> ea04f7d6f7c42dafee60d06559bb6dc5cc5be1f7
	}

}
