package vezbanja;

import java.util.Scanner;

public class ParanNeparan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * Napisati program koji proverava da li je uneti broj paran ili neparan.
		 * Ukoliko jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije,
		 * program treba da ispise poruku: Broj je neparan! Kod ce se izvrsavati dok se
		 * ne unese pozitivan prirodan broj
		 */

		System.out.println("Unesite negativni broj koji zelite da proverite, za resenje pritisnite bilo koji pozitivan broj:");
		int br = sc.nextInt();

		do {
			if (br % 2 == 0) {
				System.out.println("Uneti broj je paran!");
			}
			if (br % 2 != 0) {
				System.out.println("Uneti broj je neparan!");
			}
		} while ((br = sc.nextInt()) <= 0);

	}
}