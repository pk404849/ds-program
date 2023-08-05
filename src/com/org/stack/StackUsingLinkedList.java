package com.org.stack;

public class StackUsingLinkedList {

	public Node top;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void push(int data) {

		Node n1 = new Node(data);

		if (top == null) {

			top = n1;

		} else {

			n1.next = top;
			top = n1;
		}

	}

	public void display() {
		Node current = top;
		if (top == null) {
			System.out.println("Stack is in underflow.....");
		} else {
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public void pop() {

		if (top == null) {
			System.out.println("Stack is in underflow..........");
		} else {

			System.out.println(top.data);
			Node temp = top;
			top = top.next;
			temp.next = null;
			temp = null;

		}

	}

	public int peek() {
		int value = 0;
		if (top == null) {
			System.out.println("Stack is in underflow........");
		} else {
			value = top.data;
		}
		return value;
	}

	public static void main(String[] args) {
		StackUsingLinkedList l1 = new StackUsingLinkedList();
		l1.push(23);
		l1.push(11);
		l1.push(56);
		l1.push(90);
		l1.push(2);

		System.out.println("Display stack element........");
		l1.display();

		System.out.println("Pop operation of stack........");

		l1.pop();

		System.out.println("Display after pop operation.....");

		l1.display();
		System.out.println("Peek value of stack - " + l1.peek());

	}

}
