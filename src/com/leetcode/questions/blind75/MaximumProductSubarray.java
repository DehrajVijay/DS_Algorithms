package com.leetcode.questions.blind75;

public class MaximumProductSubarray {

	/**
	 * 
	 * Brute Force Solution (Time Complexity: O(n^2)) The brute-force approach
	 * checks
	 * 
	 * @param nums
	 * @return
	 */
	public static int maxProductBruteForce(int[] nums) {
		int n = nums.length;
		int maxProduct = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int currentProduct = 1;
			for (int j = i; j < n; j++) {
				currentProduct *= nums[j];
				maxProduct = Math.max(maxProduct, currentProduct);
			}
		}
		return maxProduct;
	}

	/**
	 * 
	 * Optimal Solution (Time Complexity: O(n)) The optimal approach keeps track of
	 * both the maximum and minimum products up to the current position.
	 * 
	 * @param nums
	 * @return
	 */
	public static int maxProduct(int[] nums) {
		int maxSoFar = nums[0];
		int minSoFar = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];

			if (current < 0) {
				// Swap because a negative flips max/min
				int temp = maxSoFar;
				maxSoFar = minSoFar;
				minSoFar = temp;
			}

			maxSoFar = Math.max(current, maxSoFar * current);
			minSoFar = Math.min(current, minSoFar * current);

			result = Math.max(result, maxSoFar);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 0,2, 3, -2, 4 };

		System.out.println("Maximum Product (Brute Force): " + maxProductBruteForce(nums));
		System.out.println("Maximum Product (Optimal): " + maxProduct(nums));

	}

}
