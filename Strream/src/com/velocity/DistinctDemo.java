package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class DistinctDemo {
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
	list.stream().distinct().forEach(k->System.out.println(k));
}
}
