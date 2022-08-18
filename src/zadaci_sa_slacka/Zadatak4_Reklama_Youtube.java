package zadaci_sa_slacka;

import java.util.Scanner;

public class Zadatak4_Reklama_Youtube {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int minut1, sekunda1, minut2, sekunda2;
		
		System.out.print("Duzinu videa (minut): ");
		minut1 = s.nextInt();
		
		System.out.print("Duzinu videa (sekund): ");
		sekunda1 = s.nextInt();
		
		System.out.print("Prva reklama (minut): ");
		minut2 = s.nextInt();
		
		System.out.print("Prva reklama (sekund): ");
		sekunda2 = s.nextInt();
		
		System.out.println("Reklama: ");
		System.out.println(minut2 + ":" + sekunda2);
		
		int video = (minut1 * 60) + sekunda1;
		int reklama = (minut2 * 60) + sekunda2;
		
		int n = (video - reklama) / 30;
		
		for (int i = 0; i < n; i++) {
			sekunda2 = sekunda2 + 30;
			if (sekunda2 > 60) {
				minut2 = minut2 + 1;
				sekunda2 = sekunda2 - 60;
			}
			System.out.println(minut2 + ":" + sekunda2);
		}

	}

}
