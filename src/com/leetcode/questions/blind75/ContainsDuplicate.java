package com.leetcode.questions.blind75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=oizxjoit
//Question 217
public class ContainsDuplicate {
	/**
	 * Brute force approach : Time complexity O (n^2) { 11, 2, 3, 1, 45, 21, 2, 4 }
	 * 
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					// return true;
					flag = true;

				}

			}
		}
		return flag;
	}

	/**
	 * second way by sorting array. Time complexity : O(n log n) because O(n) for
	 * sorting and log n for the comparison. Space complexity: O(1) constant.
	 * { 11, 2, 3, 1, 45, 21, 2, 4 }
	 * [1, 2, 2, 3, 4, 11, 21, 45]
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicateBySort(int[] nums) {
		boolean flag = false;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {

				flag = true;
			}

			/*
			 * if (nums[i] - nums[i + 1] == 0) { flag = true;
			 * 
			 * }
			 */

		}
		return flag;
	}

	/**
	 * Optimal approach : Time complexity O(n) space complexity O(n) : Because we
	 * are storing elements in HashSet. HashSet : Best for searching operations
	 * because it takes O(1) time to search.
	 * 
	 * @param nums
	 * @return
	 */

	public boolean containsDuplicateByHashSet(int[] nums) {

		Set<Integer> visited = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (visited.contains(nums[i])) {
				return true;
			}
			visited.add(nums[i]);
			/*
			 * if (nums[i] - nums[i + 1] == 0) { flag = true;
			 * 
			 * }
			 */

		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 11, 2, 3, 1, 45, 21, 2, 4 };
		ContainsDuplicate cd = new ContainsDuplicate();
		// System.out.println("Result: " + cd.containsDuplicate(nums));
		 System.out.println("Result:" + cd.containsDuplicateBySort(nums));

		System.out.println("Result:" + cd.containsDuplicateByHashSet(nums));

	}

}
