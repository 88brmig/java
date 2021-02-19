package projects;

import java.util.Scanner;

public class identidad {

	public static void main(String[] args) {
		String nombre, edad, estadoC;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		nombre = scan.nextLine();
		System.out.print("Introduce tu edad: ");
		edad = scan.nextLine();
		System.out.print("Introduce tu estado civil: ");
		estadoC = scan.nextLine();
		
		System.out.print("Hola "+nombre+" tienes " +edad+" años y eres "+estadoC);
	}

}
