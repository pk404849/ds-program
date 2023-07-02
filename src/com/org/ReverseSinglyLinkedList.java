package com.org;

public class ReverseSinglyLinkedList {

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

	public void reverseList() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		if(prev !=null) {
			head = prev;
		}
	}
	public static void main(String[] args) {

		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		for(int i=1;i<10;i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("reverse of the list");
		list.reverseList();
		list.displayList();
	}

}
