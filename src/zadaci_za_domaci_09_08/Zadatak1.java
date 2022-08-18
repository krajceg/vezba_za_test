package zadaci_za_domaci_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<Integer>();
		
		int n, x, brojac;
		brojac = 0;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			niz.add(x);
			
			if (x % 2 == 0) {
				brojac++;
			}
		}
		System.out.println("U nizu ima " + brojac + " parna broja.");

	}

}
