package enriquez.jose.productos;

public class Refresco extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Refresco";
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		precio = 15;
	}

	public Refresco(String tipo) {
		// TODO Auto-generated method stub
		setTipo(tipo);
	}
	
}
