package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejercicio 1.a");		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		while (numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio = numeroInicio + 1;
		}
		
		System.out.println("\nEjercicio 1.b");
		int numeroInicio_b = 5;
		while (numeroInicio_b <= numeroFin) {
			if (numeroInicio_b % 2 == 0) {
				System.out.println(numeroInicio_b);
				numeroInicio_b = numeroInicio_b + 2;
			}else {
				numeroInicio_b = numeroInicio_b + 1;
			}
		}
		
		System.out.println("\nEjercicio 1.c");
		int numeroInicio_c = 5;
		int seleccion;
		Scanner leer = new Scanner(System.in);
		System.out.println("\nPresionar 1 para ver números PARES y 0 para IMPARES.");
		seleccion = leer.nextInt();
		if (seleccion == 1) {
			while (numeroInicio_c <= numeroFin) {
				if (numeroInicio_c % 2 == 0) {
					System.out.println(numeroInicio_c);
					numeroInicio_c = numeroInicio_c + 2;
				}else {
					numeroInicio_c = numeroInicio_c + 1;
				}
			}
		}else {
			while (numeroInicio_c <= numeroFin) {
				System.out.println(numeroInicio_c);
				numeroInicio_c = numeroInicio_c + 2;
			}
		}
		System.out.println("\nEjercicio 1.d");
		int numeroInicio_d = 5;
		int numeroFin_d = 14;
		for (int i=numeroFin_d; i>numeroInicio_d; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	

}
