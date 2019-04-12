package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 * There is dictionary with words like this ["this", "is", "a", "test"] or it
 * could be ["thi", "sis", "at", "est"] Input String is "thisisatest" (Note:
 * there is no space between the words, it is just one string). Check if the
 * input string is constructed with the words from the dictionary.
 **/
public class String_WordChecker_DictionarySet {
	Set<String> dictionary = null;

	public String_WordChecker_DictionarySet(Set<String> dictionary) {
		this.dictionary = dictionary;
	}

	public List<String> isDictionaryWord(String s, Set<String> dict, int ind) {
        
		List<String> words = new ArrayList<String>();
		String sub = "";
		for (String d : dict) {
			
			for (int i = 0; i <= s.length(); i++) {
				if (i > ind) {
					if (sub.length() >= 1 && !d.contains(sub)) {
						ind++;
					}
					sub = s.substring(ind, i);

					if (sub.length() > d.length()) {
						
						break;
					}
						

					if (d.equals(sub)) {
						s = s.replaceAll(sub, "");
						words.add(sub);
						ind = 0; sub = "";
						if (s.length() <= 0)
							continue;
						else
							break;
						
					}
					else{
					ind = 0;
					sub = ""; 
					}
				}
			}
		}

		return words;
	}

	public static void main(String[] args) {
		Set<String> dictionary = new LinkedHashSet<String>();
		
		/*
		 * dictionary.add("this"); dictionary.add("is"); dictionary.add("a");
		 * dictionary.add("test");
		 */		 
		
		  dictionary.add("world"); dictionary.add("hello");
		 
		 
		/*
		 * System.out.println( new
		 * String_WordChecker_DictionarySet(dictionary).isDictionaryWord("thisistest",
		 * dictionary, 0));
		 */
		System.out.println(
				new String_WordChecker_DictionarySet(dictionary).isDictionaryWord("helloworld", dictionary, 0));
	
	}

}
