package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Polaznik p1 = new Polaznik("Kazimir Malevich");
		
		Laptop lp1 = new Laptop("Apple");
		lp1.dodajPolaznika(p1);
		
		Polaznik p2 = new Polaznik("Mihail Larionov");
		lp1.dodajPolaznika(p2);
		
		System.out.println(lp1.print());	

	}

}
