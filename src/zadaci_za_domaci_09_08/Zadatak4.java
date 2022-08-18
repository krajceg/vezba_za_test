package zadaci_za_domaci_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int n, x;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			a.add(x);
			if (i < 3) {
				b.add(x);
			}
			else {
				b.add(1);
			}
		}
		System.out.println("Niz a: " + a);
		System.out.println("Niz b: " + b);
		

	}

}
