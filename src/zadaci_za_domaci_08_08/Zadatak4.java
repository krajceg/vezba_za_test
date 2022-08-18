package zadaci_za_domaci_08_08;

import java.util.Random;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int stanje, transakcija;

		System.out.print("Unesite stanje na racunu: ");
		stanje = s.nextInt();

		do {
			System.out.print("Na racunu imate $" + stanje + ", Unesite sumu za sledecu transakciju: ");
			transakcija = s.nextInt();
			if (stanje - transakcija >= 0) {
				stanje = stanje - transakcija;
				transakcija = 0;
			}
		} 
		while (stanje - transakcija >= 0);
		System.out.println("Nemate dovoljno sredstava na racunu. Na racunu vam je ostalo $" + stanje);

	}

}
