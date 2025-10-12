package com.sorting.insertion;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		// outer for loop to traverse the array
		// loop is starting from i=1 because i=0 has first element which is assumed to
		// be in the sorted part.
		int count = 0;
		int count2 = 0;
		for (int i = 1; i < arr.length; i++) {
			// while loop to traverse in the unsorted array
			int current = arr[i];
			int j = i - 1;

			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
				count2++;
			}
			
			arr[j + 1] = current;
			count++;
		} // end of for loop
			// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("outer loop iterations : " + count);
		System.out.println("inner loop iterations : " + count2);
	}

	public static void main(String[] args) {
		//int arr[] = { 77, 4, 1, 56, 23, 45, 65, 3,6,7,9,67 };
		// int arr[] = {1,2,3,4,5,6,7,8,9,10};
	//	int arr[] = {1,2,3,4,5,6,7,8,10,9};
		//insertionSort(arr);
			}

}
