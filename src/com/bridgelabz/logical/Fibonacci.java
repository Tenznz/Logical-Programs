package com.bridgelabz.logical;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		System.out.println("Enter number for fibonacci"); 
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int n1 = 0, n2 = 1, n3, i;
		sc.close();
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
