package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		/*
		 * 4. Napravi program koji ce na izlazu izbaciti sliku pravougaonika od
		 * zvezdica: Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti
		 * dve for petlje;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int m = sc.nextInt();
		System.out.println("Unesite broj kolona: ");
		int n = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*   ");
			}
			
			System.out.println();
		}
	}
}
