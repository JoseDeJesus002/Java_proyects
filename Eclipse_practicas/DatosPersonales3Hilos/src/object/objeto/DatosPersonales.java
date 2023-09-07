package object.objeto;
import java.util.Scanner;

public class DatosPersonales extends Thread{
	String name;
	int age;
	String school;
	String grade;
	String group;
	
	public void leerDatos() {
		Scanner scannerName = new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		name = scannerName.nextLine();
		
		Scanner scannerAge = new Scanner(System.in);
		System.out.println("Ingresa tu edad:");
		age = scannerAge.nextInt();
		
		Scanner scannerSchool = new Scanner(System.in);
		System.out.println("Ingresa tu escuela:");
		school = scannerSchool.nextLine();
		
		Scanner scannerGrade = new Scanner(System.in);
		System.out.println("Ingresa tu grado:");
		grade = scannerGrade.nextLine();
		
		Scanner scannerGroup = new Scanner(System.in);
		System.out.println("Ingresa tu grupo:");
		group = scannerGroup.nextLine();
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + age);
		System.out.println("Escuela: " + school);
		System.out.println("Grado: " + grade);
		System.out.println("Grupo: " + group);
	}
	
	@Override
	public void run() {
		leerDatos();
		mostrarDatos();
	}
}
