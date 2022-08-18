package zadaci_za_domaci_08_08;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner s = new Scanner(System.in);
		int rezultat;
		int a, b, c;
		int nivo = 1;

		do {
			a = random.nextInt(20);
			b = random.nextInt(20);
			c = a + b;

			System.out.print("Nivo " + nivo + ": Koliko je " + a + " + " + b + ": ");
			rezultat = s.nextInt();
			if (c == rezultat) {
				System.out.println("Cestitam!");
				nivo++;
			}
			
		} 
		while (c == rezultat);
		System.out.println("Game Over!");
	}

}
