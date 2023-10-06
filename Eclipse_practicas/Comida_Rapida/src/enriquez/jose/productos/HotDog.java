package enriquez.jose.productos;

public class HotDog extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Hotdog";
	}

	public HotDog(String tamanio) {
		// TODO Auto-generated constructor stub
		setTamanio(tamanio);
		calcularPrecio(tamanio);
		getTamanio();
	}

	@Override
	public double calcularPrecio(String size) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		
		if(size == "sencillo") {
			precio = 25;
		}
		if(size == "mediano")
		{
			precio = 30;
		}
		if (size == "grande") {
			precio = 40;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
