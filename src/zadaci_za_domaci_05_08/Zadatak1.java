package zadaci_za_domaci_05_08;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int x = s.nextInt();
		int y;
		
		for (int i = 1; i < 10; i++) {
			y = i * x;
			System.out.println(x + " x " + i + " = " + y);
		}

	}

}
