package com.sorting.bubble;

public class BubbleSort {

	// bubble sort time complexity = O(n^2)
	public static void bubbleSort(int arr[]) {
		// outer loop to count n-1 elements.
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
//inner loop for the comparisons.
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count2++;
				}
			}

			count++;
		} // end of outer loop
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "  ");

		}
		System.out.println("\nouter loop =: " + count);
		System.out.println("inner loop =: " + count2);
	}

	public static void main(String[] args) {
		//int[] arr = { 77, 4, 1, 56, 23,45,65,3,6,7,9,67};
		//int arr[] = {1,2,3,4,5,6,7,8,9,10};
		//int arr[] = {1,2,3,4,5,6,7,8,10,9};
		//bubbleSort(arr);
	}

}
