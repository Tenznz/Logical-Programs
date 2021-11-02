package com.bridgelabz.logical;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		 isPerfectNumber(n);
		

		sc.close();
	}

	static void isPerfectNumber(int num1) {
		int num2 = 0;

		if (num1 > 0) {
			System.out.println("factor are"); 
			for (int i = 1; i < num1; i++) {
				
				if (num1 % i == 0) {
					System.out.print(i+" "); 
					num2 = num2 + i;
					 
				}
			}
			System.out.println(); 
		}

		if (num2 ==num1) {
			System.out.println("sum is equal to "+num1+" \nIt is perfect number");
		}
		else 
			System.out.println("sum is not equal to "+num1+" \nIt is not perfect number");

	}

}
