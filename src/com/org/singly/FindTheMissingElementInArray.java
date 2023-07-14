package com.org.singly;

public class FindTheMissingElementInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 2, 4, 8, 0, 10 };

		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
			sum2 = sum2 + i+1;
		}
		int missingNumber = sum2-sum1;
		System.out.println("missing number : "+missingNumber);
	}

}
