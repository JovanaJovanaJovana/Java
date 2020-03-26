package itbootcamp.domaci;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 2;
		
		
		System.out.println(++i);	// prefiks povecava vrednost varijable odmah
		System.out.println(i++);	// sufiks povecava vrednost varijable, ali pamteci je, ne ispisuje je odmah vec u narednom pozivanju ili nakon racunske operacije
		System.out.println(i);		// vrednost sufiksa je tek sada dodeljen varijabli

		// Iz toga sledi, ako je:
		
		int a = 2;
		int b = 6;
		int c = 3;
		
		 c = ++a + --b;	// ++a=3 plus --b=5 jednako je 8, C JE SADA 8
		 b = ++a * c--; // ++a=4 puta c--=8(minus jedan se pamti), B JE SADA 32
		 a = b++ - --c; // b=32(plus jedan se pamti) minus c=8 - 1 i - zapamceno 1 = 6, A JE SADA 26
		 c = --b + a++; // b=32(-1, + zapamcenih 1) plus a=26(plus 1 se pamti), C JE SADA 58
		 b = c++ - --a; // c=58(plus 1 se pamti) minus a=26(-1 + zapamcenih 1), B JE SADA 32
		 a = ++c - b--; // c=59 + zapamcenih 1 = 60, minus b=32(minus zapamcenih 1), A JE SADA 28
		 c = b-- + --a; // b=31(minus zapamcenih 1) plus a=27, C JE SADA 58
		 a= ++c - b--;  // c=59 minus b=30(minus zapamcenih 1), A JE SADA 

		System.out.println(a);
		System.out.println(b); // b=30(minus zapamcenih 1)
		System.out.println(c);
	}

}
