package autobus;

/* Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se 
 * njime voze. Naziv i cena karte i zadaju se prilikom kreiranja. 
 * Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti 
 * kartu putnicima samo ako je vozac prisutan. Autobus ispisati u sledecem 
 * obliku: Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... ) */

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private Putnik[] putnici;
	private int brSedista;

	public Autobus(String naziv, Vozac vozac, double cenaKarte, int brSedista) {

		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		putnici = new Putnik[brSedista];

	}

	public void dodajPutnika(Putnik p, int mesto) {
		if (putnici[mesto] == null) {
			putnici[mesto] = p;
			System.out.println("Uspesno dodovanje putnika na sediste " + mesto);
		} else
			System.out.println("Neuspesno dodavanje putnika. Sva sedista su zauzeta.");
	}

	public void ukloniPutnika(Putnik p, int mesto) {
		if (putnici[mesto] == p) {
			putnici[mesto] = null;
			System.out.println("Uspesno je otkazana rezervacija putnika " + p + " sa sedista " + mesto);
		}
	}

	public void dodajVozaca(Vozac vozac) {
		if (this.vozac == null) {
			this.vozac = vozac;
			System.out.println("Uspesno dodavanje vozaca.");
		}
	}

	public void ukloniVozaca() {
		if (this.vozac != null) {
			this.vozac = null;
			System.out.println("Uspesno uklonjen vozac.");
		}
	}

	public void naplataKarte(Putnik p) {
		if (this.vozac != null) {
			p.oduzmiNovac(this.cenaKarte);
			System.out.println(p.getIme() + " ima jos " + p.getNovac() + " dinara.");
		} else
			System.out.println("Nema vozaca u autobusu, ne mogu se naplatiti karte!");
	}

	@Override
	public String toString() {
		String s = "prevoznik: " + this.naziv + ", cena karte: " + this.cenaKarte + ", slobodna mesta: "
				+ this.brSedista + "." + "\n";
		s += this.vozac + "\n";
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] != null)
				s += putnici[i] + "\n";
		}
		return s;
	}

}
