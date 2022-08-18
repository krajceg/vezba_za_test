package zadaci_sa_predavanja_05_08;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		int ukupnoVreme, vreme;
		Scanner s = new Scanner(System.in);

		System.out.println("Unesi ukupno vreme videa: ");
		ukupnoVreme = s.nextInt();

		System.out.println("Unesi trenutno vreme videa: ");
		vreme = s.nextInt();

		int procenat = vreme * 100 / ukupnoVreme;

		for (int i = 1; i < 100; i++) {
			if (i < procenat) {
				System.out.print("*");
			} else {
				System.out.print("_");
			}
		}
		int minutUkupno = 0;
		int minut = 0;
		if (ukupnoVreme > 60) {
			minutUkupno = ukupnoVreme / 60;
			ukupnoVreme = ukupnoVreme - (minutUkupno * 60);
		}
		if (vreme > 60) {
			minut = vreme / 60;
			vreme = vreme - (minut * 60);
		}
		System.out.println();
		System.out.println(minut + ":" + vreme + " / " + minutUkupno + ":" + ukupnoVreme);

	}

}
