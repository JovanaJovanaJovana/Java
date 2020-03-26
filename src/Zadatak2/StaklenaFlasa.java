package Zadatak2;

/* Staklena flaša pića je flaša pića kod koje se cena sa kaucijom računa tako što se 
 * na cenu bez kaucije doda 5% od cene ukoliko je zapremina manja od 0,5l, ili se 
 * doda 10% od cene ukoliko je zapremina vaća ili jednaka od 0,5l. Na glavnom ekranu
 *  se ispisuje flaša – staklena. */

public class StaklenaFlasa extends Flasa {

	private double cenaSaKaucijom;

	public StaklenaFlasa(String naziv, double cenaBezKaucije, double zapremina) {
		super(naziv, cenaBezKaucije, zapremina);
		
		if (zapremina < 0.5)
			cenaSaKaucijom = cenaBezKaucije + (cenaBezKaucije * 0.05);
		else
			cenaSaKaucijom = cenaBezKaucije + (cenaBezKaucije * 0.10);
	}
	
	public double getCenaSaKaucijom() {
		return cenaSaKaucijom;
	}
	
	@Override
	public String toString() {
		return super.toString() + "- staklena";
	}
}
