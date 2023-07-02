package com.org;

//	Nth node from the end of a Linked List
public class FindNthNodeFromLastInTheList {

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
	
	public void findNthNodeFromLastInTheList(int position) {
		Node current = head;
		int length = 0;
		while(current != null) {
			current = current.next;
			length++;
		}
	
		current = head;
		for(int i=1;i<= length-position;i++) {
			current = current.next;
		}
		System.out.print(current.data+" ");
	}
	
	public static void main(String[] args) {
		
		FindNthNodeFromLastInTheList list = new FindNthNodeFromLastInTheList();
		for(int i=1;i<10;i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("find nth element from last in the list");
		list.findNthNodeFromLastInTheList(3);
	}

}
