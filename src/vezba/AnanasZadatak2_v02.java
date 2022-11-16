package vezba;

import java.util.ArrayList;

public class AnanasZadatak2_v02 {

	public static void main(String[] args) {

		ArrayList<Integer> niz1 = new ArrayList<Integer>();
		ArrayList<Integer> niz2 = new ArrayList<Integer>();

		niz1.add(1);
		niz1.add(2);
		niz1.add(3);
		niz1.add(4);
		niz1.add(5);
		niz1.add(1);
		niz1.add(2);
		niz1.add(3);
		niz1.add(4);
		niz1.add(5);
		niz1.add(1);
		niz1.add(6);
		niz1.add(6);
		niz1.add(1);

		niz2.add(niz1.get(0));

		for (int i = 1; i < niz1.size(); i++) {
			boolean imaBroja = false;
			for (int j = 0; j < niz2.size(); j++) {
				if (niz1.get(i) == niz2.get(j)) {
					imaBroja = true;
				}
			}
			if (imaBroja == false) {
				niz2.add(niz1.get(i));
			}
		}
		System.out.println(niz1);
		System.out.println(niz2);

	}

}
