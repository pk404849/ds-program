package com.org;

public class ReverseStringUsingRecursion {

	public static String reverseString(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {

		String str = "prince";
		String reverseString = reverseString(str);
		System.out.println(reverseString);
	}

}
