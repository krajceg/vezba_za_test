package zadaci_sa_predavanja_08_08;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n, k, x, x2;
		int brojac = 0;
		int brojac2 = 0;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		System.out.print("Unesite broj K: ");
		k = s.nextInt();
	
//		PREKO WHILE:
		while (n > 0) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			if (x == k) {
				brojac++;
			}
			n--;
		}
		System.out.println();
		System.out.println("Uneto je " + brojac + " koja imaju vrednost " + k);
		System.out.println();
	
//		PREKO FOR:
//		for (int i = 0; i < n; i++) {
//			System.out.print("Unesite broj: ");
//			x2 = s.nextInt();
//			if (x2 == k) {
//				brojac2++;
//			}
//		}
//		System.out.println();
//		System.out.println("Uneto je " + brojac2 + " koja imaju vrednost " + k);
//		System.out.println();
	}

}
