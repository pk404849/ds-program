package com.org.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharacter {

	public static void printPrimeNumber(int number) {
		for(int i=2;i<=100;i++) {
			boolean flag = true;
			for(int j=2;j<=i/2;j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void checkNumberIsPrimeOrNot(int number) {
			boolean flag = false;
		for(int i=2;i<=number/2;i++) {
			if(number % i != 0) {
				flag= true;
			}else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("this number is prime number : "+number);
		}else {
			System.out.println("this number is not a prime number : "+number);
		}
	}
	public static void main(String[] args) {
		String str = "sharwans";
		List<String> stringList = Arrays.asList(str.split(""));
		Map<String, Long> stringMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(stringMap.getClass().getName());
		System.out.println("occurance of each character : "+stringMap);
		
		List<String> duplicateString = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(f->f.getValue()>1L).map(m->m.getKey()).collect(Collectors.toList());
		System.out.println("duplicateString : "+duplicateString);
		
		List<String> uniqueString = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(f->f.getValue()==1L).map(m->m.getKey()).collect(Collectors.toList());
		System.out.println("uniqueString : "+uniqueString);
		
		String firstNonRepeatedCharacer = stringList.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(f->f.getValue()==1L).map(m->m.getKey()).findFirst().get();
		System.out.println("firstNonRepeatedCharacer : "+firstNonRepeatedCharacer);

		checkNumberIsPrimeOrNot(19);
		checkNumberIsPrimeOrNot(21);
		printPrimeNumber(100);
	}

}
