package com.bridgelabz.logical;

import java.util.Random;

public class RandomCoupon {

	public static void getRandom(int max, int n) {
		int[] a = new int[max];

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = (int) ((Math.abs(random.nextInt())) % max + 1);
			int j = 0;
			while (j < i) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("" + a[i]);
		}
	}
}
