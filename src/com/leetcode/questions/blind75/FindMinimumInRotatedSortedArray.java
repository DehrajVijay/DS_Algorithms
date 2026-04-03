package com.leetcode.questions.blind75;

public class FindMinimumInRotatedSortedArray {

	/**
	 * Brute Force Approach
	 * time complexity: O(n) and space complexity: O(1)
	 * @param nums
	 * @return
	 */
	
	public int findMinByBruteForce(int[] nums) {
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
	
	/**
	 * Binary Search Approach
	 * time complexity: O(log n) and space complexity: O(1)
	 * @param nums
	 * @return
	 */
	public int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
/**
 * If the middle element is greater than the rightmost element,
 * then the minimum element must be in the right half of the array.
 */
			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		} 

		return nums[left];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimumInRotatedSortedArray finder = new FindMinimumInRotatedSortedArray();
		int[] nums = {3,4,5,1,2};
		 int min = finder.findMin(nums);
		 System.out.println("The minimum element by optimal approach is: " + min);
		 
		 
		 int minBruteForce = finder.findMinByBruteForce(nums);
		 System.out.println("The minimum element by brute force approach is: " + minBruteForce);
		 
		  	
	}

}

