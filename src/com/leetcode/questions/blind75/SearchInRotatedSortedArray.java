package com.leetcode.questions.blind75;

public class SearchInRotatedSortedArray {

	public static void searchTarget(int[] nums, int target) {

		int index = -1;
		boolean isFound = false;
		/*
		 * for (int i = 0; i < nums.length; i++) { if (nums[i] == target) return i; }
		 * return -1; }
		 */
		for (int num : nums) {

			if (num == target) {
				index = num;
				isFound = true;
				System.out.println("found at " + index);
				break;
			}
		}
		if (!isFound) {
			System.out.println("not found");
		}

	}

	public static int searchTargetByOptimalApproach(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		if (nums == null || nums.length == 0) {
			return -1;
		}
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// Case A: The left half is sorted (from nums[left] to nums[mid])
			if (nums[left] <= nums[mid]) {

				if (target >= nums[left] && target < nums[mid]) {
					// Target is in the left half, so discard the right half
					right = mid - 1;
				} else {
					// Target is NOT in the left half, so search the right half
					left = mid + 1;
				}

			} else {
				// Case B: The right half is sorted (from nums[mid] to nums[right])
				if (target > nums[mid] && target <= nums[right]) {
					left = mid + 1;

				} else {
					// Target is NOT in the right half, so search the left half
					right = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 4, 5, 0, 1 };
		// searchTarget(nums, 41);
		System.out.println(searchTargetByOptimalApproach(nums, 5));
	}

}
