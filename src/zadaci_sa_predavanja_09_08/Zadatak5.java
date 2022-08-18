package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		ArrayList<Integer> niz = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		niz.add(1);
		niz.add(2);
		niz.add(3);
		niz.add(4);
		niz.add(5);
		niz.add(6);
		niz.add(7);
		niz.add(8);
		niz.add(9);
		niz.add(10);
		
		System.out.println("Unesite broj K: ");
		int k = s.nextInt();
		System.out.println("Unesite novu vrednost: ");
		int n = s.nextInt();
		
		niz.set(k, n);
		
		System.out.println(niz);

	}

}
