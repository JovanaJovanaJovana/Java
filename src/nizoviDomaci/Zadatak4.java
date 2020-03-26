package nizoviDomaci;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();

		int niz[] = new int[n];
		int nizUnazad[]  = new int[n];

		System.out.println("Unesite clanove niza: ");
			for (int i = 0; i < niz.length; i++) { 
				System.out.print(i + ".clan niza je: ");
				niz[i] = sc.nextInt();
				nizUnazad[(niz.length-1)-i] = niz[i];	
			}

			System.out.print("Prvi niz cine clanovi: ");
			for (int i = 0; i < niz.length; i++) 
				System.out.print(niz[i]);
				System.out.println();
	
			System.out.print("Niz ispisan unazad je: ");
			for (int i = 0; i < niz.length; i++) 
				System.out.print(nizUnazad[i]);

			if (Arrays.equals(niz, nizUnazad)) {
				System.out.println();
				System.out.println("Niz jeste palindrom!");
			}
			else {
				System.out.println();
				System.out.println("Niz nije palindrom!");
			}	

	}
}