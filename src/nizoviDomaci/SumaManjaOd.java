package nizoviDomaci;

import java.util.Scanner;

public class SumaManjaOd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj clanova niza: ");
		int n = sc.nextInt();

		int niz[] = new int[n];

		System.out.println("Unesite clanove niza");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + ". clan niza je: ");
			niz[i] = sc.nextInt(); 

		int s = 0;
		int k = 0; // k je pocetna vrednost

		do {
			s = s + niz[k];
			k++;
		} while (k < niz.length && s + niz[k] < 241);
		
		System.out.println("Sabrani clanove niza sve dok je suma manja od 241 iznosi: " + s);
	}

}
}