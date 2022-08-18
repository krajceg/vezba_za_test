package zadaci_sa_predavanja_08_08;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int n, m;
		n = 0;
		Scanner s = new Scanner(System.in);
			
		do {
			System.out.print("Unesite m: ");
			m = s.nextInt();
			System.out.println("Uneti broj je: " + m);
			System.out.println();
			if (m == 0) {
				n++;
			}
		}
		while (n != 2);

	}

}
