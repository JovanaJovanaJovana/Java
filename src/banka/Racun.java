package banka;

public class Racun {

	private String brRacuna;
	private double stanje;

	public String dohvatiBrRacuna() {
		return brRacuna; 
	}

	public double dohvatiStanje() {
		return stanje;
	}
	
	public void uplati(double iznos) {
		if (iznos > 0) {
			stanje += iznos;
		} else {
			System.out.println("Doslo je do greske.");
		}
	}

	public double podigni(double iznos) {
		if (iznos > 0 && iznos <= stanje) {
			stanje -= iznos;
		} else {
			System.out.println("Greska");
		}
		return stanje; 
	}
}
