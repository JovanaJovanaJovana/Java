package nizoviDomaci;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj clanova niza: ");
		int n = sc.nextInt();

		int niz[] = new int[n];

		System.out.print("Unesite clanove niza: ");
		for (int i = 0; i < n; i++) // ili i<niz.length;
			niz[i] = sc.nextInt();

		System.out.print("Obrnuti redosled Vaseg niza je: ");
		for (int i = n - 1; i >= 0; i--)
			System.out.print(niz[i] + " ");
		
		
		
		
		/*	 System.out.println("N?");

	        //napisati proveru da je korisnicki unos veci od 0
	        int n = sc.nextInt();
	        int[] niz = new int[n];

	        for (int i = 0; i< niz.length; i++){
	            niz[i] = sc.nextInt();
	        }

	        for (int i = niz.length -1; i >= 0; i--){
	            System.out.println(niz[i]);
	            
	     */       

		/*
		 * System.out.println("Unesite broj clanova niza:"); 
		 * int n = sc.nextInt(); 
		 * int prviniz;
		 * 
		 * int[] niz = new int[n];
		 * 
		 * System.out.println("Unesite clanove niza:"); 
		 * for (int i = 0; i < niz.length; i++)  
		 * niz[i] = sc.nextInt(); 
		 * 
		 * System.out.print("Vas niz je: ");  
		 * for (int i = 0; i < niz.length; i++) 
		 * System.out.print(niz[i] + ", "); 
		 * 
		 * for (int i = 0; i < niz.length / 2; i++) {
		 * prviniz = niz[i]; 
		 * niz[i] = niz[niz.length - 1 - i]; 
		 * niz[niz.length - 1 - i] = prviniz; }
		 * 
		 * System.out.println(); 
		 * System.out.print("Obrnuta vrednost Vaseg niza je: ");
		 * for (int i = 0; i < niz.length; i++) {
		 * System.out.print(niz[i] + ", "); 
		 *  }
		 */

	}

}
