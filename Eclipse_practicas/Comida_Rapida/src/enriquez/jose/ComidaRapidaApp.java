package enriquez.jose;

import enriquez.jose.productos.Agua;

public class ComidaRapidaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agua agua = new Agua("chicO");
		//HotDog hotDog = new HotDog("Mediano");
		System.out.println(agua.getTipo());
		System.out.println(agua.getPrecio());
		//System.out.println(hotDog.getTipo());
	}

}
