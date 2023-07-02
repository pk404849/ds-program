package com.org;

public class RemoveAlternateInTheList {
	Node head;

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

	public void deleteAlternateNodeInTheList() {
		Node c1 = head;
		while (c1 != null && c1.next != null) {
			c1.next = c1.next.next;
			c1 = c1.next;
		}
	}

	public static void main(String[] args) {
		RemoveAlternateInTheList list = new RemoveAlternateInTheList();
		for (int i = 1; i <= 10; i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("delete alternate node in the list");
		list.deleteAlternateNodeInTheList();
		list.displayList();
	}

}
