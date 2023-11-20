package jose.enriquez.dispositivos;

public class Tableta extends Dispositivos{

	public Tableta(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 1500
				:(marca == 2) ? 2000
						:(marca == 3) ? 2500
								:(marca == 4) ? 3000
										:(marca == 5)? 3500
												:(marca == 6)? 18000:0;
	}

}
