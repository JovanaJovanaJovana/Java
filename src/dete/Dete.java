package dete;

public class Dete {

	private String ime;
	private String prezime;
	private int brGodina;
	private int brKlikera;

	public static int brDece;
	public static int ukupneGod;

	public Dete(String ime, String prezime, int brGodina, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGodina = brGodina;
		this.brKlikera = brKlikera;

		brDece++;
		ukupneGod = ukupneGod + brGodina;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrGodina() {
		return brGodina;
	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public void dodajKlikere(int bk) {
		brKlikera = brKlikera + bk;
	}

	public void oduzmiKlikere(int bk) {
		brKlikera = brKlikera - bk;
	}

	public static double prosekGodina() {
		double prosek = Double.valueOf(ukupneGod) / Double.valueOf(brDece);
		return prosek;
	}
}