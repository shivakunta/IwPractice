package com.practice.IwPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * There is dictionary with words like this ["this", "is", "a", "test"] or it
 * could be ["thi", "sis", "at", "est"] Input String is "thisisatest" (Note:
 * there is no space between the words, it is just one string). Check if the
 * input string is constructed with the words from the dictionary.
 **/
public class String_WordChecker_Dictionary {
	Map<Integer, String> m = new HashMap<Integer, String>();
	int k = 0;

	public Map<Integer, String> check_for_word(String word, int ind, int k) {
		//String clone = new String(word);
		try {
			BufferedReader in = new BufferedReader(new FileReader("/usr/share/dict/words"));
			// Integer k = 0;
			// int ind = 0;
			String w = "";
			for (int j = ind; j <= word.length(); j++) {
				if (ind < j) {
					w = word.substring(ind, j);
					String str;
					int previous = 0;
					// System.out.println(" *** "+in.readLine());
					while ((str = in.readLine()) != null) {
						if (str.equals(w)) {
							m.put(k, w);
							previous = w.length();
							if (word.length() > previous && w.length() <= word.length()) {
								break;
							}
						}
						// System.out.println(" m >> "+m);

					}

				}
				// System.out.println(" w >> "+w+" length"+w.length()+ " clone length "
				// +clone.length());
			 //if(in.readLine() == null)
				in = new BufferedReader(new FileReader("/usr/share/dict/words"));
				if (w.length() == word.length()) {
					word = word.replaceAll(m.get(k), "");
					// k++;
					check_for_word(word, k++, k++);
				}
			}

			in.close();
		} catch (IOException e) {
		}
		return m;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> m = (HashMap<Integer, String>) new String_WordChecker_Dictionary()
				.check_for_word("thisisatest", 0, 0);
		Iterator<String> val = m.values().iterator();
		while (val.hasNext()) {
			System.out.println(" [ " + val.next() + " ] ");
		}
	}
}