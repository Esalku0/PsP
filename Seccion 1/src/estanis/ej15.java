package EstanisPsP;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double volumen;

		
		System.out.println("Dime el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		
		
		volumen=(4/3)*Math.PI*(radio*radio*radio);
		
		System.out.println("El volumen de la esfera es de: " + volumen);
		
	}

}
