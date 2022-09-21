package EstanisPsP;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double area;
		double diametro;
		
		System.out.println("Dime el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		
		area = 3.1416 * Math.pow(radio,2);
		diametro = 2 * radio;
		
		System.out.println("El area del circulo es: " + area);
		System.out.println("El diametro del circulo es: " + diametro);
		
	}

}
