package testovi;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Tražiti od korisnika da unese pozitivan broj N. Zatim učitavati N brojeva sa
		 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete? ");
		int n = sc.nextInt();

		if (n <= 0) {

			System.out.println("Greska, morate uneti pozitivan broj: ");
			n = sc.nextInt();

		}

		System.out.println("Unesite " + n + " broja/eva odvojena/ih razmakom: ");
		double br = sc.nextDouble();
		double min = br;
		double i = 1;

		while (n > i) {

			double novibr = sc.nextDouble();
			if (novibr < min)
				min = novibr;
			i++;

		}

		System.out.print("Najmanji broj je: " + min);

	}

}