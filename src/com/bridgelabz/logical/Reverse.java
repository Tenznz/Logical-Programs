package com.bridgelabz.logical;

import java.util.Scanner;

public class Reverse {

	public static void main(String args[]) {

		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int remainder;
		sc.close();
		System.out.print("Reverse of " + num + " is: ");

		while (num != 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num /= 10;
		}
		System.out.print(rev);

	}

}
