package enriquez.jose.productos;

public class Hamburguesa extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		nombre = "Hamburguesa";
		return;
	}

	/*
	@Override
	public void setPrecio(double precio) {
		// TODO Auto-generated method stub
		precio = 50;
	}
	 */
	public Hamburguesa(String tamanio) {
		// TODO Auto-generated method stub
		setTamanio(tamanio);
		calcularPrecio(tamanio);
		getTamanio();
	}

	@Override
	public double calcularPrecio(String size) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		
		if(size == "Sencilla") {
			precio=45;
		}
		if(size == "Doble") {
			precio=55;
		}
		if(size == "Con queso") {
			precio=70;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
