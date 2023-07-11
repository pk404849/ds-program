package com.org.doubly;

public class DoublyLInkedListImplemenation {

	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
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
		// 5 4 2 1
	}
	
	public void displayDoublyList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {

		DoublyLInkedListImplemenation list = new DoublyLInkedListImplemenation();
		
		for(int i=1;i<=10;i++) {
			list.createDoublyList(i);
		}
		list.displayDoublyList();
	}

}
