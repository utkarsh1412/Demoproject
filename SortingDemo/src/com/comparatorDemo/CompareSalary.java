package com.comparatorDemo;

import java.util.Comparator;

public class CompareSalary implements Comparator<Employee> {
          public int compare(Employee emp1,Employee emp2) {
        	  if (emp1.salary==emp2.salary)
        		  return 0;
        	  else if(emp1.salary > emp2.salary)
        		  return 1;
        	  else 
        		  return -1;
          }
}
