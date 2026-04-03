package com.leetcode.questions.blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/3sum/description/
public class Three3Sum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		// Step 1: Sort the array
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			// Optimization: If the current number is positive,
			// the sum can never reach 0 since the array is sorted.
			if (nums[i] > 0)
				break;

			// Step 2: Skip duplicates for the first number (i)
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			// Step 3: Two-pointer setup
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					// We found a valid triplet
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					// Step 4: Skip duplicates for the second number (left)
					while (left < right && nums[left] == nums[left + 1])
						left++;
					// Step 5: Skip duplicates for the third number (right)
					while (left < right && nums[right] == nums[right - 1])
						right--;

					// Move both pointers inward after processing a valid triplet
					left++;
					right--;
				} else if (sum < 0) {
					// Sum is too small, we need a larger number, move left pointer right
					left++;
				} else {
					// Sum is too large, we need a smaller number, move right pointer left
					right--;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		Three3Sum tSum = new Three3Sum();
		System.out.println(tSum.threeSum(nums));

	}
}
