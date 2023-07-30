package com.org.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurranceOfEachWordUsingStream {

	public static void main(String[] args) {

		String[] arr = { "Sanjeev", "Prince", "Balak", "Sanjeev", "Ram", "Balak" };
		List<String> list = new ArrayList<String>();
		System.out.println("======= create list object with using any method ===========");
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		System.out.println("======= create list object using Arrays.asList() ===========");
		List<String> asList = Arrays.asList(arr);
		System.out.println(asList);
		System.out.println("========== count the word in the array or list ===============");
		long count = asList.stream().count();
		System.out.println(count);
		System.out.println("=========== occurance of each word in the list or array ===============");
		Map<String, Long> occrenceOfTheWord = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occrenceOfTheWord);
		System.out.println("================= find the duplicate word in the list or array ==============");
		List<String> findDuplicateWord = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() > 1L).map(m -> m.getKey()).collect(Collectors.toList());
		System.out.println(findDuplicateWord);
		System.out.println("=================== find the first none repeated word in the list or array ============");
		String findFirstNonRepitedWord = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1L).map(m -> m.getKey()).findFirst().get();
		System.out.println(findFirstNonRepitedWord);
	}

}
