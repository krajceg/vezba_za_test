package zadaci_sa_predavanja_09_08;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> niz = new ArrayList<Integer>();
		
		niz.add(1);
		niz.add(1);
		niz.add(1);
		niz.add(1);
		niz.add(5);
		
		int sacuvaj = niz.get(0);
		
		niz.set(0, niz.get(niz.size()-1));
		niz.set(niz.size()-1, sacuvaj);
		
		System.out.println(niz);
		

	}

}
