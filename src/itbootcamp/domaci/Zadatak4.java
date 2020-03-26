package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Unesite pozitivne brojeve odvojene razmakom koje zelite da saberete i bilo koji negativni broj za izracunavanje njihovog zbira.");

		int br;
		int suma = 0;

		while ((br = sc.nextInt()) > 0) {
			suma = suma + br;
		}
		
		System.out.println("Zbir unetih pozitivnih brojeva je " + suma + ".");
	}
}
