package com.practice.IwPractice;

/**
 * Given a binary tree, a target node in the binary tree, and an integer value
 * k
 * print all the nodes that are at distance k from the given target node. No
 * parent pointers are available. input: target = pointer to node with data 8.
 * root = pointer to node with data 20. k = 2. Output : 10 14 22
 * 
 * If target is 14 and k is 3, then output should be “4 20”
 **/
public class BinaryTree {

	static Node root = null;

	public void getTarget(Node n, int k, int target) {
		Node m = null;
		Node t = null;

		if (n.data == target) {
			m = n;
		} else {
			while (t == null || (t.left != null || t.right != null)) {
				if (t == null) {
					t = n;
				}
				t = findTarget(t, target);
				if (t.data == target) {
					m = t;
					break;
				}
			}
		}
		checkNode(m, k);
		checkRoot(root, m, k);
	}

	public Node findTarget(Node n, int target) {
		String check = "";
		if ((n.left != null && !endNode(n.left, 0)) || (n.left.data == target)) {
			check = "left";
		}

		if ((n.right != null && !endNode(n.right, 0)) || (n.right.data == target)) {
			check = "right";
		}

		if (check.equals("left")) {
			n = n.left;
		} else if (check.equals("right")) {
			n = n.right;
		}

		return n;
	}

	public void print(Node target, int k) {

		if (k == 0) {
			System.out.println(" node at distance is : " + target.data);
		} else {
			if (target != null && (target.left != null || target.right != null))
				checkNode(target, k);
		}

	}

	public void checkRoot(Node root, Node target, int k) {
		if (root.left != null && (root.left.data == target.data)) {
			--k;
			checkNode(root.right, k);
		} else if (root.right != null && (root.right.data == target.data)) {
			--k;
			checkNode(root.left, k);
		}
	}

	public void checkNode(Node m, int k) {
		Node pNode = null;

		if (!endNode(m.left, k))
			pNode = m.left;
		else if (!endNode(m.right, k))
			pNode = m.right;
		else {

			if (m.left != null && m.right != null) {
				--k;
				print(m.left, k);
				print(m.right, k);
			} else if (m.left != null) {
				pNode = m.left;
				print(pNode, --k);
			} else if (m.right != null) {
				pNode = m.right;
				print(pNode, --k);
			} else {
				print(m, --k);
			}

		}

		print(pNode, --k);
	}

	public boolean endNode(Node n, int k) {
		boolean isEnd = false;
		if (n == null || (n.left == null && n.right == null)) {
			isEnd = true;
			k--;
		}

		return isEnd;
	}

	public static void main(String[] args) {
		int data = 20;
		root = new BinaryTree().new Node(data);
		Node node = root;
		node.left = new BinaryTree().new Node(8);
		node.right = new BinaryTree().new Node(22);
		node.left.left = new BinaryTree().new Node(4);
		node.left.right = new BinaryTree().new Node(12);
		node.left.right.left = new BinaryTree().new Node(10);
		node.left.right.right = new BinaryTree().new Node(14);

		new BinaryTree().getTarget(root, 3, 14);

	}

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}
}
