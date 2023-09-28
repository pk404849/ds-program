package com.org.sorting;

public class SelectionSort {

	public static void selectinSortAscendingOrder(int arr[]) {

		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void selectinSortDescendingOrder(int arr[]) {

		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
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
		selectinSortAscendingOrder(arr);
		printData(arr);
		selectinSortDescendingOrder(arr);
		printData(arr);
	}

}
