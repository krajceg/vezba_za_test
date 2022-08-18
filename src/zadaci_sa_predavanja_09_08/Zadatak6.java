package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		ArrayList<Integer> niz = new ArrayList<Integer>();

		niz.add(1);
		niz.add(3);
		niz.add(6);
		niz.add(9);
		niz.add(11);

		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + ", ");
		}

	}

}
