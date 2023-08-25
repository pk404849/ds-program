package com.org.stack;

import java.util.Stack;

public class ArithmeticExpressionEvaluation {

	public static int getPeriority(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public static String infixToPostfixExpression(String infixExp) {
		String postfixExp = "";
		Stack<Character> stack = new Stack<>();
		int length = infixExp.length();
		for (int i = 0; i < length; i++) {
			char ch = infixExp.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				postfixExp += ch;
				continue;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfixExp += stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && getPeriority(ch) <= getPeriority(stack.peek())) {
					postfixExp += stack.peek();
					stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			postfixExp += stack.peek();
			stack.pop();
		}
		return postfixExp;
	}

	public static int calculateArithmeticOperationFromInfixExpression(String postfixExpression) {
		int length = postfixExpression.length();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < length; i++) {
			char ch = postfixExpression.charAt(i);
			if (Character.isDigit(ch)) {
				stack.push(Character.getNumericValue(ch));
				continue;
			} else if(!stack.isEmpty()) {
				Integer value1 = stack.pop();
				Integer value2 = stack.pop();
				int result = 0;
				switch (ch) {
				case '+':
					result = value2 + value1;
					stack.push(result);
					break;
				case '-':
					result = value2 - value1;
					stack.push(result);
					break;
				case '*':
					result = value2 * value1;
					stack.push(result);
					break;
				case '/':
					result = value2 / value1;
					stack.push(result);
					break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String infixExpression = "(4-2)*(8-6)";
		System.out.println("First changes by balak.");
		System.out.println("Second changes by balak");
		System.out.println("Third changes by balak.");
		System.out.println("first changes by prince");
		System.out.println("second chenage by prince");
		System.out.println("Infix Expression   : " + infixExpression);
		String postfixExpression = infixToPostfixExpression(infixExpression);
		System.out.println("Postfix Expression : " + infixToPostfixExpression(postfixExpression));
		int finalResult = calculateArithmeticOperationFromInfixExpression(postfixExpression);
		System.out.println("Arithmetic Operation result : " + finalResult);
	}

}
