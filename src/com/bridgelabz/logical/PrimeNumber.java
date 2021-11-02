package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {
	
	static int isPrime(int num) {
int count=0;
		for (int i = 1; i <= num; i++) {
		if (num % i == 0) {
			count++;
		}
	}
	return count;
	}
	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");

		int num = sc.nextInt();
		int check=isPrime(num);
		if (check == 2) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
	}
}
