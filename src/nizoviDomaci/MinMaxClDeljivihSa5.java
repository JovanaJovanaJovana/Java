package nizoviDomaci;

import java.util.Scanner;

public class MinMaxClDeljivihSa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * do while petlju koristimo za traženje člana koji je djeljiv sa 5. Kad pronađe
		 * član djeljiv sa 5 ostale članove niza (j+1) poredi sa for petljom - for (int
		 * i = j+1; i < niz.length. Postupak se ponavlja sve dok ne nađe djeljivog sa 5
		 * ili dok ne provjeri sve članove niza da li su djeljivi sa 5.
		 */
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Ucitaj broj clanova niza: ");
        int n = sc.nextInt();
   
        int niz[] = new int[n];
        
        System.out.println("Ucitaj clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.print(i + ". clan niza je: ");
            niz[i] = sc.nextInt();
        }
        
        boolean deljivSa5 = false; // indikator djeljivosti sa 5
         
        int max;   // maksimum niza
        int min;   //  minimum niza
        int j = 0;
        
        do{
            if (niz[j] % 5 == 0){   // traženje djeljivog sa 5
                max = niz[j];      // pronađen djeljiv sa 5
                min = niz[j];
                deljivSa5 = true;  
                 
                // provjeri ostale članove 
                for (int i = j; i < niz.length; i++) {
                    if ((max < niz[i]) && (niz[i] % 5 == 0))        // ? max djeljiv sa 5
                        max = niz[i];
                    if ((min > niz[i]) && (niz[i] % 5 == 0))        // ? min djeljiv sa 5
                        min = niz[i];
                }
                // if reguliše ulazak u ovaj deo i ima min i max
                System.out.println("Najmanji clan niza koji je djeljiv sa 5 je: "+ min);
                System.out.println("Najveci clan niza koji je djeljiv sa 5 je: "+ max);       
            }
            j++;
            
        } while ((deljivSa5 == false) && (j <= niz.length));
	}

}
