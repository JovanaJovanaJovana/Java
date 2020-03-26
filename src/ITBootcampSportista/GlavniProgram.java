package ITBootcampSportista;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Sportista s1 = new Sportista("Franz Mark", 2019);
		System.out.println(s1);
		Klub k1 = new Klub("Partizan", "Beograd", 1934);
		k1.dodajSportista(s1);
		
		Sportista s2 = new Sportista ("Felix Gonzales Torres", 1994);
		k1.dodajSportista(s2);
		System.out.println(k1.print());	

	}

}
