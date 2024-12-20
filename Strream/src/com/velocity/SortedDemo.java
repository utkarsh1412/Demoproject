package com.velocity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedDemo {
       public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
   		list.add(80);
   		list.add(60);
   		list.add(90);
   		list.add(40);
   		list.add(10);
   		List<Integer> out = list.stream().sorted().collect(Collectors.toList());
   		System.out.println("Assending order is>>>" + out);
   		List<Integer> dec = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
   		System.out.println("Decending order is>>>" + dec);
	}
}
