package nizoviDomaci;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		 * niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();

		int niz[] = new int[n];
		int p = 1;

		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + ".clan niza je: "); // ako hocemo da index niza krece od 1. ((i + 1) + ".clan niza je: ")
			niz[i] = sc.nextInt();
			if (niz[i] > i)
				p = p * niz[i];
		}

		for (int i = 0; i < niz.length; i++)
		System.out.print(niz[i] + " ");
		System.out.println();
		System.out.println("Proizvod clanova niza koja su veci od svog indeksa je: " + p);

	}

}
