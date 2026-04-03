package com.leetcode.questions.blind75;

/**
 * This is the Burte force approach for this problem. time complexity O(n^2)
 * space complexity O(1)
 * 
 */
public class BuyAndSellStock {
	public static int maxProfitByBruteForce(int[] prices) {
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];

				if (profit > maxProfit) {
					maxProfit = profit;

				}

			}

		}
		return maxProfit;

	}

	/**
	 * This is the optimal approach to solve this problem. 
	 * Time complexity O(n)
	 *  space complexity O(1)
	 * 
	 * @param prices
	 * @return
	 */

	
	public static int maxProfit(int[] prices) {
		int buy = prices[0];
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < buy) {
				buy = prices[i];
			}
			profit = Math.max(profit, prices[i] - buy);
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Resutl: " + maxProfit(prices));
		System.out.println("Resutl: " + maxProfitByBruteForce(prices));

	}
}
