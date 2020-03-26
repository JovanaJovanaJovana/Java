package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n, i = 0, suma = 0, proizvod = 1; 
		System.out.println("Unesite broj do koga ce se izvoditi racunske operacije:");
		n=sc.nextInt();
		
		if (n > 0) {
		
			for (i = 1; i <= n; i++) {

				if (i % 2 == 0) 		
				suma = suma + i;
				
				if (i % 2 != 0)
				proizvod = proizvod * i;
		
			}
		
			System.out.println("Suma parnih brojeva do cifre:" + n + " je " + suma + ", a proizvod neparnih brojeva do iste cifre je: " + proizvod + ".");
		
		}   else {
			
			System.out.println("Greska. Broj mora biti pozitivan.");
		}
}

}
