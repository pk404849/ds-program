package com.org;

//	Make middle node head in a linked list
public class MakeMiddleNodeHeadInTheList {

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

	// 1 2 3 4 5
	public void makeMiddleNodeHeadInTheList() {

		Node c1 = head;
		Node c2 = head;
		Node prev=null;
		while (c2!= null && c2.next != null) {
			prev = c1;
			c1 = c1.next;
			c2 = c2.next.next;
		}
		prev.next = prev.next.next;
		c1.next = head;
		head = c1;
	}
	
	public static void main(String[] args) {
		MakeMiddleNodeHeadInTheList list = new MakeMiddleNodeHeadInTheList();
		for (int i = 1; i <= 5; i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("make middle node head in the list");
		list.makeMiddleNodeHeadInTheList();
		list.displayList();
	}

}
