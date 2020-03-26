package Zadatak2;

import java.util.ArrayList;

/* Glavni Program – napraviti listu plastičnih flaša i listu staklenih flaša. 
 * U svaku ubaciti nekoliko objekata. Izračunati račun za kupljeno piće, pri čemu 
 * se računaju cene sa kaucijom za staklene flaše a bez za plastične. Nije potrebno 
 * koristii Scanner klasu. */

public class GlavniProgram {

		public static double ukupnaCena(ArrayList<PlasticnaFlasa> popis) {
			double cena = 0;
			for (Flasa f : popis)
				cena += f.getCenaBezKaucije();
			return cena;
		}
		
		public static double ukupnaCena2(ArrayList<StaklenaFlasa> popis2) {
			double cena2 = 0;
			for (Flasa f : popis2)
				cena2 += f.getCenaSaKaucijom();
			return cena2;
		}
		
		public static void main(String[] args) {

		ArrayList<PlasticnaFlasa> plasFlase = new ArrayList<PlasticnaFlasa>();

		PlasticnaFlasa vodavoda = new PlasticnaFlasa("vodavoda", 25, 0.5);
		PlasticnaFlasa fruvita = new PlasticnaFlasa("fruvita", 30, 1.0);
		PlasticnaFlasa klaker = new PlasticnaFlasa("klaker", 10, 1.0);

		plasFlase.add(vodavoda);
		plasFlase.add(fruvita);
		plasFlase.add(klaker);

		ArrayList<StaklenaFlasa> staklFlase = new ArrayList<StaklenaFlasa>();

		StaklenaFlasa zajecarsko = new StaklenaFlasa("zajecarsko", 39, 0.5);
		StaklenaFlasa cocacola = new StaklenaFlasa("cocacola", 30, 1.0);
		StaklenaFlasa rosa = new StaklenaFlasa("rosa", 10, 1.0);

		staklFlase.add(zajecarsko);
		staklFlase.add(cocacola);
		staklFlase.add(rosa);
		
		System.out.println("Ukupna cena je: " + ukupnaCena(plasFlase));
		System.out.println("Ukupna cena je: " + ukupnaCena2(staklFlase));
		
		System.out.println(rosa.getCenaSaKaucijom());
	
	}
}


