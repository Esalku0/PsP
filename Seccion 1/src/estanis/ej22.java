package EstanisPsP;

import java.util.ArrayList;
import java.util.Scanner;

public class ej22 {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		// String[]nombreStrings = new String[3];
		String nom = null;

		do {
			System.out.print("Dame un nombre: ");
			nom = sc.next();

				nombres.add(nom);
			

		} while (!nom.equals("0"));

		System.out.println("Todo listo");

		for (String n : nombres) {
			System.out.println(n);
		}

	}

}
