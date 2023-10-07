package enriquez.jose;

import enriquez.jose.productos.Agua;
import enriquez.jose.productos.Hamburguesa;
import enriquez.jose.productos.Refresco;

public class ComidaRapidaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agua agua = new Agua("chico");
		Refresco refresco = new Refresco("chico");
		Hamburguesa hamburguesa = new Hamburguesa("chico");
		Vista vista = new Vista();
		vista.ordenar();
		/*
		//HotDog hotDog = new HotDog("Mediano");
		System.out.println(agua.getTamanio());
		System.out.println(agua.getPrecio());
		//System.out.println(hotDog.getTipo());
		System.out.println(refresco.getTamanio());
		System.out.println(refresco.getPrecio());
		System.out.println(hamburguesa.getTamanio());
		System.out.println(hamburguesa.getPrecio());
		*/
	}

}
