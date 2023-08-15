package com.org.stack;

import java.util.Stack;

public class InfixToPostfixExample {

	public static int operatorPriority(char ch) {
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

	public static String infixToPostfixConversion(String infixExp) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < infixExp.length(); i++) {
			char ch = infixExp.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				result = result + ch;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result = result + stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && operatorPriority(ch) <= operatorPriority(stack.peek())) {
					result = result + stack.peek();
					stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			result = result + stack.peek();
			stack.pop();
		}
		return result;
	}

	public static void main(String[] args) {

		String exp[] = { "A*B-(C+D)+E", "((A+B)-C*(D/E))+F", "(A+B)*C-(D-E)*(F+G)", "(((A+B)*C)-((D-E)*(F+G)))",
				"A+B*C/D-F+A^E" };
		for (int i = 0; i < exp.length; i++) {
			System.out.println(infixToPostfixConversion(exp[i]));
		}
	}

}
