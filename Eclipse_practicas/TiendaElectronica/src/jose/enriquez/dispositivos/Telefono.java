package jose.enriquez.dispositivos;

public class Telefono extends Dispositivos {

	public Telefono(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 2000
				:(marca == 2) ? 2500
						:(marca == 3) ? 3000
								:(marca == 4) ? 3500
									:(marca == 5) ? 5000
										:(marca == 6) ? 20000:0;
	}

}
