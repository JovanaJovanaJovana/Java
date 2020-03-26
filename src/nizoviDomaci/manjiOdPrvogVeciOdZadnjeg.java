package nizoviDomaci;

import java.util.Scanner;

public class manjiOdPrvogVeciOdZadnjeg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
       System.out.print("Ucitaj broj clanova niza: ");
       int n = sc.nextInt();
 
       int niz[] = new int[n];
       
       System.out.println("Ucitaj clanove niza: ");
       for (int i = 0; i < niz.length; i++) {
           System.out.print(i + ". clan niza je: ");
           niz[i] = sc.nextInt(); 
       }
       
         int brmax = 0;
         int brmin= 0;
        
         for (int i=1; i < niz.length; i++) { // manji od prvog, zato se racuna od 2. clana odnosno index = 1
            if (niz[0] > niz[i])
                brmin = brmin+1;
         }
         
         for (int i=0; i < niz.length-1; i++){ // veci od zadnjeg, zato se racuna do predzadnjeg odnosno niz.length-1
               if (niz.length < niz[i])
                   brmax = brmax +1;
         }
         
         System.out.println("Broj manjih od prvog clana niza: "  + brmin);
         System.out.println("Broj vecih od zadnjeg clana niza: " + brmax);

	}

}
