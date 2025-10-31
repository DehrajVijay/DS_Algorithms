package com.leetcode.questions.blind75;

public class MaximumSubArray {

	/**
	 * Brute Force Solution (Time Complexity: O(n^2))The brute-force approach checks
	 * the sum of every possible contiguous subarray.
	 * 
	 * @param nums
	 * @return maxSum
	 */
	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int currentSum = 0;
			for (int j = i; j < nums.length; j++) {
				currentSum += nums[j];
				maxSum = Math.max(maxSum, currentSum);
			}
		}

		return maxSum;
	}

	/**
	 * Optimal Solution (Kadane’s Algorithm, O(n)) Idea: Iterate through the array
	 * while keeping track of the current subarray sum. If the current sum becomes
	 * negative, reset it — because a negative sum will only reduce the next
	 * subarray’s sum.
	 * 
	 * @param nums
	 * @return maxSum
	 */
	public int maxSubArrayOptimalApproach(int[] nums) {
		int currentSum = 0;
		int maxSum = nums[0];

		for (int i = 0; i < nums.length; i++) {
			
			if (currentSum < 0) {
				currentSum = 0;
			}
			//else
			currentSum += nums[i];
			maxSum = Math.max(maxSum, currentSum);
			
		}

		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		MaximumSubArray ms = new MaximumSubArray();
		System.out.println(ms.maxSubArray(nums));
		System.out.println(ms.maxSubArrayOptimalApproach(nums));
	}

}
