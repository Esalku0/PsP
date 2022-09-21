package estanis.aliaga;

import java.util.Iterator;
import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int aprobados = 0;
		int suspensos = 0;
		int notables = 0;
		int sobresalientes = 0;
		int matricula = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Dime la nota numero " + (i + 1) + ": ");
			int nota = sc.nextInt();

			if (nota < 5) {
				suspensos++;
			} else if (nota <= 6) {
				aprobados++;
			} else if (nota <= 8) {
				notables++;
			} else if (nota <= 9) {
				sobresalientes++;
			} else {
				matricula++;
			}

		}
		
		System.out.println("Suspendidos: " + suspensos);
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Notables: " + notables);
		System.out.println("Sobresalientes: " + sobresalientes);
		System.out.println("Matriculas: " + matricula);
	}

}
