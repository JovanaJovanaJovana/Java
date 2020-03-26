package nizoviDomaci;

import java.util.Scanner;

public class MinIMaxClSaNeparnimIndeksom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
      System.out.print("Ucitaj broj clanova niza ");
      int n = sc.nextInt();

      int niz[] = new int[n];
      
      System.out.println("Ucitaj clanove niza:");
      for (int i = 0; i < niz.length; i++) {
          System.out.print(i + ". clan niza je: ");
          niz[i] = sc.nextInt(); 
      }
        int max =niz[1];
        int min =niz[1];
        
        for (int i=3; i < niz.length; i++) {
            if ((min > niz[i]) &&  (i%2 != 0))
                 min = niz[i];
            if ((max < niz[i]) &&  (i%2 != 0))
                 max = niz[i];
        }
        
        /* da je bilo sa parnim br indeksa:
       / int max = niz[0];
          int min = niz[0];
          for (int i=2; i < niz.length; i++) {
            if ((min > niz[i]) &&  (i%2 == 0))
                 min = niz[i];
            if ((max < niz[i]) &&  (i%2 == 0))
                 max = niz[i];
        }
           da je bilo sa br indeksa deljivim sa 3:
          int max =niz[0];
          int min =niz[0];
          for (int i=3; i < niz.length; i++) {
            if ((min > niz[i]) &&  (i%3 == 0))
                 min = niz[i];
            if ((max < niz[i]) &&  (i%3 == 0))
                 max = niz[i];
        } 
         
       */ 
        System.out.println("Najmanji clan niza sa neparnim indeksima: " + min);
        System.out.println("Najveci clan niza sa neparnim indeksima: "+ max); 

	}

}
