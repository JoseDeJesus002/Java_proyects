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
		System.out.println("\033[0;30m Ingresa el nombre: ");
		name = scannerName.nextLine();
		
	Scanner scannerAge = new Scanner(System.in);
			System.out.println ("\033[0;30m Ingresa la edad: ");
			age = scannerAge.nextInt();
	
		Scanner scannerSchool = new Scanner(System.in);
			System.out.println("\033[0;30m Ingresa tu escuela: ");
			school = scannerSchool.nextLine();
		
		Scanner scannerGrade = new Scanner(System.in);
			System.out.println("\033[0;30m Ingresa tu grado: ");
			grade = scannerGrade.nextLine();
		
		Scanner scannerGroup = new Scanner(System.in);
			System.out.println("\033[0;30m Ingresa tu grupo: ");
			group = scannerGroup.nextLine();
	}
	
	public void mostrarDatos() {
			System.out.println ("\033[0;32m Nombre: " + name);
			System.out.println("\033[0;33m Edad: " + age);
			System.out.println("\033[0;34m Escuela: " + school);
			System.out.println("\033[0;35m Grado: " + grade);
			System.out.println("\033[0;36m Grupo: " + group);
	}
	
	@Override
	public void run() {
		leerDatos();
		mostrarDatos();
	}
}
