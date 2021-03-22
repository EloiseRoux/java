package application;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e1, e2;
		float f1, f2;
		e1 = sc.nextInt();
		e2 = sc.nextInt();
		f1 = sc.nextFloat();
		f2 = sc.nextFloat();
		System.out.println("e1/e2 = " + (e1 / e2) + "\nf1/f2 = " + (f1 / f2));

	}

}
