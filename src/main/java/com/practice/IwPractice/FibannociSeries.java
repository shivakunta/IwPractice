
package com.practice.IwPractice;

import java.util.Arrays;

public class FibannociSeries {
	public int[] printFibanocci(int n) {
		int[] arr = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			if (i > 1) {
				arr[i] = arr[i - 1] + arr[i - 2];
			} else {
				arr[i] = i;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new FibannociSeries().printFibanocci(100);
		for (int i : arr) {
			System.out.print(i+", ");
		}
	}

}
