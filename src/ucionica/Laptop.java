package ucionica;

import java.util.ArrayList;

/* Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju 
 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji 
 * koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u 
 * obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....} */

import ITBootcampSportista.Sportista;

public class Laptop {

	private ArrayList<Polaznik> polaznik;
	private String marka;

	public Laptop(String marka) {

		polaznik = new ArrayList<Polaznik>();
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void dodajPolaznika(Polaznik p) {
		polaznik.add(p);
	}

	public String print() {
		String print = marka + " {";
		for (int i = 0; i < polaznik.size(); i++) {
			print += polaznik.get(i).print();
		}
		print += "} ";
		return print;

	}
}
