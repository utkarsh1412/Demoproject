package com.velocity;


import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Unmesh");
		list.add("Utkarsh");
		list.add("Ram");
		list.add("Sumit");
		list.add("Pavan");
		list.stream().filter(p->p.startsWith("U")).forEach(s->System.out.println(s));
		
	}

}
