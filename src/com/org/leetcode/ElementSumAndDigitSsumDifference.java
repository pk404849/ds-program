package com.org.leetcode;

public class ElementSumAndDigitSsumDifference {

	public static int differenceOfSum(int[] nums) {
		int length = nums.length;
		int elementSum = 0;
		int digitSum = 0;
		for (int i = 0; i < length; i++) {
			elementSum = elementSum + nums[i];
			digitSum += digitSum(nums[i]);
		}
		int finalSum = Math.abs(elementSum - digitSum);
		return finalSum;

	}

	public static int digitSum(int number) {
		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

//		int arr[] = { 1, 15, 6, 3 };
		int arr[] = { 1, 2, 3, 4 };

		System.out.println(differenceOfSum(arr));
	}

}
