package vezbanja;

import java.util.Scanner;

public class Povrsina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int opcija;

		do {

			System.out.println(
					"Izaberite broj figure ciju biste povrsinu izracunali: 1 - kvadra, 2 - kocke, 3 - valjka, 4 - lopte, 0 - izlaz iz programa.");
			opcija = sc.nextInt();

			switch (opcija) {

			case 1:

				System.out.println("Unesite duzinu stranice a: ");
				double a = sc.nextDouble();
				System.out.println("Unesite duzinu stranice b: ");
				double b = sc.nextDouble();
				System.out.println("Unesite visinu kvadra: ");
				double h = sc.nextDouble();

				if (a <= 0 || b <= 0 || h <= 0) {
					System.out.println("Greska.Stranice kvadra moraju biti pozitivan broj.");
				} else {
					double p = 2 * (a * b + a * h + b * h);
					System.out.println("Povrsina kvadra je " + p);
				}
				break;

			case 2:
				System.out.println("Unesite duzinu stranice a: ");
				a = sc.nextDouble();
				if (a <= 0) {
					System.out.println("Greska.Stranice kocke moraju biti pozitivan broj.");
				} else {
					double p = 6 * a * a;
					System.out.println("Povrsina kocke je " + p);
				}
				break;

			case 3:
				System.out.println("Unesite poluprecnik valjka: ");
				double r = sc.nextDouble();
				System.out.println("Unesite visinu valjka:");
				h = sc.nextDouble();
				if (r <= 0 || h <= 0) {
					System.out.println("Greska. Dimenzije valjka moraju biti pozitivan broj.");
				} else {
					double p = (r * r * 3.14) + (2 * r * 3.14 * h);
					System.out.println("Povrsina valjka je " + p);
				}
				break;

			case 4:

				System.out.println("Unesite poluprecnik lopte: ");
				r = sc.nextDouble();
				if (r <= 0) {
					System.out.println("Greska. Dimenzije lopte moraju biti pozitivan broj.");
				} else {
					double p = 4 * r * r * 3.14;
					System.out.println("Povrsina lopte je " + p);
				}
				break;

			case 0:

				System.out.println("Kraj programa!");
				break;

			default:

				System.out.println("Greska. Molimo Vas izaberite neku od ponudjenih operacija!");
			}

		} while (opcija != 0);

	}
}