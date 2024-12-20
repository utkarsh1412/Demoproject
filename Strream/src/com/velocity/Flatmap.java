package com.velocity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
       public static void main(String[] args) {
    	    List<List<Integer>> list = new ArrayList<>();
    		list.add(Arrays.asList(10,20));
    		list.add(Arrays.asList(20,30));
    		list.add(Arrays.asList(30,40));
    		list.add(Arrays.asList(40,50));
    		list.add(Arrays.asList(50,60));
    		list.add(Arrays.asList(60,70));
    		List<Integer> out = list.stream().flatMap(l->l.stream()).collect(Collectors.toList());
    		System.out.println(out);
	}
}
