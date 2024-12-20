package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByDemo {
 public static void main(String[] args) {
	 List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(90);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(60);
		list.add(20);
		System.out.println(list.stream().collect(Collectors.groupingBy(K->K,Collectors.counting())));
}
}
