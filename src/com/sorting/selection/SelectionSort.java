package com.sorting.selection;

public class SelectionSort {
//selection sort time complexity = O(n^2)
	
	public static void selectionSort(int arr[]) {
		int count = 0;
		int count2 = 0;
		// outer loop
		for (int i = 0; i < arr.length - 1; i++) {
			// inner loop for the iteration and one swap per iteration

			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[smallest]) {
					smallest = j;
					count2++;
				}
			} // end of inner loop
				// swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			count++;
		} // end of outer loop

		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("outer loop iterations : " + count);
		System.out.println("inner loop iterations : " + count2);

	}

	public static void main(String[] args) {
		//int arr[] = {77, 4, 1, 56,23,45,65,3,6,7,9,67};
		//int arr[] = {1,2,3,4,5,6,7,8,9,10};
		//int arr[] = {1,2,3,4,5,6,7,8,10,9};
		//selectionSort(arr);

	}

}
