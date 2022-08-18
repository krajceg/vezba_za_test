package zadaci_sa_predavanja_05_08;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int a, b;
		
		System.out.println("Unesite a: ");
		a = s.nextInt();
		
		System.out.println("Unesite b: ");
		b = s.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			if (i < a || i > b) {
				System.out.print("*");
			}
			else {
				System.out.print("_");
			}
		}

	}

}
