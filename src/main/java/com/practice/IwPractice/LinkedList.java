package com.practice.IwPractice;

public class LinkedList {

	Node head;
	int size = 0;
	String out = "";
	
	public LinkedList(){
		empty();
	}
	
	public Node add(int data) {
		Node current = null;
		if (head == null) {
			head = new Node(data);
			size++;
			return head;
		} else {
			current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
			size++;
		}

		return current;
	}

	public void delete(int data) {
		Node current = null;
		if (head == null) {
			return;
		} else {
			current = head;
			if (current.data == data) {
				current = current.next;
				--size;
			}
			while (current.next != null) {
				if (current.next.data == data) {
					current.next = current.next.next;
					--size;
				} else {
					current = current.next;
				}
			}
		}
	}
	public void empty() {
		Node current = null;
		if (head == null) {
			return;

		} else {
			current = head;
			current = null;
		}
	}
	public int get(int index) {
		Node current = null;
		int data = -1;
		if (head == null) {
			return -1;
		} else {
			current = head;
			if (index == 0)
				return current.data;
			int lenght = size;
			for (int i = 1; i <= size; ++i) {
				if (index == i) {
					data = current.data;
					break;
				} else {
					current = current.next;
				}
			}

		}

		return data;
	}

	public int length() {
		Node current = null;
		size = 0;
		if (head == null) {
			return -1;
		} else {
			current = head;
			++size;
			while (current.next != null) {
				current = current.next;
				++size;
			}
		}

		return size;
	}

	@Override
	public String toString() {

		for (int i = 1; i <= size; ++i)
			out += " [ " + get(i) + " ] ";

		return out;

	}

}
