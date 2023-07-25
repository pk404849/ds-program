package com.org.interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintPrimeNumberUsingStream {

	//generate prime number till the give number
	public static List<Integer> printPrimeNumber(int number, int number2){
		
		return IntStream.range(number,number2)
				.filter(f->isPrime(f)).boxed().collect(Collectors.toList());
	}
	
	//check number is prime or not using java 8
	public static boolean isPrime(int number) {
		return number >1 && IntStream.range(2, number/2)
				.noneMatch(i->number%i == 0);
	}
	
	public static void main(String[] args) {

//		boolean isPrime = isPrime(9);
//		if(isPrime) {
//			System.out.println("prime number");
//		}else {
//			System.out.println("not prime number");
//		}
		System.out.println(printPrimeNumber(100,200));
	}

}
