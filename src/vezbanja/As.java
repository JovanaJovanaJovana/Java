package vezbanja;

import java.util.Scanner;

public class As {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Od 10 brojeva ispisati aritmeticku sredinu negativnih, aritmeticku sredinu pozitivnih i broj nula");
		int n, br = 0, br0 = 0, br1 = 0, s = 0, s1 = 0;
		double as, as1;
		for (int i = 1; i <= 10; i++) {

			System.out.print(i + ". broj ");
			n = sc.nextInt();

			if (n < 0) {
				s = s + n;
				br = br + 1;
			}
			if (n == 0)
				br0 = br0 + 1;
			if (n > 0) {
				s1 = s1 + n;
				br1 = br1 + 1;
			}
		}

		as = 0;

		if (br > 0)
			as = s / br;
		as1 = 0;
		if (br1 > 0)
			as1 = s1 / br1;

		System.out.println("Aritmeticka sredina negativnih brojeva " + as);
		System.out.println("Nula ima " + br0);
		System.out.println("Aritmeticka sredina pozitivnih brojeva " + as1);

	}

}
