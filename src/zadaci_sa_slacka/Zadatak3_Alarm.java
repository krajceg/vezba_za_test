package zadaci_sa_slacka;

import java.util.Scanner;

public class Zadatak3_Alarm {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int sat, minut;

		System.out.print("Unesite sat: ");
		sat = s.nextInt();
		System.out.print("Unesite minut: ");
		minut = s.nextInt();

		System.out.println("Alarm: ");
		System.out.println(sat + ":" + minut);

		for (int i = 0; i < 30; i = i + 5) {
			minut = minut + 5;
			if (minut > 60) {
				sat = sat + 1;
				minut = minut - 60;
			}
			System.out.println(sat + ":" + minut);
		}

	}

}
