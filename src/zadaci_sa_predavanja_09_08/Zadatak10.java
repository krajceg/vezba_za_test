package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		ArrayList<String> niz = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesi broj N: ");
		int n = s.nextInt();
		String c;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite karakter: ");
			c = s.next();
			niz.add(c);
		}
		for (int i = 0; i < n; i++) {
			niz.add(niz.get(n-1-i));
		}
		System.out.println(niz);

	}

}
