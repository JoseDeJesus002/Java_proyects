package jose.enriquez.dispositivos;

public abstract class Dispositivos {
	protected int marca;

	public Dispositivos(int marca) {
		this.marca = marca;
	}
	
	public abstract double calcularPrecio();
	
}
