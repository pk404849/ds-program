package com.org.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		int []input ={10,15,8,49,25,98,32 };
		List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
		List<String> newList = list.stream().map(k->k+"").filter(f->f.startsWith("1")).collect(Collectors.toList());
		System.out.println(newList);

		 Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		 System.out.println(max);
		 
		 List<Integer> list2 = list.stream().filter(o->String.valueOf(o).startsWith("1")).collect(Collectors.toList());
		 System.out.println(list2);
		 
		 
	}

}
