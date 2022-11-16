package vezbaAnanas;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {

//		2.Given an int array consist of unique and duplicate values. Write a source code
//		method to make a new array which contains only unique values from the given source array.
//		(code can be written in Java, C# or any other language, also can be script, it can be also
//		written in pseudo-code)

		ArrayList<Integer> nizA = new ArrayList<Integer>();
		ArrayList<Integer> nizB = new ArrayList<Integer>();

		nizA.add(1);
		nizA.add(2);
		nizA.add(2);
		nizA.add(3);
		nizA.add(3);
		nizA.add(4);
		nizA.add(4);
		nizA.add(5);
		nizA.add(6);
		nizA.add(2);
		nizA.add(2);
		nizA.add(3);
		nizA.add(3);
		nizA.add(4);
		nizA.add(4);
		nizA.add(5);
		nizA.add(6);
		nizA.add(1);

		nizB.add(nizA.get(0));
		int i = 1;
		int n = 0;
		int brojac = 0;

		do {
			if (nizA.get(i) == nizB.get(n)) {
				brojac++;
			}
			if (n + 1 != nizB.size()) {
				n++;
			} 
			else {
				if (brojac == 0) {
					nizB.add(nizA.get(i));
				}
				i++;
				n = 0;
				brojac = 0;
			}
		} 
		while (i < nizA.size());
		
		System.out.println(nizB);

	}

}
