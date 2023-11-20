package jose.enriquez.dispositivos;


public class Memoria extends Dispositivos {

	public Memoria(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 1000
				:(marca == 2) ? 1500
						:(marca == 3) ? 1600
								:(marca == 4) ? 2000:0;
	}

}
