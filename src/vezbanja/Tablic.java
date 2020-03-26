package vezbanja;

import java.util.Scanner;

/* Zadatak predstavlja jedan deo kartaške igre Tablić.
Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio. 
Karte učitavati kao cele brojeve - kec je broj 11, žandar 12, dama 13 i kralj 14. 
Tražiti od korisnika da učita koliko karata ima, a nakon toga koje su to karte. 
Voditi računa o tome da li su broj karata, kao i svaka karta korektne vrednosti.
Napraviti metodu koja broji koliko ima štihova u nizu. Podrazumevati da mala dvojka 
i dupla desetka nemaju specijalno znacenje. Napraviti metodu koja će za dva prosleđena 
niza vratiti informaciju o tome ko je pobednik (ko ima više sakupljenih štihova).
Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda. */

public class Tablic {

	public static int brKarataPrvog() {
		System.out.println("Neka prvi igrac unese broj sakupljenih karata: ");
		Scanner sc = new Scanner(System.in);
		int br = sc.nextInt();
		while (br < 0 || br > 52) {
			System.out.println("Greska. Molimo Vas unesite broj izmedju 0 i 52. ");
			br = sc.nextInt();
		}
		return br;
	}

	public static int[] kartePrvog(int br) {
		System.out.println("Neka prvi igrac unese vrednosti sakupljenih karata: ");
		Scanner sc = new Scanner(System.in);
		int[] kartePrvog = new int[br];
		for (int i = 0; i < br; i++) {
			kartePrvog[i] = sc.nextInt();
			while (kartePrvog[i] < 1 || kartePrvog[i] > 14) 	{
				System.out.println("Greska. Vrednosti karata moraju biti u rasponu od 2 do 14.");
				System.out.println("Molimo Vas, unesite ponovo: ");
				kartePrvog[i] = sc.nextInt();
			}
		}
		return kartePrvog;
	}

	public static int brKarataDrugog() {
		System.out.println("Neka drugi igrac unese broj sakupljenih karata: ");
		Scanner sc = new Scanner(System.in);
		int br2 = sc.nextInt();
		while (br2 < 0 || br2 > 52) {
			System.out.println("Greska. Molimo Vas unesite broj izmedju 0 i 52. ");
			br2 = sc.nextInt();
		}
		return br2;
	}

	public static int[] karteDrugog(int br2) {
		System.out.println("Neka prvi igrac unese vrednosti sakupljenih karata: ");
		Scanner sc = new Scanner(System.in);
		int[] karteDrugog = new int[br2];
		for (int i = 0; i < br2; i++) {
			karteDrugog[i] = sc.nextInt();
			while (karteDrugog[i] < 1 || karteDrugog[i] > 14) 	{
				System.out.println("Greska. Vrednosti karata moraju biti u rasponu od 2 do 14.");
				System.out.println("Molimo Vas, unesite ponovo: ");
				karteDrugog[i] = sc.nextInt();
			}
		}
		return karteDrugog;
	}


	public static int stihoviPrvog(int kartePrvog[]) {
		int stihoviPrvog = 0;
		for (int i = 0; i < kartePrvog.length; i++) {
			if (kartePrvog[i] > 9 && kartePrvog[i] < 15)
				stihoviPrvog++;
		}
		System.out.println("Broj stihova prvog igraca je: " + stihoviPrvog);
		return stihoviPrvog;
	}

	public static int stihoviDrugog(int karteDrugog[]) {
		int stihoviDrugog = 0;
		for (int i = 0; i < karteDrugog.length; i++) {
			if (karteDrugog[i] > 9 && karteDrugog[i] < 15)
				stihoviDrugog++;
		}
		System.out.println("Broj stihova drugog igrac je: " + stihoviDrugog);
		return stihoviDrugog;
	}

	public static void pronadjiPobednika(int stihoviPrvog, int stihoviDrugog) {

		if (stihoviPrvog > stihoviDrugog)
			System.out.println("Prvi igrac je pobedio.");
		else if (stihoviPrvog < stihoviDrugog)
			System.out.println("Drugi igrac je pobedio.");
		else
			System.out.println("Igra je neresena.");
	}

	public static void main(String[] args) {
		int stihoviPrvog;
		int stihoviDrugog;
		int br = brKarataPrvog();
		int[] kartePrvog = kartePrvog(br);
		int br2 = brKarataDrugog();
		int[] karteDrugog = karteDrugog(br2);
		stihoviPrvog = stihoviPrvog(kartePrvog);
		stihoviDrugog = stihoviDrugog(karteDrugog);
		pronadjiPobednika(stihoviPrvog, stihoviDrugog);
	}

}
