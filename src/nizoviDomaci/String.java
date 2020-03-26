package nizoviDomaci;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Otkucaj tekst: ");
        Scanner sc = new Scanner(System.in);
        java.lang.String tekst = sc.nextLine();
 
        for (int i = 0; i < tekst.length(); i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println(tekst.charAt(i));
        }
	}

}
