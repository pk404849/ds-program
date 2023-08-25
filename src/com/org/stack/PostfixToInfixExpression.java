package com.org.stack;

import java.util.Stack;

public class PostfixToInfixExpression {

	public static String postfixToInfixExpression(String postfixExpression) {
		Stack<String> stack = new Stack<>();
		int length = postfixExpression.length();
		for (int i = 0; i < length; i++) {
			char ch = postfixExpression.charAt(i);
			if (Character.isAlphabetic(ch)) {
				stack.push(ch + "");
			} else {
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				String temp = "("+ operand2 + ch + operand1 +")" ;
				stack.push(temp);
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		
		String postfixExpression = "AB*CD+-E+";
		System.out.println("Postfix Expression : "+ postfixExpression);
		String infixExpression = postfixToInfixExpression(postfixExpression);
		System.out.println("Infix Expression : "+ infixExpression);
	}
}
