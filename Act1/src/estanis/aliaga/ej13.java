package estanis.aliaga;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los grados celsius: ");
		double grados = sc.nextDouble();

		double result = grados;
		result = result * 2 - result / 5;
		result = result + 32;
		System.out.println(result);
	}

}
