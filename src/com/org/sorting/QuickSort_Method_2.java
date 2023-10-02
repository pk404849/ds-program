package com.org.sorting;

public class QuickSort_Method_2 {

	public static int partionArray(int arr[], int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	public static void quickSortAscendingOrder(int arr[], int low, int high) {
		int partionIndex = partionArray(arr, low, high);
		if (low < partionIndex - 1) {
			quickSortAscendingOrder(arr, low, partionIndex - 1);
		}
		if (partionIndex < high) {
			quickSortAscendingOrder(arr, partionIndex, high);
		}
	}

	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// int[] arr = { 15,9,7,13,12,16,4,18,11 };
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quickSortAscendingOrder(arr, 0, arr.length - 1);
		printArray(arr);

	}

}
