package com.practice.IwPractice;

public class Tree_BinarySearch {
	int ind = -1;
	public int findNumber(int[] barr, int s, int e, int val) {
		int mid = (s+e)/2;
		
		if(barr[mid]  == val)
			ind = mid;
		else if(barr[mid]  > val) {
			mid = ((s)+mid)/2;
			if(mid > 1)
			findNumber(barr, s+1, mid, val);
		}else {
			mid = (mid+e)/2;
			if(mid < e)
			findNumber(barr, mid+1, e, val);
		}

	  return ind;
	}

	public static void main(String[] args) {
		int[] barr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int start = 0;
		int end = barr.length - 1;
		int i = new Tree_BinarySearch().findNumber(barr, start, end, 100);
		if(i == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index : "+i);
		}
		
	}

}
