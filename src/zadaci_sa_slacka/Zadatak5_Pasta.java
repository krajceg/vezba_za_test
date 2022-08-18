package zadaci_sa_slacka;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5_Pasta {

	public static void main(String[] args) {

		ArrayList<String> paste = new ArrayList<String>();
		ArrayList<Integer> cene = new ArrayList<Integer>();
		
		paste.add("AGLIO E OLIO");
		paste.add("FUNGHI");
		paste.add("PESTO");
		paste.add("NAPOLITANA");
		paste.add("ARRABBIATA");
		
		cene.add(320);
		cene.add(320);
		cene.add(310);
		cene.add(280);
		cene.add(300);
		
		for (int i = 0; i < paste.size(); i++) {
			System.out.println(paste.get(i) + ".................................." + cene.get(i) + " rsd");
		}
		
		
		

	}

}
