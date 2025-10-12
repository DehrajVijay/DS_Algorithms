package com.searching;

public class LSearch {
// O(n^2)
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 12, 8, 34, 9 };
		int target = 122;
		int mid;
		int first = 0;
		int last = arr.length - 1;
		mid = (first + last) / 2;
		
		while (first <= last) {
			if (arr[mid] == target) {

				System.out.println("elemetn found at " + mid);
				break;
			} else if (arr[mid] < target) {
				first = mid + 1;
			} else {
				last = mid - 1;

			}
			mid = (first + last) / 2;
		} // end of for loop
		if (first > last) {
			System.out.println("element not found");
		}
	}
}