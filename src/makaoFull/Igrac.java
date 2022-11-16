package makaoFull;

import java.util.ArrayList;

public class Igrac {
	
	private String punoIme;
	private ArrayList<Karta> karteIgrac = new ArrayList<Karta>();
	
	public Igrac(String punoIme) {
		super();
		this.punoIme = punoIme;
	}
	
	public String getPunoIme() {
		return punoIme;
	}

	public ArrayList<Karta> getKarteIgrac() {
		return karteIgrac;
	}

	public void dodajKartu (Karta k) {
		this.karteIgrac.add(k);
	}
	
	public boolean daLiPostojiKarta(int broj, String znak) {
		boolean postoji = false;
		for (int i = 0; i < karteIgrac.size(); i++) {
			if (broj == karteIgrac.get(i).getBroj() && znak.equals(karteIgrac.get(i).getZnak())) {
				postoji = true;
			}
		}
		return postoji;
	}
	
	public Karta odigrajKartu (int broj, String znak) {
		Karta odigrana = new Karta(broj, znak);
		for (int i = 0; i < karteIgrac.size(); i++) {
			if (broj == karteIgrac.get(i).getBroj() && znak.equals(karteIgrac.get(i).getZnak())) {
				karteIgrac.remove(i);
				break;
			}
		}
		return odigrana;
	}
	
	public void stampaj() {
		System.out.println("[" + this.punoIme + "]");
		for (int i = 0; i < karteIgrac.size(); i++) {
			this.karteIgrac.get(i).stampaj();
		}
	}
}
