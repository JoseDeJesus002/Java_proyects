package jose.enriquez.personajes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class EnemigoTest {
	Enemigo enemigo = new Enemigo(100);
	Jugador jugador = new Jugador(enemigo);
	
	@Test
	public void testvidaIncial() {
		Assertions.assertEquals(100,enemigo.getVida());
	}
	@Test
	public void testDecrementarVida() {
		jugador.atacar();
		Assertions.assertEquals(80, enemigo.getVida());
	}
	@Test
	public void testCuandoEnemigoMuere() {
		jugador.atacar();
		jugador.atacar();
		jugador.atacar();
		jugador.atacar();
		jugador.atacar();
		Assertions.assertEquals(0, enemigo.getVida());
	}
	@Test
	public void testCuandoIncrementaVida() {
		jugador.atacar();
		jugador.atacar();
		enemigo.incrementarVida();
		Assertions.assertEquals(80, enemigo.getVida());
	}
	
}
