package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		ArrayList<Integer> niz = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		niz.add(1);
		niz.add(3);
		niz.add(5);
		niz.add(7);
		niz.add(9);
		niz.add(10);
		niz.add(15);
		niz.add(50);

		System.out.println("Unesite broj K: ");
		int k = s.nextInt();

		System.out.println("Na poziciji " + k + " je vrednost " + niz.get(k));

	}

}
