package enriquez.jose.productos;

public class Pizza extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Pizza";
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		precio = 80;
	}

	public Pizza(String tipo) {
		// TODO Auto-generated method stub
		setTipo(tipo);
	}
	
		
}
