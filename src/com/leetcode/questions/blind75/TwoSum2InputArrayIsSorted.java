package com.leetcode.questions.blind75;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 * 
 */
public class TwoSum2InputArrayIsSorted {

	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[] { left + 1, right + 1 }; // Found it!
			} else if (sum < target) {
				left++; // Sum is too small, move the left friend up
			} else {
				right--; // Sum is too big, move the right friend down
			}
		}
		return new int[] { -1, -1 };
	}

	
	/**
	 * 
	 * TC of this is O(n * log n) so, two pointer approach is better for this case.
	 * @param numbers
	 * @param target
	 * @return
	 */
	public static int[] twoSumByBinarySearch(int[] numbers, int target) {
		// Iterate through each number in the sorted array
		for (int i = 0; i < numbers.length; i++) {
			int complement = target - numbers[i];

			// Binary search for the complement in the remaining part of the array
			int low = i + 1;
			int high = numbers.length - 1;

			while (low <= high) {
				int mid = low + (high - low) / 2; // Avoid potential overflow

				if (numbers[mid] == complement) {
					// Problem asks for 1-based indexing
					return new int[] { i + 1, mid + 1 };
				} else if (numbers[mid] < complement) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return new int[] { -1, -1 }; // Fallback if no solution is found
	}

	public static void main(String[] args) {

		int target = 18;
		int[] numbers = { 2, 7, 11, 15 };

		System.out.println(Arrays.toString(twoSumByBinarySearch(numbers, target)));

	}

}
