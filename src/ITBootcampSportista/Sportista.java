package ITBootcampSportista;

public class Sportista {
	
	// sportista poseduje ime, prezime i godrodj.Ime, prezime i godrodj mogu da se
	//zadaju prilikom kreiranja i ne mogu da se promene.
	//ispisati u obliku ime_prezime:godrodj.

	
	private String ime_prezime;
	private int godinaRodjenja;
	
	public Sportista(String ime_prezime, int godinaRodjenja) {
		this.ime_prezime = ime_prezime;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme_prezime() {
		return ime_prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public String print() {
		String print = ime_prezime + " " + godinaRodjenja + ", ";
		return print;
	}
	
	

}
