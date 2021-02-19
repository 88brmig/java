package projects;

import java.util.Scanner;

public class promedio {
	
	public static void main(String[] args) {
		int primera, segunda, tercera, cuarta, quinta;
		Float promedio;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu primer calificacion: ");
		primera =  scan.nextInt();
		System.out.print("Introduce tu segunda calificacion: ");
		segunda =  scan.nextInt();
		System.out.print("Introduce tu tercera calificacion: ");
		tercera =  scan.nextInt();
		System.out.print("Introduce tu cuarta calificacion: ");
		cuarta =  scan.nextInt();
		System.out.print("Introduce tu quinta calificacion: ");
		quinta =  scan.nextInt();
		
		promedio = (float) ((primera + segunda + tercera + cuarta + quinta)/5);
		
		System.out.print("Tu promedio es de: " +promedio);
	}

}
