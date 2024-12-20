package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class Allmatch {
           public static void main(String[] args) {
        	List<String> list = new ArrayList<String>();
       		list.add("Unmesh");
       		list.add("Utkarsh");
       		list.add("Ram");
       		list.add("Sumit");
       		list.add("Pavan");
       		System.out.println(list.stream().allMatch(P->P.startsWith("U")));
       		System.out.println(list.stream().anyMatch(s->s.startsWith("U")));
       		System.out.println(list.stream().noneMatch(k->k.startsWith("U")));
       		
		}
}
