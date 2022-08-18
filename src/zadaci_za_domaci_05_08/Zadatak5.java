package zadaci_za_domaci_05_08;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, m;
		String brojTekst = "";
		int broj = 0;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			m = s.nextInt();
			brojTekst = brojTekst + m;
		}
		broj = Integer.valueOf(brojTekst);
		System.out.println(broj);
	}

}
