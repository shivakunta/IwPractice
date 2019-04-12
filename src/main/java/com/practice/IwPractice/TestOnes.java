package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class TestOnes {

	public static void main(String[] args) {
		
		if (Pattern.compile("([10]*[1]{2,})").matcher("100011").lookingAt()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
