package jose.enriquez.dispositivos;

public class Laptop extends Dispositivos {

	public Laptop(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 10000
				:(marca == 2) ? 12000
						:(marca == 3) ? 13500
								:(marca == 4) ? 35000:0;
	}

}
