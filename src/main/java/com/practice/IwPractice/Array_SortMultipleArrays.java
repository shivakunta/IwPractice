package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given N number of arrays with varying lengths and each of them alreay sorted
 * in ascending order, print the numbers from these arrays from the smallest to
 * biggest. For Example: Input, Arr1 = [4,7,10,11], Arr2 = [3,5], Arr3 =
 * [2,8,13]. Output should be: [2,3,4,5,7,10,11,13]
 **/
public class Array_SortMultipleArrays {

	public static void main(String[] args) {
		Integer[] Arr1 = { 4, 7, 10, 11 };
		Integer[] Arr2 = { 3, 5 };
		Integer[] Arr3 = { 2, 8, 13 };
		List<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(Arr1));
		al.addAll(Arrays.asList(Arr2));
		al.addAll(Arrays.asList(Arr3));
		System.out.println(al);
		Collections.sort(al);
		System.out.print(al);
	}

}
