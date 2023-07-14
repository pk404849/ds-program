package com.org.leetcode;

public class ReverseLinkedList {
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
	
	public void reverseLinkedList() {
		if(head != null) {
			Node current = head;
			Node next = null;
			Node prev = null;
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			if(prev != null) {
				head = prev;
			}
		}
	}
	public static void main(String[] args) {

		ReverseLinkedList list = new ReverseLinkedList();
		
		for(int i=1;i<=10;i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("reverse of the list");
		list.reverseLinkedList();
		list.displayList();
	}

}
