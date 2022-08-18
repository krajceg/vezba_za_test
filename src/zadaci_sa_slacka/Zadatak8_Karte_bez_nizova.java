package zadaci_sa_slacka;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8_Karte_bez_nizova {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String stoZnak, stoBroj, znak, broj;

		System.out.print("Unesite znak karte na stolu: ");
		stoZnak = s.next();

		System.out.print("Unesite broj karte na stolu: ");
		stoBroj = s.next();

		do {
			System.out.println("Poslednja karta na stolu je sada: " + stoBroj + " " + stoZnak);
			System.out.println("Sledeci potez");
			System.out.print("Unesite znak: ");
			znak = s.next();

			System.out.print("Unesite broj: ");
			broj = s.next();

			if (znak.equals(stoZnak) || broj.equals(stoBroj)) {
				System.out.println("Potez je validan");
				stoBroj = broj;
				stoZnak = znak;
			} else {
				break;
			}
		} while (znak.equals(stoZnak) || broj.equals(stoBroj));
		System.out.println("Nevalidan potez. Kraj igre.");

	}

}
