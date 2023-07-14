package com.org.doubly.leetcode;

public class FindMiddleInTheList {
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
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public int findMiddleElementInTheList() {

		if (head != null) {
			Node slow = head;
			Node fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;
		}
		return 0;
	}

	public static void main(String[] args) {

		FindMiddleInTheList list = new FindMiddleInTheList();
		for (int i = 1; i <= 13; i++) {
			list.createList(i);
		}
		list.displayList();

		System.out.println("Middle element of the list : " + list.findMiddleElementInTheList());
	}

}
