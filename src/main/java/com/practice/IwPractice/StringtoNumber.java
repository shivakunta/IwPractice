package com.practice.IwPractice;

public class StringtoNumber {

	public static void main(String[] args) {

		String str = "12 test";
		char[] ch = null;
		int factor = 1, value = 0, number = 0;
		if (str.replaceAll(" ", "").charAt(0) == '-') {
			System.out.println(str.replace(" ", ""));
			ch = str.substring(1).toCharArray();
		} else {
			ch = str.replace(" ", "").toCharArray();
		}
		for (int i = ch.length - 1; i >= 0; i--) {
			if (Character.getNumericValue(ch[i] - '0') == -1) {
				value = (ch[i] - '0') * factor;
				number = value + number;
				factor *= 10;
			}
		}

		System.out.println(" \n " + number);

	}

}
