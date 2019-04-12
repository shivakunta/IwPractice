package com.practice.IwPractice;

import java.util.Arrays;

/***
 * Given below two Arrays which are sorted ascending, find the difference between the elements 
 * from both the Arrays [A-B] and return the minimum difference between all the elements 
 * in both the arrays, while iterating which ever element is less in [A-B] replace the element 
 * with the next element in the same array. Stop Iteration when ever we reach the end of 
 * any of the Array
	int[] A = { 1, 3, 5, 9, 14 };
	int[] B = { 7, 10, 12, 15, 20,21};
	7-1 = 6
	7-3 = 4
	7-5 = 2
	9-7 = 2
	10-9 = 1
	14-10 = 4
	14-12 = 2
	15-14 = 1
***/

public class Array_MinDifference_of_TwoArrayElements_V2 {

	public int findMinDifference(int[] a, int[] b) {

		int sizeA = a.length;
		int sizeB = b.length;
		System.out.println("A: " + Arrays.toString(a));
		System.out.println("B: " + Arrays.toString(b));
		int arrLen = 0;
		if (sizeA <= sizeB)
			arrLen = sizeA;
		else
			arrLen = sizeB;
		int i = 0, j = 0;
		int min = 99999999;
		int val = 0;
		while (i < sizeA && j < sizeB) {
			if (a[i] > b[j]) {
				 val = a[i] - b[j++];
				System.out.println(" val 111 : " + val);
				if (val < min) {

					min = val;
					System.out.println(" min 111 : " + min);
				}
				arrLen--;

			} else {
				val = b[j] - a[i++];
				System.out.println(" val 222 : " + val);
				if (val < min) {

					min = val;
					System.out.println(" min 222 : " + min);
				}
				arrLen--;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 9, 10 };
		int[] B = { 7, 10, 12, 15, 20, 21 };

		int val = new Array_MinDifference_of_TwoArrayElements_V2().findMinDifference(A, B);
		System.out.println("Minimum Difference is : "+val);
	}

}
