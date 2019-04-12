package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Given an array of numbers, arrange them in a way that yields the largest
 * value. For example, if the given numbers are {54, 546, 548, 60}, the
 * arrangement 6054854654 gives the largest value. And if the given numbers are
 * {1, 34, 3, 98, 9, 76, 45, 4}, then the arrangement 998764543431 gives the
 * largest value
 **/
public class NumberArrange_To_Get_BiggestNumber {
	static int val = 0;

	public static void getNumber(ArrayList arr) {
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String x, String y) {
				String XY = x + y;
				String YX = y + x;
				val = XY.compareTo(YX) > 0 ? -1 : 1;
				System.out.println("XY - " + XY + "  -  YX - " + YX + " - val *** " + val + " - " );
				return val;
			}
		});
		Iterator<String> it = arr.iterator();
		while (it.hasNext())
			System.out.print("," + it.next());
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("97");
		al.add("78");
		al.add("64");
		al.add("83");
		al.add("875");
		al.add("9");
		al.add("1");
		getNumber(al);

	}

}
