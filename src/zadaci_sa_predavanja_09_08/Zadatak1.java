package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> niz = new ArrayList<Integer>();
		
		niz.add(5);
		niz.add(2);
		niz.add(2);
		niz.add(2);
		niz.add(5);
		
		int suma = niz.get(0) + niz.get(niz.size()-1);
		System.out.println(suma);

	}

}
