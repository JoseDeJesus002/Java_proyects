package enriquez.jose.productos;

public class Refresco extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Refresco";
	}

	public Refresco(String tamanio) {
		// TODO Auto-generated method stub
		setTamanio(tamanio);
		calcularPrecio(tamanio);
		getTamanio();
	}

	@Override
	public double calcularPrecio(String size) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		if(size == ("chico")) {
			precio=14;
		}
		if(size == "mediano") {
			precio=18;
		}
		if(size == "grande") {
			precio=22;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
