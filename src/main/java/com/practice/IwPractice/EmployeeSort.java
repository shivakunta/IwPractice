package com.practice.IwPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		/*
		 * if(e1.getEmpId() == e2.getEmpId()) { return 0;
		 * 
		 * }else if(e1.getEmpId() > e2.getEmpId()) { return -1; }else { return 1; }
		 */
		int val = 0;
		
		
		  if(e1.getEmpName().compareTo(e2.getEmpName()) == 0)
			  val = 0;
		  else if(e1.getEmpName().compareTo(e2.getEmpName()) < 0)
			  val = 1;
		  else
			  val = -1;
		return val;
		 
	//return e1.getEmpName().compareTo(e2.getEmpName());
	}
	public static void main(String[] args) {

		Employee e1 = new Employee("shiva kunta", 1201, "5103201999", "32156");
		Employee e2 = new Employee("abdul rahman", 1202, "4089934222", "89762");
		Employee e3 = new Employee("suresh kumar", 1203, "7032378585", "32448");
		Employee e4 = new Employee("bob simpson", 1204, "6462430987", "654334");
		Employee e5 = new Employee("vinisha shraddha", 1205, "5204536666", "987655");
		Employee e6 = new Employee("charls simpson", 1206, "8204356678", "32446");
		Employee e7 = new Employee("viv richards", 1207, "9987654332", "786554");
		Employee e8 = new Employee("donald", 1208, "3204567868", "55677");
		
		List<Employee> el = new ArrayList<Employee>();
		el.add(e1);
		el.add(e2);
		el.add(e3);
		el.add(e4);
		el.add(e5);
		el.add(e6);
		el.add(e7);
		el.add(e8);
		
		Collections.sort(el, new EmployeeSort());
		for(Employee e: el)
		System.out.println(e.getEmpName());
	}

}
