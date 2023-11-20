package jose.enriquez.dispositivos;

public class ComputadoraEscritorio extends Dispositivos {

	public ComputadoraEscritorio(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 8500
				:(marca == 2) ? 10300
						:(marca == 3) ? 15000
								:(marca == 4) ? 45000
										:(marca == 5) ? 54000:0;
	}

}
