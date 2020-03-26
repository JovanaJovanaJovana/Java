package nizoviDomaci;

import java.util.Scanner;

public class clVeciOdPrethodnog {

	public static void main(String[] args) {
		
		// Učitati niz od n članova. Ispisati one članove niza koji su veći od svog
				// prethodnika, člana niza.

	Scanner sc = new Scanner(System.in);

	System.out.print("Unesite broj clanova niza: ");
	int n = sc.nextInt();

	int niz[] = new int[n];

	System.out.println("Unesite clanove niza:");
	for (int i = 0; i < niz.length; i++) {
		System.out.print(i + ". clan niza je: ");
		niz[i] = sc.nextInt(); 
	}

	for (int i = 1; i < niz.length; i++) {
		if (niz[i] > niz[i - 1])
		System.out.println("niz[" + i + "]=" + niz[i]);
	}
		// a veci od svog sledbenika
		
	/*	for (int i = 0; i < niz.length -1; i++) {
		if (niz[i] > niz[i + 1])
		System.out.println("niz[" + i + "]=" + niz[i]);
	}
*/
}
}