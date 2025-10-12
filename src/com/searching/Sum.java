package com.searching;

import java.util.Scanner;

public class Sum {
	static int n;

// for int
	public static int sumByInt() {
		int sum = 0;// range of int is of 10 digit number
		int count = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;// sum of n natural numbers =n*(n+10)/2
			count++; // n+1 times
		}

		System.out.println("the sum is: " + sum);
		System.out.println("number of iterations : " + count + " times.");

		return sum;
	}

	// for int
	public static Long sumByLong() {
		Long sum = 0L;// range of int is of 10 digit number
		int count = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;// sum of n natural numbers =n*(n+10)/2
			count++; // n+1 times
		}

		System.out.println("the sum is: " + sum);
		System.out.println("number of iterations : " + count + " times.");
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth element");
		n = sc.nextInt();
		if (n <= 60000) {
			System.out.println("By int function");
			sumByInt();

		} else if (n > 60000) {
			System.out.println("By Long function");
			sumByLong();
		}
	
	
	}
}