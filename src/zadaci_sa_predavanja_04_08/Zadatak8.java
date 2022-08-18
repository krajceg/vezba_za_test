package zadaci_sa_predavanja_04_08;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a;

		
		System.out.print("Unesite broj: ");
		a = s.nextInt();
		
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println("Broj je deljiv sa 2 i sa 3");
		}
		else {
			System.out.println("Broj nije deljiv sa 2 i sa 3");
		}
		
		
	}

}
