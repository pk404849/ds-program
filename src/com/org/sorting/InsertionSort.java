package com.org.sorting;

public class InsertionSort {

	public static void insertionSortAscendingOrder(int arr[]) {
		int length = arr.length;
		for (int i = 1; i < length - 1; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void insertionSortDescendingOrder(int arr[]) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void printData(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 1, 3, 2, 20 };
		insertionSortAscendingOrder(arr);
		printData(arr);
		insertionSortDescendingOrder(arr);
		printData(arr);
	}
}
