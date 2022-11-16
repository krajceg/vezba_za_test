package makaoFull;

import java.util.ArrayList;

public class Makao {

	private Spil spil;
	private ArrayList<Igrac> igraci = new ArrayList<Igrac>();
	private ArrayList<Karta> odigraneKarte = new ArrayList<Karta>();
	private int indexIgraca;

	public Makao(Spil spil) {
		super();
		this.spil = spil;
		this.indexIgraca = 0;
	}

	public void pristupiStolu(Igrac igrac) {
		this.igraci.add(igrac);
	}

	public void podeliKarte() {
		for (int i = 0; i < igraci.size(); i++) {
			for (int j = 0; j < 6; j++) {
				igraci.get(i).dodajKartu(spil.izvuciRandom());
			}
		}
		odigraneKarte.add(spil.izvuciRandom());
	}

	public void sledeci() {
		indexIgraca++;
		if (indexIgraca > igraci.size() - 1) {
			indexIgraca = 0;
		}
	}

	public void stampaj() {
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).stampaj();
			System.out.println();
		}
		System.out.println();
		System.out.print("Zadnja karta na stolu je ");
		odigraneKarte.get(odigraneKarte.size() - 1).stampaj();
		System.out.println();
		System.out.println("Na potezu je " + this.igraci.get(indexIgraca).getPunoIme());
	}

	public boolean krajIgre() {
		boolean kraj = false;
		for (int i = 0; i < igraci.size(); i++) {
			if (igraci.get(i).getKarteIgrac().size() == 0) {
				return true;
			}
		}
		return kraj;
	}

	public Igrac pobednik() {
		Igrac pobednik = null;
		for (int i = 0; i < igraci.size(); i++) {
			if (igraci.get(i).getKarteIgrac().size() == 0) {
				pobednik = igraci.get(i);
			}
		}
		return pobednik;
	}

	public void izvuciKartu() {
		this.igraci.get(indexIgraca).dodajKartu(this.spil.izvuciRandom());
	}

	public void odigrajKartu(int broj, String znak) {
		if (this.igraci.get(indexIgraca).daLiPostojiKarta(broj, znak) == true) {
			if (this.odigraneKarte.get(odigraneKarte.size() - 1).daLiJeMogucePoklopiti(broj, znak) == true) {
				this.odigraneKarte.add(this.igraci.get(indexIgraca).odigrajKartu(broj, znak));
				pravilaIgre();
			} else {
				System.out.println("Nije moguce poklopiti!");
			}
		} else {
			System.out.println("Nemate tu kartu!");
		}
	}

	public void pravilaIgre() {
		if (this.odigraneKarte.get(odigraneKarte.size()-1).getBroj() == 7) {
			this.sledeci();
			this.igraci.get(indexIgraca).dodajKartu(spil.izvuciRandom());
			this.igraci.get(indexIgraca).dodajKartu(spil.izvuciRandom());
			
		}
		else if (this.odigraneKarte.get(odigraneKarte.size()-1).getBroj() == 8) {
			this.sledeci();
			this.sledeci();
		}
		else if (this.odigraneKarte.get(odigraneKarte.size()-1).getBroj() == 11) {
			System.out.println("Isti igrac nastavlja");
		}
		else if(this.odigraneKarte.get(odigraneKarte.size()-1).getBroj() == 2 
				&& this.odigraneKarte.get(odigraneKarte.size()-1).getZnak().equals("detelina")) {
			int prethodni = indexIgraca - 1;
			if (prethodni < 0 ) {
				prethodni = igraci.size() -1;
			}
			igraci.get(prethodni).dodajKartu(spil.izvuciRandom());
			igraci.get(prethodni).dodajKartu(spil.izvuciRandom());
			igraci.get(prethodni).dodajKartu(spil.izvuciRandom());
			igraci.get(prethodni).dodajKartu(spil.izvuciRandom());
			this.sledeci();
		}
		else {
			this.sledeci();
		}
	}
}
