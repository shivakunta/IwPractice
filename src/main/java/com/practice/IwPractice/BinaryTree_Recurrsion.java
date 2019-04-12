package com.practice.IwPractice;

public class BinaryTree_Recurrsion {
	Node root = null;
	public void printNode(Node node, int k) {
		
		if(node == null || k < 0)
			return;
		
		if (k == 0) {
			System.out.print("Data " + node.data);
			System.out.println("");
			return;
		}

	
		
		printNode(node.left, k-1);
		printNode(node.right, k-1);
	}

	public int findTarget(Node node, Node target, int k) {
		if (node == null)
			return -1;

		if (node == target) {
			printNode(node, k);
			return 0;
		}
		int dl = findTarget(node.left, target, k);

		if (dl != -1) {

			if (dl + 1 == k) {
				System.out.println("" + node.data);
			} else {
				printNode(node.right, k - dl - 2);
			}
			return 1 + dl;
		}

		int dr = findTarget(node.right, target, k);
		if (dl != -1) {

			if (dr + 1 == k) {
				System.out.println("" + node.data);
			} else {
				printNode(node.left, k - dr - 2);
			}
			return 1 + dr;
		}
		return -1;
	}

	public static void main(String[] args) {
		BinaryTree_Recurrsion tree = new BinaryTree_Recurrsion();
		tree.root = tree.new Node(20);
		tree.root.left = tree.new Node(8);
		tree.root.right = tree.new Node(22);
		tree.root.right.left = tree.new Node(21);
		tree.root.right.right = tree.new Node(23);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(12);
		tree.root.left.right.left = tree.new Node(10);
		tree.root.left.right.right = tree.new Node(14);

		Node target = tree.root.left;
		tree.findTarget(tree.root, target, 3);
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
