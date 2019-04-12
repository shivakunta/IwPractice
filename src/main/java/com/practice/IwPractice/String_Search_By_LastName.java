package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class String_Search_By_LastName {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Map<String, Integer> getNames(List<Person> arr) {

		Collections.sort(arr);
		System.out.println("" + arr);
		String lastName = "";
		Map<String, Integer> nameSet = new ConcurrentHashMap<String, Integer>();
		ListIterator<Person> itr = arr.listIterator();
		while (itr.hasNext()) {
			Person p = itr.next();
			if (nameSet.containsKey(p.getLastName())) {
				if (nameSet.get(p.getLastName()) >= 1) {
					nameSet.put(p.getLastName(), nameSet.get(p.getLastName()) + 1);
				}

				if (nameSet.get(p.getLastName()) > 2) {
					nameSet.remove(p.getLastName());
				}
			} else {
				int count = 0;
				if (nameSet.containsValue(1))
					if (nameSet.get(lastName) != null) {
						System.out.println(" Remove : " + lastName);
						nameSet.remove(lastName);
					}

				nameSet.put(p.getLastName(), ++count);
				lastName = p.getLastName();
			}
		}
		if (nameSet.containsValue(1))
			if (nameSet.get(lastName) != null) {
				System.out.println(" Remove : " + lastName);
				nameSet.remove(lastName);
			}
		return nameSet;
	}

	public static void main(String[] args) {
		Person p1 = new String_Search_By_LastName().new Person("shiva", "kunta");
		Person p2 = new String_Search_By_LastName().new Person("arush", "kunta");
		Person p3 = new String_Search_By_LastName().new Person("vinisha", "kunta");
		Person p4 = new String_Search_By_LastName().new Person("ravi", "lingala");
		Person p5 = new String_Search_By_LastName().new Person("venkat", "lingala");
		Person p6 = new String_Search_By_LastName().new Person("ramesh", "turlapati");
		Person p7 = new String_Search_By_LastName().new Person("john", "mayers");
		Person p8 = new String_Search_By_LastName().new Person("charls", "mayers");
		Person p9 = new String_Search_By_LastName().new Person("ramana", "turlapati");
		Person p10 = new String_Search_By_LastName().new Person("vihan", "ahmed");
		Person p11 = new String_Search_By_LastName().new Person("kevin", "peterson");
		Person p12 = new String_Search_By_LastName().new Person("tushar", "ahmed");
		 Person p13 = new String_Search_By_LastName().new Person("andy", "peterson");
		List<Person> arr = new LinkedList<Person>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		arr.add(p6);
		arr.add(p7);
		arr.add(p8);
		arr.add(p9);
		arr.add(p10);
		arr.add(p11);
		arr.add(p12);
		 arr.add(p13);

		Map<String, Integer> out = new String_Search_By_LastName().getNames(arr);
		Set<Entry<String, Integer>> entry = out.entrySet();
		Iterator<Entry<String, Integer>> itr = entry.iterator();
		while (itr.hasNext()) {

			Entry<String, Integer> e = itr.next();

			System.err.println(e.getKey());
		}
	}

	public class Person implements Comparable<Person> {

		private String firstName;
		private String lastName;

		@Override
		public String toString() {
			return String.format(firstName + " " + lastName);
		}

		public int compareTo(Person p2) {
			return this.getLastName().compareTo(p2.getLastName());
		}

		public Person(String firstName, String lastName) {
			this.setFirstName(firstName);
			this.setLastName(lastName);
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
}
