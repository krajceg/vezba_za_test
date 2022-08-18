package zadaci_za_domaci_05_08;

import java.util.Scanner;

public class Zadatak5_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, x;
		int broj = 0;

		System.out.print("Unesite broj N: ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			broj = broj * 10;
			broj = broj + x;
		}

		System.out.println(broj);
	}

}
