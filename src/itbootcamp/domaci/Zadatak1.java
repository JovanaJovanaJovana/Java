package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite zeljenu masu u kilogramima.");	
		
		int nosivost = 680;
		double masa = sc.nextInt();
		
		if (masa >= 0 && masa < 680) {
			System.out.println("Bezbedno je voziti se u liftu.");	
		} else {
			if (masa < 0) {
			System.out.println("Vrednost mase mora biti pozitivan broj.");
		} else { 
			if (masa == 680) {
			System.out.println("Uneli ste granicnu vrednost opterecenja. Molimo Vas, spanjite masu zarad bezbednosti.");
		} else {
			if (masa > 680) {
			System.out.println("Lift nije bezbedan. Dozvoljena vrednost mase je do 680kg.");	
		}
		}
		}

	}

}
}