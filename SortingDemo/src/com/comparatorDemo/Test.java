package com.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.velocity.ComparableDemo;

public class Test {
	  public static void main(String[] args) {
			List<Employee> list = new ArrayList();
			list.add(new Employee(10,"utkarsh",10000));
			list.add(new Employee(20,"vijay",50000));
			list.add(new Employee(30,"unmesh",3000));
			list.add(new Employee(40,"Amruta",20000));
			Collections.sort(list,new CompareSalary());
			System.out.println(list);
	  }

}
