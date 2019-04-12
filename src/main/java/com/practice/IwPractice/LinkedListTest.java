package com.practice.IwPractice;

public class LinkedListTest {

	public static void main(String[] args) {
			

		LinkedList out = new LinkedList();
		LinkedList l1 = new LinkedList();
		l1.add(2);
		l1.add(6);
		l1.add(3);
		LinkedList l2 = new LinkedList();
		l2.add(5);
		l2.add(17);
		l2.add(4);
		int rem = 0;
		int mod = 0;
		int sum = 0;
		for (int i = 1; i <= l1.length(); i++) {
			sum = l1.get(i) + l2.get(i);
			mod = sum % 10;
			if (mod == sum) {
				out.add(sum + rem);
			} else {
				rem = sum / 10;
				out.add(sum % 10);
			}

		}
		
		System.out.println(l2);
		System.out.println(l1);
		System.out.println(out);
	}

}
