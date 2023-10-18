package enriquez.jose.productos;

public abstract class PapasFrancesa extends Productos{
	private int tamanio;
	public PapasFrancesa (int op) {
		// TODO Auto-generated method stub
		tamanio = op;
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio = 0.0;
		if(tamanio == 1) {
			precio = 30;
		}
		if(tamanio == 2) {
			precio = 40;
		}
		if(tamanio == 3){
			precio = 60;
		}
		
		setPrecio(precio);
		return getPrecio();
	}
	
}
