package com.arrays;

public class SearchMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };// missing number is 8
		int sum = 0;// local variable.
		int count1 = 0;
		int count2 = 0;
		// loop to traverse the array and find the sum of all the numbers in array.

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];// adding the values of index to sum.
			count1++;
		}
		System.out.println("Sum of all the numbers present in array is: " + sum);// printing sum
		/*
		 * loop to find the sum of n natural numbers sum of n natural = n*(n+1)/2 once
		 * we get this sum, we can subtract the array sum from this and we will get the
		 * missing number hence missing number=natural sum-array sum.
		 */
		int naturalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			int n = arr.length + 1;// +1 to balance that one missing number.
			naturalSum = n * (n + 1) / 2;
			count2++;
		}
		int missingNumber = naturalSum - sum;
		int index = missingNumber - 1;
		System.out.println("Sum of all the numbers till N is: " + naturalSum);
		System.out.println("Missing number is:" + (missingNumber));
		System.out.println("missing number Index is: " + index);
		System.out.println("Iterations for array sum :" + count1 + "\nIterations for natural sum : " + count2
				+ "\n time complexity = O(n^2)");
	}
}
