import java.util.Scanner;
public class DatosPersonales3 {
	public static void main (String[] args) {
		String name;
		int age;
		String school;
		String grade;
		String group;
		
		Scanner scannerName = new Scanner(System.in);
			System.out.println("Ingresa el nombre: ");
			name = scannerName.nextLine();
			
		Scanner scannerAge = new Scanner(System.in);
 			System.out.println ("Ingresa la edad: ");
 			age = scannerAge.nextInt();
		
 		Scanner scannerSchool = new Scanner(System.in);
 			System.out.println("Ingresa tu escuela: ");
 			school = scannerSchool.nextLine();
 		
 		Scanner scannerGrade = new Scanner(System.in);
 			System.out.println("Ingresa tu grado: ");
 			grade = scannerGrade.nextLine();
 		
 		Scanner scannerGroup = new Scanner(System.in);
 			System.out.println("Ingresa tu grupo: ");
 			group = scannerGroup.nextLine();
 			
 			System.out.println ("Nombre: " + name);
 			System.out.println("Edad: " + age);
 			System.out.println("Escuela: " + school);
 			System.out.println("Grado: " + grade);
 			System.out.println("Grupo: " + group);
	}
}


