package zadaci_za_domaci_04_08;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a, b;
		String c = "Nije validna operacija!"; // DOSADNO MI JE
		String operator;
		
		System.out.print("Unesite a: ");
		a = s.nextInt();
		
		System.out.print("Unesti b: ");
		b = s.nextInt();
		
		System.out.print("Unesite operator: ");
		operator = s.next();
		
		if (operator.equals("+")) {
			c = "";
			c = c + (a + b);
		}
		if (operator.equals("-")) {
			c = "";
			c = c + (a - b);
		}
		if (operator.equals("*")) {
			c = "";
			c = c + (a * b);
		}
		if (operator.equals("/")) {
			c = "";
			c = c + (a / b);
		}
		System.out.println("Rezultat: " + c);

	}

}
