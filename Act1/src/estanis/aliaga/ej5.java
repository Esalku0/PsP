package estanis.aliaga;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		do {

			System.out.println("Dime el primer numero: ");
			num1 = sc.nextInt();

			System.out.println("Dime el segundo numero: ");
			num2 = sc.nextInt();

			System.out.println("----------------------");
		} while (num1 != num2);

	}

}
