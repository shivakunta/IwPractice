package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintPhoneDigits {

	public void possibleWords(int[] num, HashMap<Integer, List> phoneMap) {
		ArrayList<List<String>> s = new ArrayList<List<String>>();
		// ArrayList<String> flatten = new ArrayList<String>();
		for (int i = 0; i < num.length; i++) {

			s.add(phoneMap.get(num[i]));

		}
		System.out.println(s+"\n");
		/*
		 * for (String[] array : s) { Arrays.stream(array).forEach(flatten::add); }
		 * System.out.println(" get " + flatten);
		 */

		/*
		 * int fact = getFactorial(flatten.size()); System.out.println("factorial >>> "
		 * + fact);
		 */

		for (String c : s.get(0)) {
			for (int j = 0; j < s.get(1).size(); j++) {
				System.err.print(s.get(1).get(j) + c+" ");
			}
		}
	}
    
	/** get factorial **/
	public int getFactorial(int n) {
		if (n > 1)
			n *= getFactorial(n - 1);
		return n;
	}

	public static void main(String[] args) {
		HashMap<Integer, List> phoneMap = new HashMap<Integer, List>();
		phoneMap.put(1, Arrays.asList(new String[] { "a", "b", "c" }));
		phoneMap.put(2, Arrays.asList(new String[] { "d", "e", "f" }));
		phoneMap.put(3, Arrays.asList(new String[] { "g", "h", "i" }));
		phoneMap.put(4, Arrays.asList(new String[] { "j", "k", "l" }));
		phoneMap.put(5, Arrays.asList(new String[] { "m", "n", "o" }));
		phoneMap.put(6, Arrays.asList(new String[] { "p", "q", "r" }));
		phoneMap.put(7, Arrays.asList(new String[] { "s", "t", "u" }));
		phoneMap.put(8, Arrays.asList(new String[] { "v", "w", "x" }));
		phoneMap.put(9, Arrays.asList(new String[] { "y", "z" }));

		new PrintPhoneDigits().possibleWords(new int[] {  3, 4 }, phoneMap);
	}

}
