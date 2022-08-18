package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		ArrayList<Integer> niz = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesi broj N: ");
		int n = s.nextInt();
		int x;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesi broj: ");
			x = s.nextInt();
			niz.add(x);
		}
		
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + ", ");
		}
				

	}

}
