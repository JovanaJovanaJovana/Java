package zadatak1;

/* MountainBike je bicikli koji dodatno ima podesavanje visine sedista. 
 * Visina sedista moze da se podesi na neku vrednost I da se dohvati. 
 * Napisati metodu koja vraca String: Bickli ima menjac brzina bicikla je 
 * brzina visina sedišta je visinaSedista. */

public class MountainBike extends Bicikl {
	
	private int visSedista;
	
	public MountainBike (int menjac, int brzina, int visSedista) {
		super(menjac, brzina);
		this.visSedista= visSedista;

	}
	
	public int getVisSedista() {
		return visSedista;
	}

	public void setVisSedista(int visSedista) {
		this.visSedista = visSedista;
	}
	
	@Override
	public String toString() {
		return "MountainBike ima menjac sa " +  menjac + " brzina." + "\n" + 
	"Brzina bicikla je: " + brzina + "km/h" + "\n" + "Visina sedista je: " + visSedista;
	}

}
