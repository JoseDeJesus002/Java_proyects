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

	public Hamburguesa(String tamanio) {
		// TODO Auto-generated method stub
		setTipo(tamanio);
		calcularPrecio(tamanio);
		getTamanio();
	}

	@Override
	public double calcularPrecio(String tamanio) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		if(tamanio == ("chico")) {
			precio=14;
		}
		if(tamanio == "mediano") {
			precio=18;
		}
		if(tamanio == "grande") {
			precio=22;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
