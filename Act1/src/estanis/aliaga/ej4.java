package estanis.aliaga;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el primer numero: ");
		int num1 = sc.nextInt();

		System.out.print("Dime el segundo numero: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es mayor");
		} else if (num2 > num1) {
			System.out.println("El numero " + num2 + " es mayor");
		} else {
			System.out.println("Son iguales");
		}

	}

}
