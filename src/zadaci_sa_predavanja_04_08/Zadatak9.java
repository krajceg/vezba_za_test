package zadaci_sa_predavanja_04_08;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int zvuk = 75;
		String radnja;
		int n = 5;

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite zeljenu radnju: ");
			radnja = s.next();

			if (radnja.equals("pojacaj")) {
				zvuk = zvuk + 10;
				if (zvuk > 100) {
					zvuk = 100;
				}
			} else if (radnja.equals("smanji")) {
				zvuk = zvuk - 10;
				if (zvuk < 0) {
					zvuk = 0;
				}
			} else if (radnja.equals("mute")) {
				zvuk = 0;
			} else {
				System.out.println("Uneta radnja nije validna");
			}
			System.out.println("Zvuk: " + zvuk);
		}

	}

}
