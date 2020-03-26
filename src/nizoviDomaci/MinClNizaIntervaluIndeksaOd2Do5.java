package nizoviDomaci;

import java.util.Scanner;

public class MinClNizaIntervaluIndeksaOd2Do5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("Unesi broj clanova niza: ");
        int n = sc.nextInt();
 
        int niz[] = new int[n];
 
        for (int i = 0; i < n; i++) {
            System.out.print(i + ".clan niza je: ");
            niz[i] = sc.nextInt();
        }
 
        int min = niz[2];
 
        if (n < 6)
            System.out.println("zadatak neresiv");
        else{
            for (int i = 2; i <= 5; i++)
                if (niz[i] < min)
                    min = niz[i];
            System.out.println("Najmanji u indeksu od 2 do 5 je "+ min);
        }

	}

}
