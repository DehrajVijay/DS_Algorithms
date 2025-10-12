package com.sorting.app;

import java.util.Scanner;
import com.sorting.selection.SelectionSort;
import com.sorting.bubble.BubbleSort;
import com.sorting.insertion.InsertionSort;

public class SortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	final int[] arr = { 77, 4, 1, 56, 23, 45, 65, 3, 6, 7, 9, 67 };

		System.out.println("press 1 to use bubble sort");
		System.out.println("press 2 to use selection sort");
		System.out.println("press 3 to use insertion sort");
		System.out.println("press 4 to see the comparison");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			BubbleSort.bubbleSort(arr);
			break;
		case 2:
			SelectionSort.selectionSort(arr);
			break;
		case 3:
			InsertionSort.insertionSort(arr);
			break;
		case 4:
			System.out.println("------------Bubble Sort------------------");
			BubbleSort.bubbleSort(arr);
			System.out.println("\n----------Selection Sort---------------");
			SelectionSort.selectionSort(arr);
			System.out.println("\n----------Insertion Sort----------------");
			InsertionSort.insertionSort(arr);
			break;
		default:
			System.out.println("wrong input");
			break;
		}

	}

}
