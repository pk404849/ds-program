package com.org.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5, 7, 8, 9, 10, 11, 18);

		Integer max = list.stream().filter(f -> f % 2 == 0).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

		List<Integer> sortedListDesc = list.stream().sorted((o1, o2) -> o1 < o2 ? 1 : o1 > 2 ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(sortedListDesc);
		List<Integer> sortedListAsc = list.stream().sorted((o1, o2) -> o1 < o2 ? -1 : o1 > 2 ? 1 : 0)
				.collect(Collectors.toList());
		System.out.println(sortedListAsc);
	}

}
