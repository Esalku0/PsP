package EstanisPsP;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total;
		
		System.out.print("Dame el dia de nacimiento: ");
		int dia = sc.nextInt();
		System.out.print("Dame el mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.print("Dame el anio de nacimiento: ");
		int anio = sc.nextInt();
		
		total = dia + mes + anio;
		
       int  digito1 = total / 1000;

       int digito2 = total / 100 % 10;

       int digito3 = total / 10 % 10;
   
       int digito4 = total % 10;

       int sumafinal = digito1 + digito2 + digito3 + digito4;
		
       System.out.println(sumafinal);
	}

}
