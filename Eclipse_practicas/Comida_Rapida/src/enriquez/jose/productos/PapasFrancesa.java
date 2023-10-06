package enriquez.jose.productos;

public class PapasFrancesa extends Productos{

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		 nombre = "Papas a la francesa";
	}

	public PapasFrancesa (String tamanio) {
		// TODO Auto-generated method stub
		setTamanio(tamanio);
		calcularPrecio(tamanio);
		getTamanio();
	}

	@Override
	public double calcularPrecio(String size) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		if(size == "chico") {
			precio = 30;
		}
		if(size == "mediano") {
			precio = 40;
		}
		if(size == "grande"){
			precio = 60;
		}
		
		setPrecio(precio);
		return getPrecio();
	}
	
}
