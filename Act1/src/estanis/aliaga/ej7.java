package estanis.aliaga;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int acumulador = 0;

		do {
			System.out.print("Dime un numero: ");
			acumulador += sc.nextInt();
			contador++;
		} while (contador < 5);
		
		System.out.println("El resultado es: " + acumulador);
	}

}
