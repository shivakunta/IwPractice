package com.practice.IwPractice;

public class BinaryTree_PrintNodesAtDistance {

	public void printNode(int[] bt, int height) {
		int nodes = ((2 << height)+1)/2;
		int current = 0;
		for(int i=0 ; i <= bt.length; i++) {
			if(i >= nodes) {
				
				System.out.print(" [ "+bt[i-1]+" ]");
				if(i <= bt.length-1 && (i+1)/2 == (nodes))
					break;
			}
			
		}
			
		System.out.println();
	}
	public static void main(String[] args) {
		int[] bt = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15, 16, 17, 18 ,19, 20, 21, 22, 23,24, 25, 26, 27, 28 ,29, 30, 31};
		
		new BinaryTree_PrintNodesAtDistance().printNode(bt, 4);
	}

}
