package com.leetcode.questions.blind75;

public class ContainerWithMostWater {
	/**
	 * Time Complexity: O(n^2) — We use nested loops to check all pairs. Space
	 * Complexity: O(1) — We only store the maxArea variable.
	 * 
	 * @param height
	 * @return
	 */
	public static int maxAreaBruteForce(int[] height) {
		int maxArea = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				// Calculate area: width * min height
				int currentArea = (j - i) * Math.min(height[i], height[j]);
				maxArea = Math.max(maxArea, currentArea);
			}
		}
		return maxArea;
	}

	/**
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			// Calculate the height of the container
			int h = Math.min(height[left], height[right]);
			// Calculate area and update maxArea if current is larger
			maxArea = Math.max(maxArea, h * (right - left));

			// Move the pointer that points to the shorter line
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxAreaBruteForce(height));

	}

}
