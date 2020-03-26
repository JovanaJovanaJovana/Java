package autobus;

/* Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu 
 * kolicinu novca koja mu se zadaje prilikom kreiranja. Odredjena svota 
 * novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti 
 * indikator uspesnosti. */

public class Putnik extends Covek {

	private double novac;

	public Putnik(String ime, String prezime, double novac) {

		super(ime, prezime);

		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public boolean dodajNovac(double iznos) {
		if (iznos > 0) {
			novac = novac + iznos;
			return true;
		} else {
			System.out.println("Molimo Vas, unesite pozitivnu vrednost zeljenog iznosa.");
			return false;
		}
	}

	public boolean oduzmiNovac(double iznos) {
		if (iznos > 0 && iznos <= novac) {
			novac = novac - iznos;
			return true;
		} else {
			System.out.println("Nemate dovoljno sredstava.");
			return false;
		}
	}

	@Override
	public String toString() {
		return this.novac + " " + super.toString();
	}

}
