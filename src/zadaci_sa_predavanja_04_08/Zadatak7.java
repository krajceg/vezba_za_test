package zadaci_sa_predavanja_04_08;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int zvuk = 75;
		String kontrola;
		
		System.out.print("Unesite zeljenu radnju: ");
		kontrola = s.next();
		
		if (kontrola.equals("pojacaj")) {
			zvuk = zvuk + 10;
		}
		else if (kontrola.equals("smanji")) {
			zvuk = zvuk - 10;
		}
		else if (kontrola.equals("mute")) {
			zvuk = 0;
		}
		else {
			System.out.println("Radnja nije validna");
		}
		System.out.println("Nova jacina zvuka je: " + zvuk);
	}

}
