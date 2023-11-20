package jose.enriquez.personajes;

public class Jugador {
	Enemigo enemigo;
	
	public Jugador(Enemigo enemigo) {
		// TODO Auto-generated constructor stub
		this.enemigo = enemigo;
	}

	public void atacar() {
		// TODO Auto-generated method stub
		enemigo.setVida(-20);
	}

}
