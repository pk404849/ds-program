package com.org.circular;

public class CircularLinkedListOperation {

	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public void createCircularList(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head; 
		}else {
			Node current = head;
			while(current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
		}
	}
	public void displayCircularList() {
		if(head != null) {
			Node current = head;
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}
	// 1 2 3 4 
	public void insertBeginningOfTheCircularList(int data) {
		Node newNode = new Node(data);
		if(head != null) {
			Node current = head;
			while(current.next != head) {
				current = current.next;
			}
			newNode.next = head;
			head = newNode;
			current.next = head;
		}
	}
// 1->200	
	
	public void reverseCircularLinkedList() {
		if(head != null) {
			Node current = head;
			Node prev = null;
			Node next = null;
			do {
				next = current.next;
				current.next=prev;
				prev = current;
				current = next;
			}while(current != head);
			if(prev !=null) {
				head = prev;
			}
			current.next = head;
		}
	}
	public static void main(String[] args) {
		
		CircularLinkedListOperation list = new CircularLinkedListOperation();
		for(int i=1;i<10;i++) {
			list.createCircularList(i);
		}
		list.displayCircularList();
		System.out.println("insert beginning of the list");
		list.insertBeginningOfTheCircularList(11);
		list.displayCircularList();
		System.out.println("reverse of the circular list");
		list.reverseCircularLinkedList();
		list.displayCircularList();
	}

}
