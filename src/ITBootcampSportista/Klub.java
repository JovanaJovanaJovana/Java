package ITBootcampSportista;

import java.util.ArrayList;

// klub poseduje naziv, sediste, godosnivanja i niz sportista tipa Sportista
//sva polja mogu da se dohvate, a naziv kluba moze i da se postavi
// napisati metodu koja ce ispisati ceo objekat klase klub

public class Klub {
	
	private String naziv;
	private String sediste;
	private int godinaOsnivanja;
	private ArrayList<Sportista> sportiste;

	public Klub(String naziv, String sediste, int godinaOsnivanja) {
	
		this.naziv = naziv;
		this.sediste = sediste;
		this.godinaOsnivanja = godinaOsnivanja;
		sportiste = new ArrayList <Sportista>();
		
	}

	public String getNaziv() {
		return naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public void dodajSportista(Sportista s) {
		sportiste.add(s);
	}
	
	public String print() {
		String print = naziv + " " + sediste + " " + godinaOsnivanja + " {";
		for(int i = 0; i < sportiste.size(); i++) {
			print += sportiste.get(i).print();
		}
		print += "} ";
		return print;
		
		}
	
}
