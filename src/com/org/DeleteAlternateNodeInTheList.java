package com.org;

//	Delete alternate nodes of a Linked List
public class DeleteAlternateNodeInTheList {

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
	// 1 2 3 4 5 6 
	//1 3 5 
	public void deleteAlternateNodeInTheList() {
		
		Node current = head;
		while(current != null && current.next != null) {
			current.next = current.next.next;
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		DeleteAlternateNodeInTheList list = new DeleteAlternateNodeInTheList();
		for(int i=1;i<=11;i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("Delete alternate node in the list");
		list.deleteAlternateNodeInTheList();
		list.displayList();
	}

}
