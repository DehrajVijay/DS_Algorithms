package com.searching.binary;

public class BinarySearch {

	public static void binarySearch(int arr[], int last, int num) {
		int first = arr[0];
		int mid = (first + last) / 2;
		int count = 0;
		while (first <= last) {
			count++;
			if (arr[mid] < num) {
				first = mid + 1;

			} else if (arr[mid] == num) {
				System.out.println("element found at : " + mid);
				System.out.println("total number of iterations  " + count);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
			if (first > last) {
				System.out.println("element not found");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, 8, 13};
		int num = 13;
		int last = arr.length - 1;
		binarySearch(arr, last, num);

	}

}
