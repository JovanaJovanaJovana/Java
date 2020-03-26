package zadatak1;

/* U Glavnom programu kreirati Mauntinbike koji ima 3 brzine, bzinu od 100km/h I visinu sedista
podesenu na 25cm. Ispisati u konzoli ovaj Mauntinbike. */

public class Glavna {

	public static void main(String[] args) {
		
		MountainBike ponika = new MountainBike(3, 100, 25);
		
		System.out.println(ponika);
		
		
	}

}
