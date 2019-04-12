package com.practice.IwPractice;

import java.util.Scanner;

public class test {
	//static String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
	//static String[] alpha = { "1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10", "11", "12", "13", "14", "15", "16" };
	static String[] alpha = { "1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10", 
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"10",
			"1"};
	static int n = 9;
	public static String[][] getOutput(String[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i > j) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	public static void swap(String[][] arr, int i, int j) {
		String[][] temp = new String[1][1];
		temp[0][0] = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp[0][0];
	}

	public static void printArr(String[][] arr, String comment) {
		System.out.println(comment + " :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  [");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		String[][] arr = new String[n][n];
		String[][] output = new String[n][n];
		for (int i = 0, x = 0; i < alpha.length; i = i + n, x++) {
			for (int j = i, y = 0; j < i + n; j++, y++) {
				arr[x][y] = alpha[j];
			}
		}
		printArr(arr, "Before Swap");
		output = getOutput(arr);
		printArr(output, "After Swap");
	}

}
