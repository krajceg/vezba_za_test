package vezbaAnanas;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak3 {

	public static void main(String[] args) {

//		3.User enters an more than 2 dates consist of unique and duplicate values when
//		starts to use application. Write a source code method to make a new array which contains
//		only unique date values entered, in descending order.
//		a. (code can be written in Java, C# or any other language, also can be script, it can be
//		also written in pseudo-code)
		
		
		ArrayList<String> dLista = new ArrayList<String>();
		
		dLista.add("1995-06-25");
		dLista.add("1999-07-30");
		dLista.add("1999-07-04");
		dLista.add("25-07-2000");
		dLista.add("1980-06-25");
		dLista.add("1989-07-25");
		
		String safe;
		
		System.out.println("Datumi pre sredjivanja:");
		
		for (String datumi: dLista) {
			System.out.println(datumi);
		}
		
		Collections.sort(dLista);
		System.out.println();
		System.out.println("Datumi posle sredjivanja:");
		
//		Ako treba od najveceg broja godina samo izostaviti kod do sledeceg komentara
		safe = dLista.get(0);
		for (int i = 0; i < dLista.size(); i++) {
			dLista.set(i, dLista.get(dLista.size()-1-i));
		}
		dLista.set(dLista.size()-1, safe);
//		
		for (int i = 0; i < dLista.size(); i++) {
			System.out.println(dLista.get(i));
		}
		
	}
}
