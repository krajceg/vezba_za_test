package zadaci_sa_predavanja_04_08;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.print("Unesi broj a: ");
		a = s.nextInt();
		
		System.out.print("Unesi broj b: ");
		b = s.nextInt();
		
		System.out.print("Unesi broj c: ");
		c = s.nextInt();
		
		System.out.println();
		if (a > b && a < c) {
			System.out.println("Broj a je u ospegu b i c");
		}  else {
			System.out.println("Broj a nije u opsegu b i c");
		}

	}

}
