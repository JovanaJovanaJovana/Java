package vezbanja;

import java.util.Scanner;

public class Zvezdice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
			int i, j, n;
			System.out.println("Unesi broj redova ");
			n = sc.nextInt();
		
	/*	for (i = 0; i <= n; i++) {
			for (j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		} 
		
		
				System.out.println("Uneti m i n ");
		int m=sc.nextInt(), n=sc.nextInt();
		for (int a=1;a<=n;a++) {
			for (int b=1; b<=m;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		} */
		
			for (i = n - 1; i >= 1; i--) {
			for (j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		} 
	}

}
