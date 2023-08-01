package com.org.stack;

public class StackOperation {

	int max = 6;
	int top = -1;
	int stack[] = new int[max];

	public void push(int data) {
		if (top >= max - 1) {
			System.out.println("stack is overflow....");
		} else {
			stack[++top] = data;
		}
	}

	public void printStack() {
		if (top < 0) {
			System.out.println("stack is empty.......");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
		}
		System.out.println();
	}

	public void pop() {
		if (top < -1) {
			System.out.println("stack is underflow...");
		} else {
			int value = stack[top--];
			System.out.println(value + ":  popped from the stack");
		}
	}

	public void peek() {
		if (top < -1) {
			System.out.println("stack is underflow.....");
		} else {
			int value = stack[top];
			System.out.println(value + " : peeked from stack");
		}
	}

	public static void main(String[] args) {

		StackOperation s = new StackOperation();
		s.push(10);
		s.push(30);
		s.push(20);
		s.push(50);
		s.push(60);
		s.push(40);

		System.out.println("stack element is ");
		s.printStack();
		System.out.println("element poped from the stack");
		s.pop();
		System.out.println("element peeked from the stack");
		s.peek();
	}

}
