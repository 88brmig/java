package projects;

import java.util.Scanner;

class calificaciones {

	public static void main(String[] args) {
		int calificacion;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce una calificacion: ");
		calificacion = scan.nextInt();
		
		if(calificacion >= 60) {
			System.out.print("Aprobado");
		} else {
			System.exit(0);
		}
	}

}
