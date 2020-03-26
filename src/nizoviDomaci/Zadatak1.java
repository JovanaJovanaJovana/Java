package nizoviDomaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite duzinu niza: ");
		int n = sc.nextInt();
		
		int[] niz = new int[n];
		
		System.out.println("Unesite clanove niza");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + ".clan niza je: ");
			niz[i] = sc.nextInt();
		}
		
		System.out.print("Unesite broj kojim zelite da delite clanove niza: ");
		int br = sc.nextInt();
		
		System.out.print("Clanovi niza deljivi sa " + br + " su: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0)
				System.out.print(niz[i] + " ");	
					
		/*
		 napisati proveru da li je je korisnicki unos veci od 0
		 
        System.out.println("Koliko vas niz ima elemenata?");
        int n = sc.nextInt();

        System.out.println("Elementi niza (celi brojevi) su: ");
        int[] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        System.out.println("Unesi broj za deljivost");
        int br = sc.nextInt();

        System.out.print("Elementi niza deljivi brojem " + br + " su: ");

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] % br == 0) {
                System.out.print(niz[i] + " ");

		 	*/
	}

}
}