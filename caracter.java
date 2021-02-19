package projects;

import java.util.Scanner;

public class caracter {

	public static void main(String[] args) {
		char caracter;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un caracter: ");
		caracter = scan.next().toCharArray()[0];
		
		
		if(caracter == 'F') {
			System.out.print("Femenino");
		} else if (caracter == 'M'){
			System.out.print("Masculino");
		} else {
			System.out.print("Introduce un caracter valido");
		}
	}
}
