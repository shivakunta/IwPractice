package com.practice.IwPractice;

public class ZigZag {
	Node root = null;
	public void printNode(Node node) {
		
		if(node == null )
			return;
		
		
			System.out.print("Data " + node.data);
			System.out.println("");
			
	
		if(node.right != null)
		printNode(node.right);
		printNode(node.left);
	}



	public static void main(String[] args) {
		ZigZag tree = new ZigZag();
		tree.root = tree.new Node(3);
		tree.root.left = tree.new Node(1);
		tree.root.right = tree.new Node(9);
		tree.root.right.left = tree.new Node(5);
		tree.root.right.right = tree.new Node(12);
		

		Node target = tree.root.left;
		tree.printNode(tree.root);
	}

	public class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
}
