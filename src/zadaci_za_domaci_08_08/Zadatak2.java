package zadaci_za_domaci_08_08;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n;

		do {
			System.out.print("Unesite broj: ");
			n = s.nextInt();
			n = Math.abs(n);
			if (n != 0) {
				System.out.println("Apsolutna vrednost je: " + n);
			}
			else {
				System.out.println("Kraj programa jer je uneta nula.");
			}
		} 
		while (n != 0);

	}

}
