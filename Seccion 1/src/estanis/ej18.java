package EstanisPsP;


import java.util.Iterator;
import java.util.Scanner;

public class ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String contrasenya;
		String contrasenya2;
		boolean hayMayus = false;
		boolean hayNumero = false;
		boolean longitud = false;

		do {
			System.out.println("Escribe tu contraseña: ");
			contrasenya = sc.next();
			char[] caracteres = contrasenya.toCharArray();

			if (contrasenya.length() > 5) {

				longitud = true;

				for (int i = 0; i < caracteres.length; i++) {
					if (Character.isUpperCase(contrasenya.charAt(i))) {
						hayMayus = true;
					}

					if (Character.isDigit(caracteres[i])) {
						hayNumero = true;
					}
				}

			}

		} while (longitud != true && hayMayus != true && hayNumero != true);

		System.out.println("Repite tu contraseña: ");
		contrasenya2 = sc.next();
		
		if(contrasenya!=contrasenya2) {
			System.out.println("Contraseña aceptada");
			System.out.println(contrasenya);
		} else {
			System.out.println("Error en la contraseña");
		}
		
	

	}

}
