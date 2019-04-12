package com.practice.IwPractice;
public class ReverseInteger {

	public static void main(String[] args) {

		Integer n = 123;
		int v = 0 , i=0;
		Integer temp = n, f = 100;
		int[] rev = new int[n.toString().length()];
		while(n%10 != 0) {
			temp = n;
			n = n%10 ;
			rev[i++] = n;
			v+=(n*f);
			n = temp/10;
			f = f/10;
		}
		for(int in : rev) {
		System.out.print(in);
		}
	}

}
