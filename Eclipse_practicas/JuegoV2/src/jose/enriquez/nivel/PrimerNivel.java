package jose.enriquez.nivel;

import jose.enriquez.menus.Textos;

public class PrimerNivel extends Nivel{

	public PrimerNivel(int dificultad) {
		super(dificultad);
		// TODO Auto-generated constructor stub
	}
	public PrimerNivel(int dificultad, String escenario, String objetivo, double progreso) {
		super(dificultad, escenario, objetivo, progreso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return Textos.nivelUnoBienvenida;
	}

}
