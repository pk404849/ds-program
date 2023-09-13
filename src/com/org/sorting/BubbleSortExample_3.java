package com.org.sorting;

public class BubbleSortExample_3 {

	public static void bubbleSort(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}

	public static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
			System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}

}
