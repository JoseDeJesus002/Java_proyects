package enriquez.jose.productos;

public class PapasFrancesa extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		 nombre = "Papas a la francesa";
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		precio = 45;
	}

	public PapasFrancesa (String tipo) {
		// TODO Auto-generated method stub
		setTipo(tipo);
	}

	@Override
	public double calcularPrecio(String tamanio) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
