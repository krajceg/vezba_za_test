package zadaci_za_domaci_05_08;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj N: ");
		int n = s.nextInt();
		int y = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite broj: ");
			int m = s.nextInt();
			y = y + m;

		}
		System.out.println("Suma je: " + y);
		
	}

}
