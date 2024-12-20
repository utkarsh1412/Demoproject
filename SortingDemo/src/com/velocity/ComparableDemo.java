package com.velocity;

public class ComparableDemo implements Comparable<ComparableDemo>{
           int id;
           String name;
           float salary;
           public ComparableDemo(int id,String name,float salary) {
        	   super();
        	   this.id=id;
        	   this.name=name;
        	   this.salary=salary;
           }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public  int compareTo(ComparableDemo comparableDemo) {
			if(comparableDemo.salary== salary)
				return 0;
			else if(comparableDemo.salary< salary)
				return 1;
			else
				return -1;
			
		}
		@Override
		public String toString() {
			return "ComparableDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
           
}
