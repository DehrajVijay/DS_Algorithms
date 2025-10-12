package com.sorting.quicksort;

public class QuickSort {

//logical part
	// Quick sort time complexity worst= O(n^2)
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;// assuming no element is lesser than the pivot in starting.

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// swap two element.
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// actual position for pivot
		i++;
		int temp = arr[i];
		arr[i] = pivot;// = high
		arr[high] = temp;
		return i; // return the actual index for the pivot.
	}

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int pindex = partition(arr, low, high);

			quickSort(arr, low, pindex - 1);// first call for all the left unsorted list
			quickSort(arr, pindex + 1, high);// second call for all the right unsorted list

		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 3, 9, 5, 2, 8 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		// print
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
