package zadaci_sa_predavanja_08_08;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int m;
		Scanner s = new Scanner(System.in);
			
		do {
			System.out.print("Unesite m: ");
			m = s.nextInt();
			System.out.println("Uneti broj je: " + m);
			System.out.println();
		}
		while (m != 0);

	}

}
