package com.practice.IwPractice;

import java.util.Arrays;

public class String_Permutations_Alphabets {
	static int value = 0;

	public void printAlphabet(char[] input, int s, int e) {
		 
		/*
		 * for (int i = 0; i <= input.length - 1; i++) { for (int j = 0; j <=
		 * input.length - 1; j++) if (i != j) {
		 */
		if (s == e) {
			System.err.println(Arrays.toString(input));
		} else {		// printAlphabet(input, s, e--);
			
	 
				for (int i = s; i <= e; i++) {
			swap(input, s, i);
			printAlphabet(input, s+1, e);

			swap(input, s, i);
				}
		}
		

		/*
		 * } }
		 */
	}

	public int getFactorial(int n) {
		if (n > 1)
			n *= getFactorial(n - 1);
		return n;
	}

	public void swap(char[] input, int i, int j) {
		char temp = 0;
		temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public static void main(String[] args) {
		String s = "ABCD";
		value = new String_Permutations_Alphabets().getFactorial(s.length());
		int start = 0;
		int end = s.length()-1;
		new String_Permutations_Alphabets().printAlphabet(s.toCharArray(), start, end);
	}

}
