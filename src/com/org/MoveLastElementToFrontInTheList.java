package com.org;

//	Move last element to front of a given Linked List

public class MoveLastElementToFrontInTheList {

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
	public void moveLastElementToFrontInTheList() {
		
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next.next = head;
		head = current.next;
		current.next = null;
	}
	
	public static void main(String[] args) {
		
		MoveLastElementToFrontInTheList list = new MoveLastElementToFrontInTheList();

		for(int i=1;i<=10;i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("Move last element to from of the list");
		list.moveLastElementToFrontInTheList();
		list.displayList();
	}

}
