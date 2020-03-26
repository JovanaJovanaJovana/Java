package zadatak1;

/* Bicikli poseduje pedale(g/s), menjac(g/s) i brzinu. Brzina može da se 
 * povećava ubrzanim okretanjem pedala I smanjuje kocenjem (kreirati dve 
 * metode). Napisati metodu koja vraca String oblika: Bickli ima menjac
   brzina bicikla je brzina. */

public class Bicikl {

	protected int menjac;
	protected int brzina;
	public int maxBrzina; 
	
	public Bicikl(int menjac, int brzina) {
		this.menjac = menjac;
		this.brzina = brzina;
		this.maxBrzina = maxBrzina;
	}

	public int getMenjac() {
		return menjac;
	}

	public void setMenjac(int menjac) {
		this.menjac = menjac;
	}
	
	public void povecajBrzinu(int povecanje) {
		if (povecanje > 0 && maxBrzina > brzina + povecanje) 
			brzina += povecanje;
	} 
	
	public void smanjiBrzinu(int smanjenje) {
		if(smanjenje>0 && brzina - smanjenje >= 0) {
			brzina -= smanjenje;
		}
	}
	
	public int getBrzina() {
		return brzina;
	}

	@Override
	public String toString() {
		return "Bicikl ima " + menjac + "\n" + "Brzina bicikla je: " + brzina;
	}
	
	

}
