package com.org.stack;

import java.util.Stack;

public class InfixToPostfixExample_1 {

	public static int getPriority(char ch) {
		int result = 0;
		switch (ch) {
		case '+':
		case '-':
			result = 1;
			break;
		case '*':
		case '/':
			result = 2;
			break;
		case '^':
			result = 3;
			break;
		default:
			result = -1;
		}
		return result;
	}

	public static void infixToPostfixExp(String str) {
		String postfixExp = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				postfixExp = postfixExp + ch;
				continue;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfixExp = postfixExp + stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && getPriority(ch) <= getPriority(stack.peek())) {
					postfixExp = postfixExp + stack.peek();
					stack.pop();
				}
				stack.push(ch);
			}
		}

		while (!stack.isEmpty()) {
			postfixExp = postfixExp + stack.peek();
			stack.pop();
		}

		System.out.println("Postfix Exp : " + postfixExp);
	}

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for(int i=0;i<length/2;i++) {
			char ch = charArray[i];
			charArray[i] = charArray[length-1-i];
			charArray[length-1-i] = ch;
		}
		return String.valueOf(charArray);
	}
	
	public static void infixToPrefix(String str) {
		String prefixExp = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				prefixExp = prefixExp + ch;
				continue;
			} else if (ch == ')') {
				stack.push(ch);
			} else if (ch == '(') {
				while (!stack.isEmpty() && stack.peek() != ')') {
					prefixExp = prefixExp + stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && getPriority(ch) < getPriority(stack.peek())) {
					prefixExp = prefixExp + stack.peek();
					stack.pop();
				}
				stack.push(ch);
			}
		}

		while (!stack.isEmpty()) {
			prefixExp = prefixExp + stack.peek();
			stack.pop();
		}
String finalOutputExp = reverseString(prefixExp);
		System.out.println("Prefix Exp : " + finalOutputExp);
	}
	public static void main(String[] args) {
		String exp[] = { "A*B-(C+D)+E", "((A+B)-C*(D/E))+F", "(A+B)*C-(D-E)*(F+G)", "(((A+B)*C)-((D-E)*(F+G)))",
				"A+B*C/D-F+A^E" };
		for (int i = 0; i < exp.length; i++) {
			System.out.println("Infix Exp : "+exp[i]);
			System.out.println("Reverse : "+reverseString(exp[i]));
			infixToPostfixExp(exp[i]);
			//prefix
			String reverseString = reverseString(exp[i]);
			infixToPrefix(reverseString);
			
		}

	}
}
