package com.org.stack;

import java.util.Stack;

public class BalanceSymbolUsingStack {

	public static boolean balanceSymbol(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			}
			char popped = '0';
			switch (ch) {
			case ')':
				popped = stack.pop();
				if (popped == '{' || popped == '[') {
					return false;
				}
				break;

			case '}':
				popped = stack.pop();
				if (popped == '(' || popped == '[') {
					return false;
				}
				break;

			case ']':
				popped = stack.pop();
				if (popped == '(' || popped == '{') {
					return false;
				}

			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String str = "[()]{}{[()()]()}";
		// String str ="[()]";

		boolean isTrue = balanceSymbol(str);
		if (isTrue) {
			System.out.println("Symbol is balanced : " + str);
		} else {
			System.out.println("Symbol is not balanced : " + str);
		}
	}

}
