package com.org;

//	Add 1 to a number represented as linked list
public class AddOneInTheLinkedList {

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
	
	public void addingNumberIntoTheList(int number) {
		Node current = head;
		while(current != null) {
			current.data = current.data+number;
			current = current.next;
		}
	}
	public static void main(String[] args) {
		
		AddOneInTheLinkedList list = new AddOneInTheLinkedList();
		for(int i=1;i<=10;i++) {
			list.createList(i);
		}
		list.displayList();
		
		System.out.println("adding one into the list");
		list.addingNumberIntoTheList(1);
		list.displayList();
	}

}
