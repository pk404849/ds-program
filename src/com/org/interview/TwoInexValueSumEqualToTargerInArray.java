package com.org.interview;

public class TwoInexValueSumEqualToTargerInArray {

	public static void main(String[] args) {
		// add the two number = 15 in given array
		int[] arr = { 7, 8, 10, 5, 7, 8, 11, 4 };

		int target = 15;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target && i != j) {
					System.out.println(arr[i] + ":" + arr[j] + "=" + target);
				}

			}
		}

	}

}
