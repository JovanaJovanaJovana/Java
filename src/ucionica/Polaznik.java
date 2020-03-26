package ucionica;

/* Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
 * Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
 * Polaznik se ispisuje u obliku: IME_PREZIME. */


public class Polaznik {
	
	private String ime_prezime;
	
	public Polaznik(String ime_prezime) {
		
		this.ime_prezime = ime_prezime;
	}

	public String getIme_prezime() {
		return ime_prezime;
	}
	
	public String print() {
		String print = ime_prezime + ", ";
		return print;
	}

}
