package com.searching;

public class MissingNumber {
	public static void linearSearch(int arr[]) {
		int missingNumber = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == 2) {
					count2++;
					missingNumber = (arr[i] + 1);
					break;

				} else { 
					
//					System.out.println("no element");

				}

			}
			// count2++;


			count1++;

		}
		System.out.println("Missing Number is: " + missingNumber);
		System.out.println("Missing number index is: " + (missingNumber - 1));
		System.out.println("Outer loop Iterations: " + count1);
		System.out.println("Inner Loop Iterations: " + count2 + "\nTime complexity = O(n^2)");
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		linearSearch(arr);
	}

}
