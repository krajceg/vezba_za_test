package zadaci_sa_slacka;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6_Brojac {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(0);
		b.add(0);
		b.add(0);
		b.add(0);
		b.add(0);
		b.add(0);
		
		int n, x;
		
		System.out.print("Unesite N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			x = s.nextInt();
			
			if (x >= 0 && x <=5) {
				b.set(x, b.get(x)+1);
			}
		}
		for (int i = 0; i < b.size(); i++) {
			System.out.println(i + " se javila " + b.get(i) + " puta");
		}
		
		

	}

}
