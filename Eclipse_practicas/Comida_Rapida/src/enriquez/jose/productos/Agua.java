package enriquez.jose.productos;

public class Agua extends Productos{

	public Agua(String tipo) {
		// TODO Auto-generated constructor stub
		setTipo(tipo);
		calcularPrecio(tipo);
		getTipo().trim().toLowerCase();
		}
	public double calcularPrecio(String tamanio) {
		double precio = 0.0;
		
		
		if(getTipo().equals("chico")) {
			precio=10;
		}
		if(getTipo() == "mediano") {
			precio=15;
		}
		if(getTipo() == "grande") {
			precio=20;
		}
		setPrecio(precio);
		return getPrecio();
	}
}
