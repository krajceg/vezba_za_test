package zadaci_sa_slacka;

import java.util.Scanner;

public class Zadatak2_Broj_Pregleda {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n;

		System.out.print("Uneti broj pregleda: ");
		n = s.nextInt();

		if (n < 999) {
			System.out.println(n + " views");
		} else if (n < 999999) {
			n = n / 1000;
			System.out.println(n + "K views");
		} else {
			n = n / 1000000;
			System.out.println(n + "M views");
		}

	}

}
