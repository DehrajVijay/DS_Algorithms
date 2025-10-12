package com.searching;

import java.lang.reflect.Array;

public class MissNumByBinary {
	public static void miss(int arr[], int first, int last) {
		int mid = first + (last - first) / 2;
		int missNum = 0;
		int index = 0;
		int flag = 0;
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i + 1] - arr[i] == 2) {
				missNum = arr[i];

			}
			while (first <= last) {
				if (arr[mid] < missNum) {
					first = mid + 2;

				} else if (arr[mid] == missNum) {

					System.out.println("Missing number is : " + missNum + "found at indes : " + arr[mid]);
				} else {
					last = mid - 1;
				}
				mid = first + (last - first) / 2;

				if (first > last) {
					System.out.println("No missing number");
				}
			}
		}
	}

	public static void main(String[] args) {

		int first = 0;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };

		int last = arr.length;

		miss(arr, 0, last);
	}
}
