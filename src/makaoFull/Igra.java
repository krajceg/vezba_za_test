package makaoFull;

import java.util.Scanner;

public class Igra {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Spil spil1 = new Spil();
		Makao makao = new Makao(spil1);

		Igrac sveta = new Igrac("Svetolik");
		Igrac milan = new Igrac("Milan");
		Igrac pera = new Igrac("Pera");

		makao.pristupiStolu(sveta);
		makao.pristupiStolu(milan);
		makao.pristupiStolu(pera);
		makao.podeliKarte();

		do {
			int broj;
			String znak, komanda;
			makao.stampaj();

			System.out.print("Da li imate kartu za odigrati? ");
			komanda = s.next();

			if (komanda.equals("ne")) {
				makao.izvuciKartu();
				makao.stampaj();
				System.out.print("Dalje ili igrate? ");
				komanda = s.next();
			}
			if (komanda.equals("da") || komanda.equals("igram")) {
				System.out.print("Unesite broj: ");
				broj = s.nextInt();
				System.out.print("Unesite znak: ");
				znak = s.next();

				makao.odigrajKartu(broj, znak);

			}
			if (komanda.equals("dalje")) {
				makao.sledeci();
			}

		} while (makao.krajIgre() == false);
		System.out.println("Pobednik je " + makao.pobednik().getPunoIme());

	}

}
