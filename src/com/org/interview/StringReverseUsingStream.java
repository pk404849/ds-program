package com.org.interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverseUsingStream {

	public static void main(String[] args) {

		String str = "this is a boy he is staying in bangalore";
		System.out.println("original String : " + str);
		String reverse = Stream.of(str).map(m -> new StringBuilder(m).reverse()).collect(Collectors.joining(" "));
		System.out.println("Reverse String : " + reverse);

	}

}
