package dete;

public class Glavna {

	public static void main(String[] args) {
		
		Dete jo = new Dete ("Jovana", "Petovic", 25, 18);
		Dete zo = new Dete ("Zorana", "Stojanovic", 24, 3);
		Dete nono = new Dete("Novak", "Kliic", 24, 34);
		
		jo.dodajKlikere(6);
		zo.dodajKlikere(45);
		nono.oduzmiKlikere(2);
		jo.dodajKlikere(11);

		System.out.println("Ja imam " + jo.getBrKlikera() + " klikera");
		System.out.println("Zo ima " + zo.getBrKlikera() + " klikera");
		System.out.println("Nono ima " + nono.getBrKlikera()+ " klikera");
		
		System.out.println("Prosek godina je: " + Dete.prosekGodina() );

	}

}
