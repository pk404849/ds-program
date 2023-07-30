package com.org.interview;

public class SortArrayDescendingOrder {

	public static void main(String[] args) {
		// sort the array without any build function
		int[] a1 = { 98, 8, 87, 86, 34, 76, 93 };

		for (int i = 0; i < a1.length; i++) {
			for (int j = i; j < a1.length - i; j++) {
				if (a1[i] > a1[j]) {
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

	}

}
