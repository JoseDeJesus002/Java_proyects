package enriquez.jose.productos;

public class Agua extends Productos{

	public Agua(String tamanio) {
		// TODO Auto-generated constructor stub
		setTamanio(tamanio);
		calcularPrecio(tamanio);
		getTamanio();
		}
	@Override
	public double calcularPrecio(String size) { 
		// TODO Auto-generated method stub
			double precio = 0.0;
			if(size.equals("chico")) {
				precio=10;
			}
			if(size == "mediano") {
				precio=15;
			}
			if(size == "grande") {
				precio=20;
			}
			setPrecio(precio);
			return getPrecio();
	}
}