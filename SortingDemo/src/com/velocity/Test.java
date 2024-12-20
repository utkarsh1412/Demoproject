package com.velocity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
            public static void main(String[] args) {
				List<ComparableDemo> list = new ArrayList();
				list.add(new ComparableDemo(10,"utkarsh",10000));
				list.add(new ComparableDemo(20,"vijay",50000));
				list.add(new ComparableDemo(30,"unmesh",3000));
				list.add(new ComparableDemo(40,"Amruta",20000));
				Collections.sort(list);
				System.out.println(list);
			}
}
