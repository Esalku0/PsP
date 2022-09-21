package EstanisPsP;

import java.util.Scanner;

public class ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String nom;
		String[] nombre = new String[5];
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.print("Dame un nombre: ");
			nom = sc.nextLine();
			nombre[i]= nom; 
		}
		
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
		
		
	}
}
