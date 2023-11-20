package jose.enriquez.dispositivos;


public class Audifonos extends Dispositivos {

	public Audifonos(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 500
				:(marca == 2) ? 600
						:(marca == 3) ? 700
								:(marca == 4) ? 800
										:(marca == 5) ? 900
												:(marca == 6)?1000:0;
	}

}
