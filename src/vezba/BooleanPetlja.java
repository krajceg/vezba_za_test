package vezba;

import java.util.ArrayList;

public class BooleanPetlja {

	public static ArrayList<Integer> niz1 = new ArrayList<Integer>();
	public static ArrayList<Integer> niz2 = new ArrayList<Integer>();

	public static void main(String[] args) {

		niz1.add(1);
		niz1.add(2);
		niz1.add(3);

		niz2.add(1);
		niz2.add(2);
		niz2.add(3);

		System.out.println(daLiSuNizoviIsti());

	}

	public static boolean daLiSuNizoviIsti() {
		for (int i = 0; i < niz1.size(); i++) {
			if (niz1.get(i) != niz2.get(i)) {
				return false;
			}
		}
		return true;
	}

}
