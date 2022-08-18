package zadaci_sa_predavanja_08_08;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int n, m;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite n: ");
		n = s.nextInt();
		
		while (n > 0) {
			System.out.println();
			System.out.print("Unesite m: ");
			m = s.nextInt();
			System.out.print("Uneti broj je: " + m);
			System.out.println();
			n--;
		}

	}

}
