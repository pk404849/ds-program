package com.org.stack;

import java.util.Stack;

public class InfixToPostfix {
	public static int checkOperatorPrecedence(char ch) {
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

	public static String infixToPostfix(String exp) {
		//String exp = "A*B-(C+D)+E";
		String postfixExpression = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				postfixExpression = postfixExpression + ch;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfixExpression = postfixExpression + stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && checkOperatorPrecedence(ch) <= checkOperatorPrecedence(stack.peek())) {
					postfixExpression = postfixExpression + stack.peek();
					stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			postfixExpression = postfixExpression + stack.peek();
			stack.pop();
		}
		return postfixExpression;

	}

	public static void main(String[] args) {
		//String exp = "A*B-(C+D)+E";
		//String exp = "((A+B)-C*(D/E))+F";

		//String exp = "(A+B)*C-(D-E)*(F+G)";
		//String exp = "(((A+B)*C)-((D-E)*(F+G)))"; 
		String exp = "A+B*C/D-F+A^E";
		System.out.println("infix expression : "+exp);
		System.out.println("postfix expression : "+infixToPostfix(exp));
	}

}
