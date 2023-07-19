package com.org.singly;

import java.util.Stack;

public class LinkedListPalindrtomeCheck {

	Node head;
	Stack<Integer> stack = new Stack<>(); // int arr[] new int [10];

	class Node {
		int data;
		Node next = null;

		Node(int data) {
			this.data = data;
		}
	}

	public void createList(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void displayList() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	// 1 3 2 4 1
	public void checkPalindromeList() {
		if (head != null) {
			Node current = head;
			pushDataIntoStack();
			boolean flag = false;
			while (current != null) {
				int popData = stack.pop();
				if (popData == current.data) {
					flag = true;
				} else {
					flag = false;
					break;
				}
				current = current.next;
			}
			if (flag) {
				System.out.println("Linked List is palindrome");
			} else {
				System.out.println("Linked List is not palindrome");
			}
		}
	}

	public void pushDataIntoStack() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				stack.push(current.data);
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {

		LinkedListPalindrtomeCheck list = new LinkedListPalindrtomeCheck();

		list.createList(1);
		list.createList(2);
		list.createList(3);
		list.createList(4);
		list.createList(3);
		list.createList(1);
		// list.createList(1);

		list.displayList();
		list.checkPalindromeList();

	}

}
