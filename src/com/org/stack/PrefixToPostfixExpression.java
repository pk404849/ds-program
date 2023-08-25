package com.org.stack;

import java.util.Stack;

public class PrefixToPostfixExpression {

	public static boolean isOperand(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}

	public static String prefixToInfixExpression(String prefixExpression) {
		Stack<String> stack = new Stack<>();
		int length = prefixExpression.length();

		for (int i = length - 1; i >= 0; i--) {
			char ch = prefixExpression.charAt(i);
			if (Character.isAlphabetic(ch)) {
				stack.push(ch + "");
			} else if (!stack.isEmpty()) {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				String temp = operand1 + operand2 + ch;
				stack.push(temp);
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {

		String prefixExpression = "+-*AB+CDE";
		System.out.println("Prefix Expression  : " + prefixExpression);
		String postfixExpression = prefixToInfixExpression(prefixExpression);
		System.out.println("Postfix Expression : " + postfixExpression);
	}

}
