package object.objeto;

public class DatosPersonales extends Thread{
	String name = "Jose De Jesus";
	int edad = 20;
	String escuela = "Universidad Politecnica De Tecamac";
	String grado = "Septimo";
	String grupo = "2723IS";
	
	public void enviarDatos() {
		System.out.println("Nombre: " + name + "\nEdad: " + edad + "\nEscuela: " + 
	escuela + "\nGrado: " + grado + "\nGrupo: " + grupo );
	}
	
	@Override
	public void run() {
		enviarDatos();
	}
	
}
