package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SkipLimitDemo {
             public static void main(String[] args) {
            	 List<Integer> list = new ArrayList<Integer>();
            		list.add(80);
            		list.add(60);
            		list.add(90);
            		list.add(40);
            		list.add(10);
            		list.stream().limit(4).skip(2).forEach(p->System.out.println(p));
            	
			}
}
