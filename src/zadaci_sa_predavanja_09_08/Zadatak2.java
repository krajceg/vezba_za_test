package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> niz = new ArrayList<Integer>();
		
		niz.add(5);
		niz.add(5);
		niz.add(5);
		niz.add(5);
		niz.add(5);
		
		niz.set(3, niz.get(3) * 10);
		System.out.println(niz.get(3));

	}

}
