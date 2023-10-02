package enriquez.jose.productos;

public class Hamburguesa extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Hamburguesa";
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		precio = 50;
	}

	public Hamburguesa(String tipo) {
		// TODO Auto-generated method stub
		setTipo(tipo);
	}
	
}
