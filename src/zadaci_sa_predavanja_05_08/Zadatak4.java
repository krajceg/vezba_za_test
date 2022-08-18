package zadaci_sa_predavanja_05_08;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.print("Unesite jacinu zvuka: ");
		n = s.nextInt();
		
		System.out.print("<");
		for (int i = 0; i < n; i++) {
			System.out.print("| ");
		}
		if (n == 0) {
			System.out.println("/");
		}

	}

}
