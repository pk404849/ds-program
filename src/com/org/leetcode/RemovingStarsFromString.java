package com.org.leetcode;

import java.util.Stack;

public class RemovingStarsFromString {

	public static String removeStarFromString(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				stack.push(ch);
				continue;
			} else if (!stack.isEmpty() && ch == '*') {
				stack.pop();
			}
		}
		String result = "";
		for (Character str : stack) {
			result = result + str;
		}
		return result;
	}

	public static void main(String[] args) {
		// String str = "leet**cod*e";
		String str = "erase*****";

		System.out.println(removeStarFromString(str));
	}

}
