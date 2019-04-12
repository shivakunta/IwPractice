package com.practice.IwPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Given an array of numbers, arrange them in a way that yields the largest
 * value. For example, if the given numbers are {54, 546, 548, 60}, the
 * arrangement 6054854654 gives the largest value. And if the given numbers are
 * {1, 34, 3, 98, 9, 76, 45, 4}, then the arrangement 998764543431 gives the
 * largest value
 **/
public class NumberArrange_To_Get_BiggestNumber_V2 {
	static int val = 0;
	public static void main(String[] args) {
		String arr[] = { "1", "34", "3", "98", "9", "76", "45", "4" };
		String s = "";
		String s1 = "";
		String large = "";
		
		Collections.sort(Arrays.asList(arr), new Comparator<String>() {
		
			public int compare(String s1, String s2) {
				String XY = s1+s2;
				String YX = s2+s1;
				 val = XY.compareTo(YX)>0?-1:1;
				 
				 return val;
			}
			
			
		});
		Iterator<String> itr = Arrays.asList(arr).iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
/*		for (int i = 0; i <= arr.length - 1; i++) {
			if (i + 1 <= arr.length - 1) {
				if (large.equals("")) {
					large = String.valueOf(arr[i]);
				}
				s = String.valueOf(large) + String.valueOf(arr[i + 1]);
				s1 = String.valueOf(arr[i + 1]) + String.valueOf(large);
				System.out.println(s + " " + s1);
				if (Integer.parseInt(s1) > Integer.parseInt(s)) {
					large = s1;
				} else {
					large = s;
				}
			}
		}*/
	}

}
