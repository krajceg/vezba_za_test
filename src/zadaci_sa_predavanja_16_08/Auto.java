package zadaci_sa_predavanja_16_08;

public class Auto {
	
	public String punoIme;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int trenutnaBrzina;
	
	public int godProizvodnje;
	public int mesecReg;
	public int kubikaza;
	
	public void stampaj() {
		System.out.println("Ime i prezime: " + this.punoIme);
		System.out.println("Marka: " + this.marka + " - " + this.brojVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
		System.out.println("Trenutna brzina: " + this.trenutnaBrzina);
	}
	
	public boolean prekoracioBrzinu(int ogranicenje) {
		if (this.trenutnaBrzina > ogranicenje) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int visinaKazne(int ogranicenje) {
		return (this.trenutnaBrzina - ogranicenje) * 1000;
	}
	
	public boolean autoJeOldtimer() {
		if (this.godProizvodnje < 1950) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean regItekla(int trenutniMesec) {
		if (trenutniMesec > this.mesecReg) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int cenaReg() {
		if (this.kubikaza < 2000) {
			return this.kubikaza * 100;
		}
		else {
			return (this.kubikaza * 100 + (this.kubikaza * 100 * 30 / 100));
		}
	}
	
}
