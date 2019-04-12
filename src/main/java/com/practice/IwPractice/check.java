package com.practice.IwPractice;

public class check {

	public static void main(String[] args) {
		String str = "abAB0";
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			System.out.println(Character.getNumericValue(c));
			System.out.println((c-'0')+ " <<>> " +Character.getNumericValue(c-'0'));
		}

	}

}
