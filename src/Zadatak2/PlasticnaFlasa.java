package Zadatak2;

/* Plastična flaša je flaša gde je cena sa kaucijom jednaka ceni bez kaucije. Na glavnom
izlazu se ispisuje flaša – plastična. */

public class PlasticnaFlasa extends Flasa {
	
	private double cenaSaKaucijom;
	
	public PlasticnaFlasa(String naziv, double cenaBezKaucije, double zapremina) {
		super(naziv, cenaBezKaucije, zapremina);
	}
	
	public double getCenaSaKaucijom() {
		return cenaSaKaucijom;
	}
	
	public double setCenaSaKaucijom(double cenaBezKaucije) {
		cenaSaKaucijom = cenaBezKaucije;
		
		return cenaSaKaucijom;
	}

	@Override
	public String toString() {
		return super.toString()+"- plasticna";
	}
}
