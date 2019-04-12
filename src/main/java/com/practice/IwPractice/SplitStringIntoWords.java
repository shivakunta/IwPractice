package com.practice.IwPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class SplitStringintoWords {

	Set<String> dict = null;

	public SplitStringintoWords(Set<String> dictionary) {
		this.dict = dictionary;
	}

	public Set<String> wordBreakHelper(String s, Set<String> dict, int start) {
		Set<String> out = new HashSet<String>();
		for (String a : dict) {
			int len = a.length();
			int end = start + len;

			if (s.length() < end) {
				continue;
			}
			System.out.println(s.substring(start, end));
			if (s.substring(start, end).equals(a)) {
				out.add(s);
				wordBreakHelper(s, dict, end);
			}
		}

		return out;
	}

	public static void main(String[] args) {
		Set<String> input = new LinkedHashSet<String>();
//		input.add("this");
//		input.add("is");
//		input.add("a");
//		input.add("test");
		input.add("leet");
		input.add("code");
		
		SplitStringintoWords test = new SplitStringintoWords(input);

		Set<String> result = test.wordBreakHelper("leetcode", input, 0);
		for (String a : result)
			System.out.println(a+" - ");
	}
}