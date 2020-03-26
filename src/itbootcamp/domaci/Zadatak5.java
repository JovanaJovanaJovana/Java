package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		/* Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
 */
		Scanner sc = new Scanner(System.in);
		
		int opcija;
		double cena;
		double racun = 1000;
		double naplata;
		double kusur;
		
		do { 
			
			System.out.println("Izabarite jednu od ponudjenih opcija: 0 - izlaz iz programa, 1 - ubacivanje u potrosacku korpu, 2 - naplata racuna." );
			opcija = sc.nextInt();
			
		switch (opcija) {
		
		case 1:
			
			System.out.println("Unesite cenu izabranog proizvoda:");
			cena = sc.nextDouble();
			if (cena <=0 ) {
				System.out.println("Cena mora biti veca od 0 dinara, unesite iznos ponovo: ");
				cena = sc.nextDouble();
			} 
			if (cena > 0 ){
				racun = racun + cena;
				System.out.println("Vas racun sada iznosi: " + racun + " rsd.");
			}
			System.out.println();
			break;
			
		case 2:
			
			System.out.println("Molimo Vas, unesite novac za naplatu racuna:");
			naplata = sc.nextDouble();
			if (naplata < racun || naplata <=0) {
				System.out.println("Greska, minimalan iznos koji mozete da unesete je: " + racun);
			} if (opcija == 2 && naplata >= racun) {
				kusur = naplata - racun ;
				System.out.println("Hvala, Vas kusur je: " + kusur);
				racun = 0;
			}
			System.out.println();
			break;
			
		case 0:
			
			System.out.println("Kraj programa!");
			break;
			
		default:

			System.out.println("Greska. Molimo Vas izaberite neku od ponudjenih operacija!");
		} 
		} while (opcija != 0);	

	} 

}