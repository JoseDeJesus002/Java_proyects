package personal.person;

public class DatosPersonales extends Thread {
	public void nombre() {
		System.out.println("Jose");
	}
	
	public void edad() {
		System.out.println(20);
	}
	
	public void escuela() {
		System.out.println("Universidad Politecnica de Tecamac");
	}
	
	public void grado() {
		System.out.println("Septimo cuatrimestre");
	}
	
	public void grupo() {
		System.out.println("2723IS");
	}
	
	@Override
	public void run() {
		nombre();
		edad();
		escuela();
		grado();
		grupo();
	}
}
