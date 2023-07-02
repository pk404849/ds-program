package com.org;
//	Identical Linked Lists
public class IdenticalList {

	Node head;

	class Node {
		int data;
		Node next;

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
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void identicalList(IdenticalList l1, IdenticalList l2) {
		Node c1 = l1.head;
		Node c2 = l2.head;
		while (c1 != null && c2 != null) {
			if (c1.data != c2.data) {
				break;
			}
			c1 = c1.next;
			c2 = c2.next;
		}
		if (c1 == null && c2 == null) {
			System.out.println("both list are identical");
		} else {
			System.out.println("both list are not identical");
		}
	}

	public static void main(String[] args) {

		IdenticalList l1 = new IdenticalList();
		IdenticalList l2 = new IdenticalList();
		for (int i = 1; i <= 10; i++) {
			l1.createList(i);
		}
		for (int i = 1; i <= 10; i++) {
			l2.createList(i);
		}
		System.out.println("list one data");
		l1.displayList();
		System.out.println("list two data");
		l2.displayList();
		System.out.println("identical list");
		l1.identicalList(l1, l2);

	}

}
