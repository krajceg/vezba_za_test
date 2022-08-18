package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {

		ArrayList<Integer> niz = new ArrayList<Integer>();

		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);

		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);

		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);

		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);

		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);

		for (int i = 1; i <= 25; i++) {
			System.out.print(niz.get(i - 1) + " ,");
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}

}
