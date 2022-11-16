package makaoFull;

import java.util.ArrayList;
import java.util.Random;

public class Spil {

	Random random = new Random();
	private ArrayList<Karta> karte = new ArrayList<Karta>();

	public Spil() {
		karte.add(new Karta(2, "srce"));
		karte.add(new Karta(2, "list"));
		karte.add(new Karta(2, "detelina"));
		karte.add(new Karta(2, "kocka"));

		karte.add(new Karta(3, "srce"));
		karte.add(new Karta(3, "list"));
		karte.add(new Karta(3, "detelina"));
		karte.add(new Karta(3, "kocka"));

		karte.add(new Karta(4, "srce"));
		karte.add(new Karta(4, "list"));
		karte.add(new Karta(4, "detelina"));
		karte.add(new Karta(4, "kocka"));

		karte.add(new Karta(5, "srce"));
		karte.add(new Karta(5, "list"));
		karte.add(new Karta(5, "detelina"));
		karte.add(new Karta(5, "kocka"));

		karte.add(new Karta(6, "srce"));
		karte.add(new Karta(6, "list"));
		karte.add(new Karta(6, "detelina"));
		karte.add(new Karta(6, "kocka"));

		karte.add(new Karta(7, "srce"));
		karte.add(new Karta(7, "list"));
		karte.add(new Karta(7, "detelina"));
		karte.add(new Karta(7, "kocka"));

		karte.add(new Karta(8, "srce"));
		karte.add(new Karta(8, "list"));
		karte.add(new Karta(8, "detelina"));
		karte.add(new Karta(8, "kocka"));

		karte.add(new Karta(9, "srce"));
		karte.add(new Karta(9, "list"));
		karte.add(new Karta(9, "detelina"));
		karte.add(new Karta(9, "kocka"));

		karte.add(new Karta(10, "srce"));
		karte.add(new Karta(10, "list"));
		karte.add(new Karta(10, "detelina"));
		karte.add(new Karta(10, "kocka"));

		karte.add(new Karta(11, "srce"));
		karte.add(new Karta(11, "list"));
		karte.add(new Karta(11, "detelina"));
		karte.add(new Karta(11, "kocka"));

		karte.add(new Karta(12, "srce"));
		karte.add(new Karta(12, "list"));
		karte.add(new Karta(12, "detelina"));
		karte.add(new Karta(12, "kocka"));

		karte.add(new Karta(13, "srce"));
		karte.add(new Karta(13, "list"));
		karte.add(new Karta(13, "detelina"));
		karte.add(new Karta(13, "kocka"));

		karte.add(new Karta(14, "srce"));
		karte.add(new Karta(14, "list"));
		karte.add(new Karta(14, "detelina"));
		karte.add(new Karta(14, "kocka"));
	}

	public Karta izvuciRandom() {
		int rng = random.nextInt(karte.size());
		Karta rngK = karte.get(rng);
		karte.remove(rng);
		return rngK;
	}
}
