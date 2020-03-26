package autobus;

// Vozac je covek koji poseduje i zvanje (zanimanje -> sofer). 

public class Vozac extends Covek {

	private String zanimanje;

	public Vozac(String ime, String prezime, String zanimanje) {

		super(ime, prezime);

		this.zanimanje = "sofer";
	}

	public String getZanimanje() {
		return zanimanje;
	}

	@Override
	public String toString() {
		return this.zanimanje + ": " + super.toString() + ".";
	}
}
