package makaoFull;

public class Karta {

	private int broj;
	private String znak;

	public Karta(int broj, String znak) {
		super();
		this.broj = broj;
		this.znak = znak;
	}

	public int getBroj() {
		return broj;
	}

	public String getZnak() {
		return znak;
	}

	public void stampaj() {

		System.out.print("[ ");
		if (this.broj == 11) {
			System.out.print("A");
		} else if (this.broj == 12) {
			System.out.print("J");
		} else if (this.broj == 13) {
			System.out.print("Q");
		} else if (this.broj == 14) {
			System.out.print("K");
		} else {
			System.out.print(this.broj);
		}
		if (this.znak.equals("srce")) {
			System.out.print(" <3 ]");
		} else if (this.znak.equals("list")) {
			System.out.print(" /\\ ]");
		} else if (this.znak.equals("kocka")) {
			System.out.print(" <> ]");
		} else if (this.znak.equals("detelina")) {
			System.out.print(" *** ]");
		}
	}

	public boolean daLiJeMogucePoklopiti(int broj, String znak) {
		if (broj == this.broj || znak.equals(this.znak)) {
			return true;
		} else {
			return false;
		}
	}

}
