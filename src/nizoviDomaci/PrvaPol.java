package nizoviDomaci;

import java.util.Scanner;

public class PrvaPol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("Unesi broj clanova niza: ");
        int n = sc.nextInt();
 
        int niz[] = new int[n];
 
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". clan niza je");
            niz[i] = sc.nextInt();
        }
        
        int min = niz[0]; 
        int max = niz[0];
        
        for (int i = 1; i <= n / 2; i++) {
            if (niz[i] < min)
                min = niz[i];
            if (niz[i] > max)
                max = niz[i];
        }
        System.out.println("Najmanji je " + min);
        System.out.print("Najveci je " + max);

	}

}
