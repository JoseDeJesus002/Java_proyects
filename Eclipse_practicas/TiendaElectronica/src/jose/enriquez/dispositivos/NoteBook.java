package jose.enriquez.dispositivos;

public class NoteBook extends Dispositivos{

	public NoteBook(int marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return (marca == 1) ? 1500
				:(marca == 2) ? 2500
						:(marca == 3) ? 2500
								:(marca == 4) ? 2500
										:(marca == 5) ? 3000:0;
	}

}
