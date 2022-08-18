package zadaci_sa_predavanja_08_08;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		int suma;
		suma = 0;

		for (int i = 1; suma + i < 100; i++) {
			suma = suma + i;
		}
		System.out.println("Suma preko for: " + suma);

		int suma2;
		suma2 = 0;
		int n = 1;

		while (suma2 + n < 100) {
			suma2 = suma2 + n;
			n++;
		}
		System.out.println("Suma preko while: " + suma2);
	}

}
