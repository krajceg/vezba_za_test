package zadaci_za_domaci_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int n, x;
		String pozitivni = "";
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			a.add(x);
			if (x > 0) {
				pozitivni = pozitivni + x + ", ";
			}
		}
		
		System.out.println("Brojevi veci od nule u nizu su: " + pozitivni);

	}

}
