package Zadatak2;

/* Flaša pića ima naziv, jednoznačni automatski generisan indetifikator, cenu bez kaucije,
zapreminu. Svi podaci se zadaju prilokom stvaranja i mogu da se dohvate, a jedino cena
može da se i promeni. Na glavnom izlazu se ispisuje u obliku „naziv: indetifikator, cena din,
zapremina l“. */

public class Flasa {

	private String naziv;
	private static int idGlobal = 1;
	private int id;
	private double cenaBezKaucije;
	private double cenaSaKaucijom;
	private double zapremina;
	
	public Flasa(String naziv, double cenaBezKaucije, double zapremina) {
		this.naziv = naziv;
		this.cenaBezKaucije = cenaBezKaucije;
		this.zapremina = zapremina;
		this.id = idGlobal;
		idGlobal++;
	}
	
	public Flasa(String naziv, double cenaBezKaucije, double zapremina, double cenaSaKaucijom) {
		this.naziv = naziv;
		this.cenaBezKaucije = cenaBezKaucije;
		this.cenaSaKaucijom = cenaSaKaucijom;
		this.zapremina = zapremina;
		this.id = idGlobal;
		idGlobal++;
	}

	public String getNaziv() {
		return naziv;
	}

	public static int getIdGlobal() {
		return idGlobal;
	}

	public int getId() {
		return id;
	}

	public double getCenaBezKaucije() {
		return cenaBezKaucije;
	}

	public double getCenaSaKaucijom() {
		return cenaSaKaucijom;
	}

	public double getZapremina() {
		return zapremina;
	}

	public void setCenaBezKaucije(double cenaBezKaucije) {
		this.cenaBezKaucije = cenaBezKaucije;
	}

	@Override
	public String toString() {
		return "naziv:" + naziv + ", identifikator=" + id + ", cenaBezKaucije=" + cenaBezKaucije + "rsd, zapremina="
				+ zapremina + "l";
	}
	
	
}
