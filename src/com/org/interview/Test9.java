package com.org.interview;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

	public static void main(String[] args) {


		int arr[] = {1,3,4,9,5,7,8};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<Integer> max = list.stream().sorted((o1,o2)->o1<o2?1:o1>o2?-1:0).skip(1).limit(1).collect(Collectors.toList());
		System.out.println(max.get(0));
		
		IntSummaryStatistics summaryStatistics = list.stream().mapToInt(m->m).summaryStatistics();
		System.out.println(summaryStatistics);
		}

}
