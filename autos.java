package projects;

import java.util.Scanner;

public class autos {

	public static void main(String[] args) {
		String modelo, marca;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la modelo del automovil: ");
		modelo = scan.nextLine();
		System.out.print("Introduce la marca del automovil: ");
		marca = scan.nextLine();
		
		System.out.print(modelo+" "+marca);

	}

}
