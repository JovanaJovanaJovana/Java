package vezbanja;

import java.util.Scanner;

public class NajmanjiBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Traziti od korisnika da unese pozitivan broj N. Zatim ucitavati N brojeva sa
		 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete? ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.print("Greska, morate uneti pozitivan broj: ");

		}

		else {

			System.out.println("Unesite zeljene brojeve odvojene razmakom: ");
			int br = sc.nextInt();
			int min = br;
			int i = 1;

			while (n > i) {
				
				int novibr = sc.nextInt();
				if (novibr < br)
					min = novibr;
				i++;
			}
			
			System.out.println("Najmanji broj je: " + min);

		}

	}
} 
