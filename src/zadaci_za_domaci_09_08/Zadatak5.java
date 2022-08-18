package zadaci_za_domaci_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();

		int n;
		String x;

		System.out.print("Unesite N: ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite string: ");
			x = s.next();
			a.add(x);
		}
		for (int i = 0; i < a.size(); i++) {
			b.add(a.get(a.size() - 1 - i));
		}

		System.out.println("Niz a: " + a);
		System.out.println("Niz b: " + b);
	}

}
