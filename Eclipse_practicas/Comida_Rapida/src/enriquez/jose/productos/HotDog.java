package enriquez.jose.productos;

public abstract class HotDog extends Productos{
	private int tamanio;
	public HotDog(int op) {
		// TODO Auto-generated constructor stub
		tamanio = op;
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		double precio = 0.0;
		
		if(tamanio == 1) {
			precio = 25;
		}
		if(tamanio == 2)
		{
			precio = 30;
		}
		if (tamanio == 3) {
			precio = 40;
		}
		setPrecio(precio);
		return getPrecio();
	}
	
}
