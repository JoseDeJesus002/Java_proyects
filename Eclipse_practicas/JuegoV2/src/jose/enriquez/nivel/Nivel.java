package jose.enriquez.nivel;

public abstract class Nivel {
	protected int dificultad;
	protected String escenario;
	protected String objetivo;
	protected double progreso;

	public Nivel(int dificultad) {
		this.dificultad = dificultad;
	}
	
	public Nivel(int dificultad,String escenario, String objetivo, double progreso) {
		this.dificultad = dificultad;
		this.escenario = escenario;
		this.objetivo = objetivo;
		this.progreso = progreso;
	}

	public abstract String mostrar();
	
}
