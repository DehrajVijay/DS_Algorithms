package com.leetcode.questions.patterns.twopointers;

import java.util.Arrays;
/**
 *https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/ 
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

	public static void main(String[] args) {

		int target = 9;
		int[] numbers = { 2, 7, 11, 15 };

		System.out.println(Arrays.toString(twoSum(numbers, target)));

	}

}
