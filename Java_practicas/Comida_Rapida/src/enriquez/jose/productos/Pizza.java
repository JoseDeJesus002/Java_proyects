package enriquez.jose.productos;

public abstract class Pizza extends Productos{
	private int tamanio;
	public Pizza(int op) {
		// TODO Auto-generated method stub
		tamanio = op;
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio = 0.0;
		if (tamanio == 1) {
			precio = 99;
		}
		if(tamanio == 2){
			precio = 199;
		}
		if(tamanio == 3) {
			precio = 299;
		}
		if (tamanio == 4) {
			precio = 399;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
		
}
