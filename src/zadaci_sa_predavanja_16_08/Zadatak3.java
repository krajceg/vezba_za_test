package zadaci_sa_predavanja_16_08;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		
		auto.punoIme = "Svetolik Kljajic";
		auto.marka = "BMW";
		auto.brojVrata = 5;
		auto.potrosnja = 8.5;
		auto.trenutnaBrzina = 130;
		
		auto.godProizvodnje = 1951;
		auto.mesecReg = 12;
		auto.kubikaza = 1000;
		
		auto.stampaj();
		System.out.println("Da li je auto prekoracio brzinu: " + auto.prekoracioBrzinu(120));
		System.out.println("Kazna je: " + auto.visinaKazne(120) + "din");
		System.out.println();
		System.out.println("Da li je auto oldtimer: " + auto.autoJeOldtimer());
		System.out.println("Da li je istekla reg: " + auto.regItekla(9));
		System.out.println("Cena registracije: " + auto.cenaReg());
	}

}
