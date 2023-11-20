package enriquez.jose.productos;

public abstract class Hamburguesa extends Productos{
	private int tamanio;
	public Hamburguesa(int op) {
		// TODO Auto-generated method stub
		tamanio=op;
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio = 0.0;
		
		if(tamanio == 1) {
			precio=45;
		}
		if(tamanio == 2) {
			precio=55;
		}
		if(tamanio == 3) {
			precio=70;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
