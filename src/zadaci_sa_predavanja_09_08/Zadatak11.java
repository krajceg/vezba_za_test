package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

		ArrayList<Integer> niz = new ArrayList<Integer>();
		Random random = new Random();

		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);
		niz.add(6);
		niz.add(7);

		int a, b;
		int cuvaj;
		System.out.println(niz);
		for (int i = 0; i < 8; i++) {
				a = random.nextInt(niz.size() - 1);
				b = random.nextInt(niz.size() - 1);
				cuvaj = niz.get(a);
				niz.set(a, niz.get(b));
				niz.set(b, cuvaj);
		}
		System.out.println(niz);
		
	}

}
