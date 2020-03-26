package vezbanja;

import java.util.Scanner;

public class Kamata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double kolicinaNovca, kamatnaStopa, povratniNovac;
		System.out.println("Unesite kolicinu novca");
		kolicinaNovca = sc.nextDouble();
		kamatnaStopa = 10;
		povratniNovac = kolicinaNovca * (1 + 0.01 * kamatnaStopa);
		System.out.println("Iznos novca koji je potrebno vratiti je " + povratniNovac + " din");

	}

}
