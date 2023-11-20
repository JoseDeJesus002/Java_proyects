package jose.enriquez.personajes;

public class Enemigo {

	private int vida;

	public Enemigo(int vida) {
		// TODO Auto-generated constructor stub
		this.vida=vida;
	}

	public int getVida() {
		//(vida <= 0) ? 0: vida
		return Math.max(vida, 0);
	}

	public void setVida(int vida) {
		this.vida += vida;
	}

	public void incrementarVida() {
		// TODO Auto-generated method stub
		setVida(20);
	}

}
