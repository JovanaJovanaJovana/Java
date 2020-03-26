package autobus;

public class Glavna {

	public static void main(String[] args) {
		
		Vozac v1 = new Vozac("pera", "peric", "sofer");
		Autobus a1= new Autobus("lasta", v1, 80.00, 48);
		
		System.out.println(a1);
		
		Putnik p1=new Putnik ("Luka", "Lukic", 800);
		Putnik p2=new Putnik("Misa", "Misic", 700);
		Putnik p3=new Putnik("Lepa", "Lepic", 1000);
		
	    a1.dodajVozaca(v1);
		
		a1.dodajPutnika(p1, 4);
		a1.dodajPutnika(p2, 10);
		a1.dodajPutnika(p3, 6);
		
		a1.naplataKarte(p3);
		

	}

}
