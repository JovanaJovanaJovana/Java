package nizoviDomaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5054 Ispis: Niz je rastuci.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

     //napisati proveru da je korisnicki unos veci od 0
		   
		   System.out.print("Unesite duzinu niza: ");
		   int n = sc.nextInt();
		   
		   int[] niz = new int[n];
		   
		   System.out.println("Unesite clanove niza: ");
		   for (int i = 0; i < niz.length; i++) {
			   System.out.print(i + ". clan niza je: ");
			   niz[i] = sc.nextInt();
		   }
		   
		   boolean a = true;

		   for (int i = 0; i < niz.length - 1; i++) {
			   if (niz[i] >= niz[i + 1]) {
				   System.out.println("Niz nije rastuci.");
			   	   a = false;
				   break;
			   }   
		   }
		   
		   if (a = true)
		   System.out.println("Niz je rastuci.");
			  
		   }
	}

		/*
		System.out.print("Unesite duzinu niza: ");
		int n = sc.nextInt();

		int[] niz = new int[n];
		
		System.out.print("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(i + ". clan niza je: ");
			niz[i] = sc.nextInt();
		}

		boolean a = true;

		for (int i = 0; i < niz.length - 1; i++) {

			if (niz[i] > niz[i + 1]) {
				System.out.println("Niz nije rastuci");
				a = false;
				break;
			}

		}  

		if (a != false)
			System.out.println("Niz je rastuci");
		 */			
	
		/*		int n;
		int x1,x2;
		boolean rastuci = true;
		System.out.println("Unesite broj n: ");
		n = sc.nextInt();
		System.out.println("Unesite 1.broj");
		x1 = sc.nextInt();
		
		for(int i = 0; i < n-1;i++) {
			System.out.println("Unesite " + (i+2) + ". broj");
			x2 = sc.nextInt();
			if(x2 < x1) {
				rastuci = false;
				break;
			}
			x1 = x2;
		}
		if(rastuci)
			System.out.println("Niz je rastuci");
		else
			System.out.println("Niz nije rastuci");
	}

}  */
