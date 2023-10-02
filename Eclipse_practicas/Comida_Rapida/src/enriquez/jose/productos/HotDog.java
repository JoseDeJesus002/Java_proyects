package enriquez.jose.productos;

public class HotDog extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Hotdog";
	}

	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		precio = 25;
	}

	public HotDog(String tipo) {
		// TODO Auto-generated constructor stub
		setTipo(tipo);
	}
	
}
