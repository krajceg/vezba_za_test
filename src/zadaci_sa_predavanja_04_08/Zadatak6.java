package zadaci_sa_predavanja_04_08;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String znak, znakSto, broj, brojSto;
		
		System.out.print("Unesite znak karte na stolu: ");
		znakSto = s.next();
		
		System.out.print("Unesite broj karte na stolu: ");
		brojSto = s.next();
		
		System.out.print("Unesite znak karte koju zelite da odigrate: ");
		znak = s.next();
		
		System.out.print("Unesite broj karte koju zelite da odigrate: ");
		broj = s.next();
		
		if (znak.equals(znakSto) || broj.equals(brojSto)) {
			System.out.println("Potez je validan");
		}
		else {
			System.out.println("Potez nije validan");
		}
		
	}

}
