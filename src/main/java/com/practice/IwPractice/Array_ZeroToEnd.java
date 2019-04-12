
package com.practice.IwPractice;

/**
 * Given an array with some numbers [1,3,0,4,0,6,0,7,9] move all the 0s towards
 * the end of the Array. The other numbers should maintain their positions such
 * that the output should be [1,3,4,6,7,9,0,0,0]
 **/
public class Array_ZeroToEnd {

	public static void main(String[] args) {
		int[] a = { 1, 3, 0, 4, 0, 6, 0, 7, 9 };
		int[] out = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				out[j++] = a[i];
			} else {
				continue;
			}

		}

		for (int i : out)
			System.out.print("["+i+"]");
	}

}
