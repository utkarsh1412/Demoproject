package com.comparatorDemo;

import java.util.Comparator;

public class CompareName implements Comparator<Employee> {
	  public int compare(Employee emp1, Employee emp2) {
		  return emp1.name.compareTo(emp2.name);
	  }

}
