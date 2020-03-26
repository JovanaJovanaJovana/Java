package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		
		/*
		 * 1. Napisati program koji ce ispisati n brojeva Fibonacijevog niza. (Na
		 * internetu istraziti sta je Fibonacijev niz!!!)
		 */

		Scanner sc = new Scanner(System.in);

		int prvi = 0;
		int drugi = 1;
		int treci;

		System.out.println("Unesite broj clanova Fibonacijevog niza: ");
		int n = sc.nextInt();
		System.out.print(prvi + " " + drugi);

		for (int clan = 2; clan <= n; clan++) {
			treci = prvi + drugi;
			System.out.print(" " + treci);
			prvi = drugi;
			drugi = treci;
		}
	}

}
