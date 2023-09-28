package com.org.sorting;

public class BubbleSortExample_2 {

	public static void bubbleSort(int arr[], int n) {
		boolean swapped;
		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 -i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false) {
				break;
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
