package com.org.stack;

import java.util.Stack;

public class PrefixToInfixConverstion {

	public static boolean isOperator(char ch) {
		switch (ch) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
		case '%':
			return true;
		}
		return false;
	}

	public static String prefixToInfixConversion(String prefix) {
		Stack<String> stack = new Stack<>();
		int length = prefix.length();
		for (int i = length - 1; i >= 0; i--) {
			char ch = prefix.charAt(i);
			if (isOperator(ch)) {
				String value1 = stack.pop();
				String value2 = stack.pop();
				String temp = "(" + value1 + ch + value2 + ")";
				stack.push(temp);
			} else {
				stack.push(ch + "");
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String prefix = "*-A/BC-/AKL";
		// Infix : ((A-(B/C))*((A/K)-L))
		System.out.println("Prfix : " + prefix);
		String infix = prefixToInfixConversion(prefix);
		System.out.println("Infix : " + infix);

	}

}
