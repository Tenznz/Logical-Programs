package com.bridgelabz.logical;

import java.util.Scanner;

public class Coupon {

	public static void main(String[] args) {
		System.out.print("Enter Coupon from number : ");
		Scanner sc = new Scanner(System.in);
		int totalCoupon = sc.nextInt();

		System.out.print("Enter number of Coupon you need : ");
		int n = sc.nextInt();
		sc.close();
		RandomCoupon.getRandom(totalCoupon, n);

	}

}
