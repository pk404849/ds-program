package com.org.leetcode;

import java.util.Stack;

public class BackspaceStringCompare {
	public static boolean backspaceCompare(String s, String t) {
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		String result1 = "";
		String result2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				stack1.push(ch);
				continue;
			} else if (ch == '#' && !stack1.isEmpty()) {
				stack1.pop();
			}
		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if (Character.isAlphabetic(ch)) {
				stack2.push(ch);
				continue;
			} else if (ch == '#' && !stack2.isEmpty()) {
				stack2.pop();
			}
		}

		for (Character c1 : stack1) {
			result1 = c1 + result1;
		}
		for (Character c2 : stack2) {
			result2 = c2 + result2;
		}
		return result1.equals(result2);
	}

	public static void main(String[] args) {

		// String s = "ab#c", t = "ad#c";
		 String s = "ab##", t = "c#d#";
		//String s = "a#c", t = "b";
		System.out.println(backspaceCompare(s, t));
	}

}
