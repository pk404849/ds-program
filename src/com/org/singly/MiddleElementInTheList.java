package com.org.singly;
//	Print the middle of a given linked list
public class MiddleElementInTheList {
	
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
	
	public void printMiddleElementInTheList() {
		Node c1 = head;
		Node c2 = head;
		while(c2 != null && c2.next != null) {
			c1 = c1.next;
			c2 = c2.next.next;
		}
		System.out.println("Middle element in the list is : "+ c1.data);
	}
	public static void main(String[] args) {
		
		MiddleElementInTheList list = new MiddleElementInTheList();
		for(int i=1;i<=10;i++) {
			list.createList(i);
		}
		list.displayList();
		list.printMiddleElementInTheList();

	}

}
