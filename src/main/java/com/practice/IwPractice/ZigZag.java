package com.practice.IwPractice;

public class ZigZag {
	Node root = null;

	public void printNode(Node node) {

		if (node == null)
			return;

		System.out.println("Right " + node.right.data);
		System.out.println("Left " + node.left.data);
		
		if(node.right != null && node != null)
		getParent(node.right);
		if(node.left != null && node != null)
		getParent(node.left);
		
	}
	
	public void getParent(Node root) {
		Node parent = null;
		
		if(root != null) {
			
			if(root.left != null && root.right!= null) {
				parent = root;
			
			System.out.println("Right " + parent.right.data);
			System.out.println("Left " + parent.left.data);
			}
		}

	}

	public static void main(String[] args) {
		ZigZag tree = new ZigZag();
		tree.root = tree.new Node(3);
		tree.root.left = tree.new Node(1);
		tree.root.right = tree.new Node(9);
		tree.root.right.left = tree.new Node(5);
		tree.root.right.right = tree.new Node(12);

		Node target = tree.root.left;
		System.out.println("root " + tree.root.data);
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
