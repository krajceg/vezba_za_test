package zadaci_za_domaci_04_08;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String p = "#";

		int a, b, c, d;

		System.out.print("Uneti broj a: ");
		a = s.nextInt();
		
		if (a < 0) {
			p = a + " " + p;
		} else {
			p = p + " " + a;
		}

		System.out.print("Uneti broj b: ");
		b = s.nextInt();
		if (b < 0) {
			p = b + " " + p;
		} else {
			p = p + " " + b;
		}

		System.out.print("Uneti broj c: ");
		c = s.nextInt();
		if (c < 0) {
			p = c + " " + p;
		} else {
			p = p + " " + c;
		}

		System.out.print("Uneti broj d: ");
		d = s.nextInt();
		if (d < 0) {
			p = d + " " + p;
		} else {
			p = p + " " + d;
		}

		System.out.println("String p ima vrednost = " + p);

	}

}
