package com.org.leetcode;

public class RemoveOutermostParentheses {

	public static String removeOutermostParentheses(String str) {
		String res = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' && count++ > 0)
				res += ch;
			if (ch == ')' && count-- > 1)
				res += ch;
		}
		return res;
	}

	public static void main(String[] args) {

		String str[] = { "(()())(())", "(()())(())(()(()))", "()()" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(removeOutermostParentheses(str[i]));
		}

	}

}
