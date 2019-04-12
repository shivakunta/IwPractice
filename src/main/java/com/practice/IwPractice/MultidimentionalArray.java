package com.practice.IwPractice;

public class MultidimentionalArray {

	public void rotate(int[][] arr) {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (i > j) {
					swap(arr, i, j);
				}
			}
		}
		new MultidimentionalArray().print(arr);
	}

	public void swap(int arr[][], int i, int j) {
			int temp = 0;
			temp = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = temp;
	}
	
	public void print(int arr[][]) {
		for (int i = 0; i <= 2; i++) {
			System.out.print("[");
			for (int j = 0; j <= 2; j++) {
				System.out.print(arr[i][j]);
				if (j < 2)
					System.out.print(",");
			}
			System.out.print("]\n");
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Before Rotate : ");
		new MultidimentionalArray().print(arr);
		System.out.println("After Rotate : ");
		new MultidimentionalArray().rotate(arr);
	}
}
