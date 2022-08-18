package zadaci_sa_predavanja_04_08;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesi pozitivan broj: ");
		a = s.nextInt();
		
		if (a < 10) {
			System.out.println("Broje je jednocifren");
		}
		else if (a < 100) {
			System.out.println("Broj je dvocifren");
		}
		else if (a < 1000) {
			System.out.println("Broj je trocifren");
		}
		else {
			System.out.println("Broj je veci od 1000");
		}

	}

}
