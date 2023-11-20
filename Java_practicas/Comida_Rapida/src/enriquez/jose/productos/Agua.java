	package enriquez.jose.productos;
	
	public abstract class Agua extends Productos{
		private int tamanio;
		public Agua(int op) {
			// TODO Auto-generated constructor stub
			tamanio = op;
			}
		@Override
		public double calcularPrecio() { 
			// TODO Auto-generated method stub
				double precio = 0.0;
				if(tamanio == 1) {
					precio=10;
				}
				if(tamanio == 2) {
					precio=15;
				}
				if(tamanio == 3) {
					precio=20;
				}
				setPrecio(precio);
				return getPrecio();
		}
	}