package nizoviDomaci;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Ucitaj broj clanova niza ");
		int n = sc.nextInt();

		int niz[] = new int[n];
		
		System.out.println("Ucitaj clanove niza:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + ". clan niza je: ");
			niz[i] = sc.nextInt(); 
		}
		
		System.out.print("Vas niz je: ");
		for (int i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " "); // ispis svih clanova niza

		// Postupak trazenja maksimuma u max i minimuma u min
		int max = niz[0];
		int min = niz[0];
		
		for (int i = 1; i < niz.length; i++) {
			if (max < niz[i])
				max = niz[i];
			if(min > niz[i])
				min = niz[i];
		}
		
		System.out.println("Najveci clan niza je " + max + ", a najmanji je " + min);

	}

}
