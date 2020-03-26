package banka;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Racun mojRacun = new Racun();
		
		mojRacun.uplati(10000); 
		System.out.println(mojRacun.dohvatiStanje());
		mojRacun.podigni(1000); 
	
		System.out.println(mojRacun.dohvatiStanje());
		
		Racun tvojRacun = new Racun(); 
		tvojRacun.uplati(15000);
		System.out.println(tvojRacun.dohvatiStanje());
		tvojRacun.podigni(2000); 
		System.out.println(tvojRacun.dohvatiStanje());
		
	}

}
