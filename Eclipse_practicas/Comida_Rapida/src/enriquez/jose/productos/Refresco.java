package enriquez.jose.productos;

public abstract class Refresco extends Productos{
	private int tamanio;
	public Refresco(int op) {
		// TODO Auto-generated method stub
		tamanio = op;
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio = 0.0;
		if(tamanio == 1) {
			precio=14;
		}
		if(tamanio == 2) {
			precio=18;
		}
		if(tamanio == 3) {
			precio=22;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
