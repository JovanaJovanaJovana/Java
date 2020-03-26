package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */

		Scanner sc = new Scanner(System.in);

		int br = 0;
		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				br = br + 1;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("Jesu brojevi koji su deljivi sa 3, ukupno ih ima " + br);

	}

}
