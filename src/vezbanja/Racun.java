package vezbanja;

import java.util.Scanner;

public class Racun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * Ukoliko kupac kupi robu u iznosu vecem od 1500 dinara, dobija 10% popusta, a
		 * ukoliko kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta. Napisati
		 * program koji ce za uneti iznos odabrane robe ispisati koliko zapravo treba
		 * platiti.
		 */

		System.out.println("Unesite iznos robe:");
		double iznos = sc.nextDouble();

		if (iznos <= 0) {

			System.out.println("Greska, iznos mora biti veci od nule. Molimo Vas, unesite ponovo:");
			iznos = sc.nextDouble();

		} else if (iznos > 0 && iznos < 1500) {

			System.out.println("Iznos Vase kupovine je: " + iznos + " rsd.");

		} else if (iznos > 1500 && iznos < 7000) {

			iznos = iznos - (iznos * 0.1);
			System.out.println("Iznos Vase kupovine sa uracunatim popustom od 10% je: " + iznos + " rsd.");

		} else if (iznos > 7000) {

			iznos = iznos - (iznos * 0.2);
			System.out.println("Iznos Vase kupovine sa uracunatim popustom od 20% je: " + iznos + " rsd.");
		}
	}
}
