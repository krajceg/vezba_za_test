package zadaci_za_domaci_08_08;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesi broj N: ");
		int n = s.nextInt();
		int suma = 0;
		
		while (n > 0) {
			System.out.print("Unesi broj: ");
			int m = s.nextInt();
			if (m > 99 && m < 1000) {
				suma = suma + m;
			}
			n--;
		}
		System.out.print("Suma je: " + suma);
	}

}
