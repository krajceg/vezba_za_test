package zadaci_sa_predavanja_05_08;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite a: ");
		a = s.nextInt();
		
		System.out.print("Unesite b: ");
		b = s.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			if (i != a && i != b) {
				System.out.print(i + ", ");
			}
		}

	}

}
