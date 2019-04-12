package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Given a number ‘n’ find the total number of binary string of length ‘n’ such
 * that there should be at least one pair of consecutive 1s in a string.
 * Example: for n = 5, 10011, 11101, 11111 are valid and 10101, 10001 are
 * invalid.
 **/
public class Amazon_BinaryStrings {
	String one = "1";
	String zero = "0";
	int count = 0;

	public int printBinaryStrings(int n) {
		String input = "";
		List<String> al = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			input = input.concat(one);
		}

		int value = Integer.parseInt(input, 2);
		/**
		 * Integer.parseInt(input,2) will convert the binary to int and
		 * Integer.toBinaryString will convert the int to binary string format
		 **/
		for (int i = 0; i <= value; i++) {
			al.add(Integer.toBinaryString((Integer.parseInt(input, 2) - i)));
		}
		/*
		 * System.out.println(" input " + (Integer.parseInt(input, 2) - 10) + " -- " +
		 * Integer.toBinaryString((Integer.parseInt(input, 2) - 10)));
		 * System.out.println(" i " + Integer.parseInt(input, 2));
		 */

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).length() == n) {
				if (findConsecutiveOne(al.get(i))) {
					count++;
				}
			}

		}
		return count;
	}

	/**
	 * --> checks for 2 or more consecutive 1s in the given String using the
	 * lookingAt() function which is part of Pattern class; returns true if there is
	 * just two or more consecutive 1s Ex:11110 is true {But Matches() function will
	 * not work as it will be true if entire string contains 1 otherwise false Ex:
	 * 1111 will be true but 11110 is false}
	 **/
	public boolean findConsecutiveOne(String n) {
		String s = "";
		boolean isConsecutive = false;
		/*
		 * for (String i : n) { s = i;
		 */
		s = n;
		// System.out.println(s + " - " +
		// Pattern.compile("[10]*[1]{2,}").matcher(s).lookingAt());
		if (Pattern.compile("[10]*[1]{2,}").matcher(s).lookingAt()) {
			isConsecutive = true;
		}

		return isConsecutive;
	}

	public static void main(String[] args) {
		int value = new Amazon_BinaryStrings().printBinaryStrings(10);
		System.out.println(" number of binary Strings " + value);
	}
}
