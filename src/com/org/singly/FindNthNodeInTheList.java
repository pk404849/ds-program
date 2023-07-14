package com.org.singly;
//Write a function to get Nth node in a Linked List
public class FindNthNodeInTheList {

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
	
	public void findNthNodeInTheList(int position) {
		int ctr=1;
		Node current = head;
		while(current != null) {
			if(ctr == position) {
				break;
			}
			ctr++;
			current = current.next;
		}
		System.out.print(current.data+" ");
	}
	public static void main(String[] args) {
		FindNthNodeInTheList list = new FindNthNodeInTheList();
		for(int i=1;i<10;i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("Find nth node in the list");
		list.findNthNodeInTheList(4);
	}

}
