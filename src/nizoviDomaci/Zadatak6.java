package nizoviDomaci;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju
		 * slovom d.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite recenicu: ");
		java.lang.String recenica = sc.nextLine(); 

		java.lang.String[] reci = recenica.split(" "); 

		int broj = 0; 
		
		for (int i = 0; i < reci.length; i++) {
			java.lang.String rec = reci[i];
			if (rec.startsWith("d") || rec.startsWith("D")) { 	
				broj++;
			}
		}

		System.out.println("Ima " + broj + " reci koje pocinju slovom d");

	}

}
