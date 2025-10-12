package com.leetcode.questions.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=oizxjoit&
//Small input size (n < 1000) → brute force is fine (simple & no extra space).

//Large input size (n > 1000) → HashMap solution is the only practical choice.
public class TwoSum {
	/**
	 * Brute force approach
	 * Time complexity --O(n^2) Space complexity--O(1)
	 */

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}

			}

		}

		return nums;

	}

	/**
	 * Approach 2nd : Using HashMap for better time complexity O(N) and space
	 * complexity O(N).
	 * 
	 * @param args
	 */
	public static int[] twoSumUsingHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if (map.containsKey(difference)) {
				return new int[] { map.get(difference), i };
			}
			map.put(nums[i], i);
		}

		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 200;
		int[] result = twoSumUsingHashMap(nums, target);
		System.out.println("Output =" + Arrays.toString(result));

	}

}

/*
 * ====================Approaches to solve this problem Approach 1: Subtract
 * values from the target value and see if the remainder is present in the array
 * or not. If it does, then simply return the index of the value. This is not
 * the best solution as time complexity for this will be O(n)2 because for every
 * element we have to iterate the entire array.
 * 
 * Approach 2 is optimal:
 * 
 * 
 */



