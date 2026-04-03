package com.leetcode.questions.blind75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	/**
	 * Time complexity = O(3N)
	 * Space complexity = O(3N)
	 * @param nums
	 * @return answer
	 */
	public static int[] productExceptSelfBruteForce(int[] nums) {
		int n = nums.length;
		int[] pre = new int[n];
		int[] post = new int[n];
		int[] answer = new int[n];
		pre[0] = 1;
		for (int i = 1; i < n; i++) {
			pre[i] = nums[i - 1] * pre[i - 1];
		}
		/*
		 * post[3] = 1 post[2] = nums[3] * post[3] = 4 * 1 = 4 post[1] = nums[2] *
		 * post[2] = 3 * 4 = 12 post[0] = nums[1] * post[1] = 2 * 12 = 24
		 * 
		 */
		post[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			post[i] = nums[i + 1] * post[i + 1];
		}

		for (int i = 0; i < n; i++) {

			answer[i] = pre[i] * post[i];
		}

		return answer;

	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];

		// Step 1: calculate prefix product for each index

		answer[0] = 1;
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] * nums[i - 1];
		}

		// Step 2: multiply suffix product in reverse pass
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			answer[i] = answer[i] * suffix;
			suffix *= nums[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		 System.out.println(Arrays.toString(productExceptSelf(nums))); // ✅ [24, 12,
		// 8, 6]
		System.out.println(Arrays.toString(productExceptSelfBruteForce(nums)));
	}
}
