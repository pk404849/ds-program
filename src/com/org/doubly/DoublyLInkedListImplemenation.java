package com.org.doubly;

public class DoublyLInkedListImplemenation {

	Node head;
	class Node{
		int data;
		Node prev=null;
		Node next=null;
		Node(int data){
			this.data = data;
		}
	}
	
	public void createDoublyList(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next=newNode;
			newNode.prev = current;
		}
	}
	
	public void displayDoublyList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	// 1 2 3 
	  //4
	public void insertBeginningOfTheList(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	// 1 2 3 4 5
	
	public void insertLastOfTheList(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}
	// 1 2 6 3 4 5
	      
	public void insertBetweenOfTheList(int data, int pos) {
		Node newNode = new  Node(data);
			int ctr=1;
			Node current = head;
			while(current.next != null) {
				if(ctr == pos) {
					break;
				}
				ctr++;
				current = current.next;
			}
			newNode.next = current.next;
			current.next.prev = newNode;
			newNode.prev = current;
			current.next = newNode;
	}
	
	public void deleteBeginningOfThedoublyList() {
		if(head != null) {
			head = head.next;
			head.prev = null;
		}
	}
	public static void main(String[] args) {

		DoublyLInkedListImplemenation list = new DoublyLInkedListImplemenation();
		
		for(int i=1;i<=10;i++) {
			list.createDoublyList(i);
		}
		list.displayDoublyList();
		System.out.println("insert beginning of the list");
		list.insertBeginningOfTheList(11);
		list.displayDoublyList();
		System.out.println("insert end of the list");
		list.insertLastOfTheList(12);
		list.displayDoublyList();
		System.out.println("insert between of the list");
		list.insertBetweenOfTheList(13, 2);
		list.displayDoublyList();
		System.out.println("delete beginning of the list");
		list.deleteBeginningOfThedoublyList();
		list.displayDoublyList();
	}

}
