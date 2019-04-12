package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/**
 * Given a string, a partitioning of the string is a palindrome partitioning if
 * every substring of the partition is a palindrome. For example,
 * “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”.
 * Determine the fewest cuts needed for palindrome partitioning of a given
 * string. For example, minimum 3 cuts are needed for “ababbbabbababa”. The
 * three cuts are “a|babbbab|b|ababa”. If a string is palindrome, then minimum 0
 * cuts are needed. If a string of length n containing all different characters,
 * then minimum n-1 cuts are needed
 **/
public class String_Palindrome_Partitioning {
	int index = 0, ind = 0;
	boolean isRepeat = false;
	Integer key = 1;
	Map<Integer, String> palindrome = new HashMap<Integer, String>();

	public Map<Integer, String> partition(StringBuilder input, int start, int end) {
		List<String> arr = new ArrayList<String>();

		Map<Integer, String> output = new HashMap<Integer, String>();

		for (int i = index; i <= input.length(); i++) {
			// System.out.print(" ( *** "+input.substring(index, i)+" *** )");
			if (index != i && (input.substring(index, i)
					.equals((new StringBuilder(input.substring(index, i)).reverse().toString())))) {
				if (isRepeat && input.substring(index, i).length() >= palindrome.get(index).length())
					break;
				palindrome.put(index, input.substring(index, i));
				ind = i;
			}
		}
		isRepeat = false;
		if (palindrome.get(index).length() > 1 && !checkDuplicate(palindrome.get(index))) {
			isRepeat = true;
			palindrome.remove(index);
			ind = (palindrome.keySet().stream().findFirst().get());
			key = ind;

		} else {
			key = ind;
		}
		index = ind;

		if (index < input.length())
			partition(input, index, input.length() - 1);
		return palindrome;
	}

	/**
	 * if the String cotains of same characters then it cannot be considered as
	 * palindrome
	 **/
	public boolean checkDuplicate(String s) {
		boolean isSame = false;
		Set<Boolean> b = new HashSet<Boolean>();
		for (int i = 0; i < s.length(); i++) {
			if (Pattern.compile("[" + s.charAt(0) + "]").matcher(Character.toString(s.charAt(i))).matches()) {
				b.add(true);
			} else {
				b.add(false);
			}
		}

		return b.contains(false);
	}

	public static void main(String[] args) {
		//StringBuilder input = new StringBuilder("ababbbabbababa");
		StringBuilder input = new StringBuilder("ababaa");
		Map<Integer, String> out = new String_Palindrome_Partitioning().partition(input, 0, input.length() - 1);
		Iterator<Entry<Integer, String>> m = out.entrySet().iterator();
		while (m.hasNext()) {
			Entry<Integer, String> ent = m.next();
			System.out.println("[" + ent.getValue() + "]");
		}
	}

}
