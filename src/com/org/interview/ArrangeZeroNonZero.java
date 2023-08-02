package com.org.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeZeroNonZero {

	public static void main(String[] args) {
		List<Integer>  list  =Arrays.asList(10,23,0,4,5,0,34,0,0);
		//output- 10,23,4,5,34,0,0,0,0
		ArrayList<Integer> newList = new ArrayList<>();
		int ctr=0;
		for(Integer value: list) {
			if(value !=0) {
				newList.add(value);
			}else {
				ctr++;
			}
		}

		while(ctr-->=0) {
			newList.add(0);
		}
		System.out.println(newList);
		
		
		List <String> list1 = Arrays.asList("welcome");

		//output- come
		for(String s:list1) {
			String value = s.substring(3,7);
			System.out.println(value);
		}
		
		List<Integer> list2 = Arrays.asList(10,20,30,62,58);
		System.out.println(list2);
		List<Integer> list3 = list2.stream().limit(3).collect(Collectors.toList());
		System.out.println(list3);
		//62, 58, 30,20,10
		
		List<Integer> reverseList = list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseList);
		List<Integer> skipList = list2.stream().sorted(Collections.reverseOrder()).skip(2).collect(Collectors.toList());
		System.out.println(skipList);
		System.out.println(skipList.get(0));
		Integer thirdMax = list2.stream().sorted(Collections.reverseOrder()).skip(2).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(thirdMax);
	}
	
	

}
