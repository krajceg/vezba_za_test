package zadaci_za_domaci_05_08;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, m;
		int suma = 0;
		
		System.out.print("Unesite broj N: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj:");
			m = s.nextInt();
			if (m % 2 == 0) {
				suma = suma + m;
			}
		}
		System.out.println("Suma parnih brojeva je " + suma);
	}

}
