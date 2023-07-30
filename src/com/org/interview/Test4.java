package com.org.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Test4 {

	public static void main(String[] args) {

		String s1 = "prince";
		StringBuffer sb1 = new StringBuffer("prince");
		System.out.println(s1.equals(sb1));
		String s2 = new String("prince");
		String s3 = new String("prince");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = list.stream().mapToInt(m->m).sum();
		System.out.println(sum);
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		System.out.println(min);
		OptionalDouble average = list.stream().mapToInt(m1->m1).average();
		System.out.println(average.getAsDouble());
	}

}
