package com.org.stack;

import java.util.Stack;

public class InfixToPrefixConversion {

	public static int getOperatorPriority(char ch) {

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

	public static String infixToPrefixConversion(String string) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				result = result + ch;
			} else if (ch == ')') {
				stack.push(ch);
			} else if (ch == '(') {
				while (!stack.isEmpty() && stack.peek() != ')') {
					result = result + stack.peek();
					stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && getOperatorPriority(ch) < getOperatorPriority(stack.peek())) {
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

	public static String reverseExpression(String str) {

		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length / 2; i++) {
			char ch = charArray[i];
			charArray[i] = charArray[length - 1 - i];
			charArray[length - 1 - i] = ch;
		}

		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String exp[] = { "A*B-(C+D)+E","x+y*z/w+u", "((A+B)-C*(D/E))+F", "(A+B)*C-(D-E)*(F+G)", "(((A+B)*C)-((D-E)*(F+G)))",
				"A+B*C/D-F+A^E","K+L-M*N+(O^P)*W/U/V*T+Q" };
		for (int i = 0; i < exp.length; i++) {
			String reverseInfixExp = reverseExpression(exp[i]);
			System.out.println("Infix expression  : " + exp[i]);
			String resultInfixExp = infixToPrefixConversion(reverseInfixExp);
			String originInfixExp = reverseExpression(resultInfixExp);
			System.out.println("Prefix expression : "+originInfixExp);
			System.out.println("====================================================");
		}

	}

}
